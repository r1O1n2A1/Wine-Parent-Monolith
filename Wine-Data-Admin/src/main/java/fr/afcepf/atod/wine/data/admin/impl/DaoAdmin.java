package fr.afcepf.atod.wine.data.admin.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import fr.afcepf.atod.wine.data.admin.api.IDaoAdmin;
import fr.afcepf.atod.wine.data.impl.DaoGeneric;
import fr.afcepf.atod.wine.entity.Admin;

@Service
@Transactional
public class DaoAdmin extends DaoGeneric<Admin, Integer> 
	implements IDaoAdmin {

}
