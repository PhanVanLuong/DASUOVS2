package com.dasuo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dasuo.dto.TaiKhoanDTO;
import com.dasuo.service.ITaiKhoanService;

@RestController
@RequestMapping("/api")
public class TaiKhoanAPI {
	
	@Autowired
	ITaiKhoanService taiKhoanService;
	@GetMapping("/taikhoans")
	public ResponseEntity<List<TaiKhoanDTO>> getListTaiKhoan(){
		List<TaiKhoanDTO> _taiKhoans = taiKhoanService.getListTaiKhoan();
		if(_taiKhoans!=null)
		{
			return new ResponseEntity<>(_taiKhoans,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/timtaikhoans/{id}")
	public ResponseEntity<List<TaiKhoanDTO>> getTimListGS(@PathVariable("id") String id){
		List<TaiKhoanDTO> _taiKhoans = taiKhoanService.getTimListTaiKhoan(id);
		if(_taiKhoans!=null)
		{
			return new ResponseEntity<>(_taiKhoans,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/taikhoanuutus")
	public ResponseEntity<List<TaiKhoanDTO>> getListTaiKhoanUuTu(){
		List<TaiKhoanDTO> _taiKhoans = taiKhoanService.getListGSNoiBat();
		if(_taiKhoans!=null)
		{
			return new ResponseEntity<>(_taiKhoans,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/taikhoans/{id}")
	public ResponseEntity<TaiKhoanDTO> getTaiKhoan(@PathVariable("id") Integer id){
		TaiKhoanDTO _taiKhoan = taiKhoanService.getTaiKhoan(id);
		if(_taiKhoan!=null)
		{
			return new ResponseEntity<>(_taiKhoan,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/taikhoans")
	public ResponseEntity<TaiKhoanDTO> addTaiKhoan (@RequestBody TaiKhoanDTO taiKhoanDTO) {
		if(taiKhoanDTO!=null)
		{
			taiKhoanService.save(taiKhoanDTO);
			return new ResponseEntity<>(taiKhoanDTO,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		}
	}
	
	@PutMapping("/taikhoans/{id}")
	public ResponseEntity<TaiKhoanDTO> updateTaiKhoan(@RequestBody TaiKhoanDTO taiKhoanDTO,@PathVariable("id") Integer id){
		TaiKhoanDTO _taiKhoanDTO = taiKhoanService.getTaiKhoan(id);
		if(_taiKhoanDTO != null)
		{
			taiKhoanService.save(taiKhoanDTO);
			return new ResponseEntity<>(taiKhoanDTO,HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	@DeleteMapping("/taikhoans/{id}")
	public ResponseEntity<HttpStatus> deleteTaiKhoan(@PathVariable("id") Integer id){
		TaiKhoanDTO _taiKhoanDTO = taiKhoanService.getTaiKhoan(id);
		if(_taiKhoanDTO != null)
		{
			taiKhoanService.delete(id);;
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
		
	}
}
