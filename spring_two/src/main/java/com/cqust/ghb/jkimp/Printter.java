package com.cqust.ghb.jkimp;


import com.cqust.ghb.jk.Ink;
import com.cqust.ghb.jk.Paper;

public class Printter {
	private Ink ink=null;
	private Paper paper=null;

	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print() {
		System.out.println("使用--"+ink.getColor()+"--颜色涂抹在--"+paper.getSize());
	}
}
