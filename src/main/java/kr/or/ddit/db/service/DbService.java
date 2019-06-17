package kr.or.ddit.db.service;

import java.util.List;

import kr.or.ddit.db.dao.DbDao;
import kr.or.ddit.db.dao.IDbDao;
import kr.or.ddit.db.model.DbVO;

public class DbService implements IDbService {

	IDbDao dao = new DbDao();
	@Override
	public List<DbVO> selectDbList() {
		List<DbVO> list = dao.selectDbList();
		return list;
	}

}
