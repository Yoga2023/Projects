package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Add_To_Cart_Page;
import com.pom.Address_Page;
import com.pom.Blouse;
import com.pom.Cart_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment_Page;
import com.pom.Proceed_Page;
import com.pom.Quality_increase;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;
import com.pom.Women_Page;

public class Page_Object_Manager {
public static WebDriver driver;
	private  Home_Page hp;
	private Login_Page lp;
	private Women_Page w;
	private Cart_Page adp;
	private Blouse b;
	private Quality_increase qc;
	private Add_To_Cart_Page atcp ;
	private Proceed_Page pp;
	private Summary_Page sp;
	private Address_Page ap;
	private Shipping_Page spp;
	private Payment_Page ppp;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_Page getHp() {
		 hp=new Home_Page(driver);
		return hp;
	}
	public Login_Page getLp() {
		lp =new Login_Page(driver);
		return lp;
	}
	public  Women_Page getW() {
		w=new Women_Page(driver);
		return w;
	}
	public  Cart_Page getAdp() {
		adp = new Cart_Page(driver);
		return adp;
	}
	public Blouse getb() {
		b=new Blouse(driver);
		return b;
	}
	
	public  Quality_increase getQc() {
		qc=new Quality_increase(driver);
		return qc;
	}
	public  Add_To_Cart_Page getAtcp() {
		atcp=new Add_To_Cart_Page(driver);
		return atcp;
	}
	public  Proceed_Page getPp() {
		pp =new Proceed_Page(driver);
		return pp;
	}
	public  Summary_Page getSp() {
		sp=new Summary_Page(driver);
		return sp;
	}
	public  Address_Page getAp() {
		ap=new Address_Page(driver);
		return ap;
	}
	public  Shipping_Page getSpp() {
		spp=new  Shipping_Page(driver);
		return spp;
	}
	public  Payment_Page getPpp() {
		ppp=new Payment_Page(driver);
		return ppp;
	}
	
	
	
	
}
