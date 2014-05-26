package controller;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import entity.MaTable;
import entity.MaTableEntity;

@ManagedBean
@ApplicationScoped
public class MaTableController implements Serializable {
	
	static final Logger LOG = LoggerFactory.getLogger(MaTableController.class);
	
	private static final long serialVersionUID = 7313124572713895547L;

	private MaTable maTable;
	
	public MaTableController() {
		super();
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("monPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		MaTable maTable = entityManager.find(MaTableEntity.class, 1L);
		this.maTable = maTable;
		LOG.debug("Passage dans le bean : MaTableController");
	}

	public MaTable getMaTable() {
		return maTable;
	}

	public void setMaTable(MaTable maTable) {
		this.maTable = maTable;
	}
}
