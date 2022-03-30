package com.coding404.myweb.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding404.myweb.command.PracticeVO;

@Service("practiceService")
public class PracticeServiceImpl implements PracticeService {

	@Autowired
	
	@Override
	public int regist(PracticeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
