import projectmanager.Person
import projectmanager.Project
import projectmanager.Task

class BootStrap {

    def init = { servletContext ->
		def johnWorker = new Person(name: "John").save(failOnError: true)
		def samWorker = new Person(name: "Sam").save(failOnError: true)
		
		def project1 = new Project(
				name: "Project 1",
				details: "Get bootstrap up")
		project1.addToWorkers(johnWorker)
		project1.addToWorkers(samWorker)
		project1.save(failOnError: true)
		
    }
    def destroy = {
    }
}
