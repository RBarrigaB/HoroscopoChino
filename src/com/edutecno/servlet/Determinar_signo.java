package com.edutecno.servlet;

import com.edutecno.dto.Horoscopo;

public class Determinar_signo {

       
	public Horoscopo determinar_signo(int year) {
		int i=0;
		
		Horoscopo horo_user= new Horoscopo();
		
		for(i=1900; i<=year; i+=12) {
			
			if(year == i) {
				horo_user.setSigno("Rata");
			
			if(year%10 == 0 || year%10 == 1) {
				horo_user.setElemento("Metal");
				break;
			}
			else if(year%10 == 2 || year%10 == 3) {
				horo_user.setElemento("Agua");
				break;
			}
			else if(year%10 == 4 || year%10 == 5) {
				horo_user.setElemento("Madera");
				break;
			}
			else if(year%10 == 6 || year%10 == 7) {
				horo_user.setElemento("Fuego");
				break;
			}
			else if(year%10 == 8 || year%10 == 9) {
				horo_user.setElemento("Tierra");
				break;
			}
			}
			else if(year == i+1) {
				horo_user.setSigno("Buey");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+2) {
				horo_user.setSigno("Tigre");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+3) {
				horo_user.setSigno("Conejo");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+4) {
				horo_user.setSigno("Dragon");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+5) {
				horo_user.setSigno("Serpiente");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}			}
			if(year == i+6) {
				horo_user.setSigno("Caballo");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+7) {
				horo_user.setSigno("Cabra");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+8) {
				horo_user.setSigno("Mono");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+9) {
				horo_user.setSigno("Gallo");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+10) {
				horo_user.setSigno("Perro");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
			if(year == i+11) {
				horo_user.setSigno("Cerdo");
			
				if(year%10 == 0 || year%10 == 1) {
					horo_user.setElemento("Metal");
					break;
				}
				else if(year%10 == 2 || year%10 == 3) {
					horo_user.setElemento("Agua");
					break;
				}
				else if(year%10 == 4 || year%10 == 5) {
					horo_user.setElemento("Madera");
					break;
				}
				else if(year%10 == 6 || year%10 == 7) {
					horo_user.setElemento("Fuego");
					break;
				}
				else if(year%10 == 8 || year%10 == 9) {
					horo_user.setElemento("Tierra");
					break;
				}
			}
		}
		return horo_user;
	
	}
}
