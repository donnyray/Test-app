package projectmanager

class Person {
	String name
	
	static hasMany =[tasks: Task]
	static belongsTo = [projects: Project]
	
	
    static constraints = {
		name blank: false, unique: true
		projects nullable: true
		tasks nullable: true
    }
	String toString() {
		return name
	}
}
