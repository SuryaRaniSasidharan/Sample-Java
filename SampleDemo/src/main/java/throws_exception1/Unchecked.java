package throws_exception1;

import java.io.IOException;

public class Unchecked {
	
	public static void check() throws IOException
	{
		throw new IOException("Exception found");
	}

	public static void main(String[] args) throws IOException {
		check();

	}

}
