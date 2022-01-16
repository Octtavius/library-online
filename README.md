Library Online

Technologies used

	DB
	Postgres is used as the main database. 
	Currently Postgres with H2 is used for development.
	
		INSTALL POSTGRES with Docker
			Remember: this is for using in development. It is not recommended to install and manage db with Docker

			Use this link as reference to install postgres with Docker. https://wkrzywiec.medium.com/database-in-a-docker-container-how-to-start-and-whats-it-about-5e3ceea77e50
			In docker run the Docker file using this command (Notice the dot at the end of the command)
					docker build -t my-postgres-image .
			Then start the container using this command:
					docker run -d --name my-postgres-container -p 5432:5432 my-postgres-image

	DOCKER
	Postgres docker image is used to install locally a postgres db for dev and testing. See DB INSTALLATION section.
	
	


