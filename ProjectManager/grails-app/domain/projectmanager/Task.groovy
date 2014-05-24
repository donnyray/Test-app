package projectmanager

class Task {
	String name
	String details
	Date deadline
	static belongsTo = [projects: Project, workers: Person]

    static constraints = {
		name blank: false, unique: true
		details blank: false, maxSize: 1000
		deadline min: new Date()
		workers nullable: true
    }
	String toString() {
		return name
	}
}
