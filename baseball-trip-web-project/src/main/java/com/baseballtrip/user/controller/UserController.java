package com.baseballtrip.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseballtrip.user.dto.RequestLoginDto;
import com.baseballtrip.user.dto.RequestSignUpDto;
import com.baseballtrip.user.dto.ResponseCheckEmailDto;
import com.baseballtrip.user.dto.ResponseLoginDto;
import com.baseballtrip.user.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// 회원가입
	@PostMapping("/signUp")
	@Tag(name = "회원가입", description = "회원가입 창의 폼 데이터를 기반으로 유저 테이블에 등록합니다.")
	public ResponseEntity<?> signUp(RequestSignUpDto requestSignUpDto) {
		
		int result = 1;
		try {
			
			// userService 호출
			
		} catch (Exception e) {
			
			// 예외 발생 시 
			// 회원 가입 실패
			return ResponseEntity.badRequest().build();
		}
		
		// 회원가입 성공
		return ResponseEntity.created(null).build();
	}

	@GetMapping("/checkEamil/{email}")
	@Tag(name = "이메일 중복 확인", description = "유저 테이블에 해당 이메일로 등록된 유저가 존재하는 지 확인합니다.")
	public ResponseEntity<?> checkEmail(@PathVariable(name = "email") String email) {

		ResponseCheckEmailDto responseCheckEmailDto = null;
		
		// UserService 호출
		// valid - 사용가능 여부
		// msg - 보여줄 메세지
		
		return ResponseEntity.ok(responseCheckEmailDto);
	}

	@PostMapping("/auth/{email}")
	@Tag(name = "이메일 인증 코드 발송", description = "해당 이메일로 이메일 인증 코드를 발송합니다.")
	public ResponseEntity<?> sendAuthCode(@PathVariable(name = "email") String email) {

		// 구글 smtp 사용
		
		return ResponseEntity.ok().build();
	}

	@PostMapping("/auth/check/{code}")
	@Tag(name = "이메일 인증 코드 검증", description = "발송한 이메일 인증 코드와 동일한 지 검증합니다.")
	public ResponseEntity<?> receiveAuthCode(@PathVariable(name = "code") String code) {

		// 구글 smtp 사용
		
		return ResponseEntity.ok().build();
	}

	@PostMapping("/login")
	@Tag(name = "로그인", description = "로그인 폼의 이메일, 비밀번호를 받아 유저가 존재하는 지 확인합니다.")
	public ResponseEntity<?> login(RequestLoginDto requestLoginDto) {

		// 로그인 성공 시
		// 세션? JWT? 넣어서 전달하기
		ResponseLoginDto responseLoginDto;
		
		// 실패 시
		
		return ResponseEntity.ok().build();
	}

	@GetMapping("/logout")
	@Tag(name = "로그아웃", description = "로그인된 유저 정보를 삭제합니다.")
	public ResponseEntity<?> logout() {

		return ResponseEntity.ok().build();
	}

	@GetMapping("/mypage")
	@Tag(name = "마이 페이지", description = "로그인한 유저의 아이디로 유저 테이블의 데이터를 가져옵니다.")
	public ResponseEntity<?> myPage() {

		return ResponseEntity.ok().build();
	}
}
