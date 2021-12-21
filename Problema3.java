/**********************************************************
Programa que determine:
	- si un producto software puede ser certificable
	- si lo es, que nivel de certificacion obtendria
***********************************************************/

public class Problema3 {
	
	public class Rango{
		// ATRIBUTOS DEL RANGO DE MEDICIONES. LOS VALORES ESTAN DENTRO DEL SISTEMA.
		// CALCULAR ADECUACION FUNCIONAL
		int completitud; //[0-4]
		int correccion; //[0-5]
		int pertinencia; //[0-5]
		// CALCULAR MANTENIBILIDAD
		int modularidad; //[0-4]
		int reusabilidad; //[0-5]
		int analizabilidad; //[0-5]
		int capacidad_serModificado; //[0-5]
		int capacidad_serProbado; //[0-4]
		
		public int getCompletitud() {
			return completitud;
		}
		public int getCorreccion() {
			return correccion;
		}
		public int getPertinencia() {
			return pertinencia;
		}
		public int getModularidad() {
			return modularidad;
		}
		public int getReusabilidad() {
			return reusabilidad;
		}
		public int getAnalizabilidad() {
			return analizabilidad;
		}
		public int getCapacidad_serModificado() {
			return capacidad_serModificado;
		}
		public int getCapacidad_serProbado() {
			return capacidad_serProbado;
		}
	}
	
	public class calidad {
		
		public calidad() {
			
		}
		
	}
		
	public static void main(String[] args) {
		
		// ATRIBUTOS
		int calidad;
		int adecuacion_funcional;
		int mantenibilidad;
		Rango rango;
		boolean certificable;
		
		
		public static void obtenerCertificado (int adecuacion_funcional, int mantenibilidad,
				Rango rango, int calidad, boolean certificable) {
			
			if(rango>=0 && rango<=100) {
				adecuacion_funcional = Math.min(rango.getCompletitud(), rango.getCorreccion(), rango.getPertinencia());
				mantenibilidad = Math.min(rango.getModularidad(), rango.getReusabilidad(), rango.getAnalizabilidad(),
						rango.getCapacidad_serModificado(), rango.getCapacidad_serProbado());
				
				// Se miraria la calidad en la tabla
				int nivel = calidad;
				if(nivel<3) {
					System.out.println("No obtiene el certificado de calidad");
				}
				else 
					System.out.println("Obtiene el certificado de calidad con un nivel: "+nivel);
				
			}
		}

		
	}

}
