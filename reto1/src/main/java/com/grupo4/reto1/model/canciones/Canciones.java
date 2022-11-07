package com.grupo4.reto1.model.canciones;

import java.util.Objects;

public class Canciones {
		private Long id;
		private String titulo;
		private String autor;
		private String url;

		public Canciones() { }
		
		public Canciones(Long id, String titulo, String autor, String url) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.autor = autor;
			this.url = url;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		@Override
		public String toString() {
			return "canciones [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", url=" + url + "]";
		}
		

}