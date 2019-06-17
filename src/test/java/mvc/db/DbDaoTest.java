package mvc.db;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.db.dao.DbDao;
import kr.or.ddit.db.dao.IDbDao;
import kr.or.ddit.db.model.DbVO;

import org.junit.Test;

public class DbDaoTest {

	private IDbDao dao = new DbDao();
	
	@Test
	public void selectDbListTest() {
		/***Given***/
		
		/***When***/
		List<DbVO> list = dao.selectDbList();
		/***Then***/
		assertEquals(list.size(), 2);

	}

}
