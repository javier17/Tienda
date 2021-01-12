package com.tienda.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEAnBhEbSO+a/OkSaKICtvJn5rDCurS5kt+JsH63FouJwlXl7Zj\r\n"
			+ "EWzWgOzPUOGPB+1vmz/72hu0vgT6YzOwj7v300iNHF+tzw19826691SzMrSqTjzD\r\n"
			+ "27UUc++OyT37Zvv58BTKMXjBVvj53EoPOY4fkr+9mjpwsWbkj0YYYNK2RVP2q2UX\r\n"
			+ "x1C2wxZOZ7bvr04VQnjuJbUAqNlRW6RHbXROvDvQ/UtdNLR60rGp26ckzFCZQ/Pe\r\n"
			+ "mPsa8JFrfPcKQVNkfuhwCTLZM0WaUpvJ/Wm9dizKAGlcc92g0Kh7NRS006XU+I5I\r\n"
			+ "lBnYmaFwj/S3nVMJCv5IugWzbBNwg4BDYWlufQIDAQABAoIBACpyGuFGr/gw54Ky\r\n"
			+ "dKXnQDtrXRAx7Kl868/kPa//wb8RtkTl7qiFXQrv2iwXOcqhERE5Y+XaVNq7Bc9F\r\n"
			+ "9gQPzAMjHmQRzHSaKZ6xhJvO52+pWwotUeEDq40fHkew2BUX/c4ACT9Mo95fk6oI\r\n"
			+ "ZX10HTfNdeRjcdN7tDkViXmCstfE4WmMvLfAeb1skM2cxCsvUi9ZBK9QmOoVkUbP\r\n"
			+ "zzipTLx7GCw8p8BIEkCmth2rVlcRVm8a8jrTAFc0Rmo4P/SHWhIlc1E1zjGe/B6g\r\n"
			+ "cUvNIVAdiKzqLW9JJZLqW4b+RxVx88+E2sNxIqgbruwUd8YX9aN6Xd6BiB6z3Xz2\r\n"
			+ "7ucLjS0CgYEAz7v8WWfRklg+22UDZ0F2M+2em1DolOfi4diBigZbimwzhqzSru/N\r\n"
			+ "jFBLZPjfWacwA3yaZ4m54L4tskXVyL+msCiGLBJtiaLbWFrVMeISxuBa/3YYhv/X\r\n"
			+ "WnIljw2HDmZC/s7RamDWqT4NbQfqqvuWc/EFFWMQz2m9mJF3CLpo+dsCgYEAwFzE\r\n"
			+ "sM4tQRdrUfCJIV/uTHw9K07iG9/Ifau3Ptqgp51GnGfumpNWgwxZCs1pvskF5uRV\r\n"
			+ "LfHU8Oc8q5rBqwzIFwwNLKsuEcnFsfL/nDnfrItKxt7p7ocqMIiLa5UA7cD9hBpb\r\n"
			+ "imAypj1VtkeI0r8wWrrZC+jMqNJXgdRLVs7mxIcCgYEAq5l1PoGVTBebbO6Hni8k\r\n"
			+ "Loc2gsSWLBNVhwyrDVJtIe55reFrdFjhaewWK8Wt8sg50FeI0MijhHR1GRO5Isi2\r\n"
			+ "MER5eUSLuauPF/CItlky+5fvc6GhZztGMQ+j2QTqsMlmxEgiE4cFK+73dj6Y6j9D\r\n"
			+ "rGjHs0APbdbCaJqZQtuBxgsCgYApoepP+c+BjvgDO/Px7Tk+BIWYofH95mkWCdwX\r\n"
			+ "Fmo+3KMzpqrVeZ33rux2kg6Y5BkK59AnqXdUzDctTMktpA6KLmmLiWDnKKxI3zbD\r\n"
			+ "MSNfzKXadNRcc5SF/IdwOUeCLYqw1KOLR1au9Adg9AqA0jA88sOW+EOTJjMaPkAw\r\n"
			+ "AYegcQKBgFENktYCdHlu+nfNttmVU6KPLg52iVztHpVJGut4Zg458C/h44/HyxCW\r\n"
			+ "nuacnMOISF0qVc5iB8rLDqkl29NB4+pyQS0DOs3sVDKfwHn9Y6NwclAEFdxa2pxs\r\n"
			+ "n3kUKT9PC66YyQXsEzGY/aLGfsolhlg5ixpLN7qzfnS91IOy9Ku7\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	
	
	public static final String RSA_PUBLICA ="-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnBhEbSO+a/OkSaKICtvJ\r\n"
			+ "n5rDCurS5kt+JsH63FouJwlXl7ZjEWzWgOzPUOGPB+1vmz/72hu0vgT6YzOwj7v3\r\n"
			+ "00iNHF+tzw19826691SzMrSqTjzD27UUc++OyT37Zvv58BTKMXjBVvj53EoPOY4f\r\n"
			+ "kr+9mjpwsWbkj0YYYNK2RVP2q2UXx1C2wxZOZ7bvr04VQnjuJbUAqNlRW6RHbXRO\r\n"
			+ "vDvQ/UtdNLR60rGp26ckzFCZQ/PemPsa8JFrfPcKQVNkfuhwCTLZM0WaUpvJ/Wm9\r\n"
			+ "dizKAGlcc92g0Kh7NRS006XU+I5IlBnYmaFwj/S3nVMJCv5IugWzbBNwg4BDYWlu\r\n"
			+ "fQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
