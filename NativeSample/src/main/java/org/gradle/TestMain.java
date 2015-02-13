package org.gradle;

import org.hyperic.sigar.SigarProxy;
import org.hyperic.sigar.SigarProxyCache;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is a text message. pid:>>"+getSigar().getPid());
		
	}
	
	private static SigarProxy sigarProxy;

	public static SigarProxy getSigar() {
		if (sigarProxy == null) {
			sigarProxy = SigarProxyCache.newInstance();
		}
		return sigarProxy;
	}
}
