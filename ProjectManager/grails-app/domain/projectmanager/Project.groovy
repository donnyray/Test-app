package projectmanager

class Project {
	String name
	String details
	Date deadline
	String billType
	
	static hasMany =[tasks: Task, workers: Person]


    static constraints = {
		name blank: false, unique: true
		details blank: false, MaxSize: 1000
		deadline nullable: true, min: new Date()
		billType nullable: true, inList: ["Hourly", "Flat Rate", "Non-Billable"]
    }
	String toString() {
		return name
	}
}
