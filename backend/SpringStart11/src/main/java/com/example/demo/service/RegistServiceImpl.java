package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class RegistServiceImpl implements RegistService {

	@Override
	public String regist() {

		return "レビュー登録が完了しました。";

	}

}
