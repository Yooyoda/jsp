package mvc.db;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.db.model.DbVO;
import kr.or.ddit.db.service.DbService;
import kr.or.ddit.db.service.IDbService;

import org.junit.Test;

public class DbServiceTest {

	IDbService service = new DbService();
	
	@Test
	public void selectDbListTest() {
		/***Given***/
		
		/***When***/
		List<DbVO> list = service.selectDbList();
		/***Then***/
		assertEquals(list.size(), 2);

	}

}
