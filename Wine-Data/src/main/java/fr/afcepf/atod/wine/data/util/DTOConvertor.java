package fr.afcepf.atod.wine.data.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;


public class DTOConvertor {

	// Toutes les methodes sont static et le constructeur prive, cela rends la Classe de type Utilitaire
	//Pas d'instanciation n�c�ssaire et m�me possible
	private DTOConvertor() {
	}

	public static Object convertirEntiteToDTO(Object entite, Object dto) throws Exception{
		BeanUtils.copyProperties(entite, dto);
		Class e = entite.getClass();
		Class d = dto.getClass();
		
		Method[] methods = e.getMethods();
		for (Method method : methods) {
			
			// verif si la methode est un getter d'un objet complexe
			if(isGetter(method) && method.getGenericReturnType().toString().contains("List")){
					dto = copieListe(entite, dto, method);
				}else if(isGetter(method) && method.getGenericReturnType().toString().contains("entity")){
					dto = copieObjetComplexe(entite, dto, method);
				}
			}
		
		return dto;
	}

	public static Object copieObjetComplexe(Object entite,Object dto, Method method) throws Exception{
		Object instance = null;
		if(executerMethode(entite, method.getName().toString(), null)!= null){
			instance = 
					executerMethode(entite, method.getName().toString(), null);
			Object idInstance = 
					executerMethode(instance,"getId"+nomAttributMaj(method.getName()).toString(),null);
			Object[] listeIdInstance = new Object[1];
			listeIdInstance [0] = idInstance;
			executerMethode(dto, "setId"+nomAttributMaj(method.getName()),listeIdInstance);
		}
		return dto;
	}
	
	 public static  Object copieListe(Object entite,Object dto, Method method) throws Exception{
		Object instance = null;
		List<Object> listeRefComplexe = new ArrayList<Object>();
		if(executerMethode(entite, method.getName().toString(), null)!= null){
			instance = 
					executerMethode(entite, method.getName().toString(), null);
			List<Object> liste = new ArrayList<Object>();
			liste = (List<Object>) instance;
			String nomInstance = liste.get(0).getClass().getSimpleName();
			for (Object object : liste) {
				Integer valeurInstance = (Integer)executerMethode(object, "getId"+nomInstance, null);
				listeRefComplexe.add(valeurInstance);
			}
			Object[] listeIdInstance = new Object[1];
			listeIdInstance [0] = listeRefComplexe;
			executerMethode(dto, "setId"+nomAttributMaj(method.getName()),listeIdInstance);
		}
		return dto;
	}
	
	public static Object executerMethode(Object objet, String nomMethode,
			Object[] parametres) throws Exception {
		Object retour;
		Class[] typeParametres = null;
		if (parametres != null) {
			typeParametres = new Class[parametres.length];
			for (int i = 0; i < parametres.length; ++i) {
				typeParametres[i] = parametres[i].getClass();
			}
		}
		
		Method m = objet.getClass().getMethod(nomMethode, typeParametres);

		if (Modifier.isStatic(m.getModifiers())) {

			retour = m.invoke(null, parametres);

		} else {

			retour = m.invoke(objet, parametres);

		}

		return retour;

	}

	public static boolean isGetter(Method method) {
		boolean result = method.getName().startsWith("get")
				&& (method.getParameterTypes().length == 0)
				&& (!Void.class.equals(method.getReturnType()));
		return result;
	}

	public static boolean isSetter(Method method) {
		boolean result = (method.getName().startsWith("set"))
				&& (method.getParameterTypes().length == 1);
		return result;
	}

	public static String nomAttributMaj(String methode){
		String retour = null;
		retour = methode.substring(3);
		return  retour;
	}

	public static String lowerFirstLetter(String mot){
		mot = Character.toLowerCase(mot.charAt(0))+ mot.substring(1);
		return mot; 
	}
}
