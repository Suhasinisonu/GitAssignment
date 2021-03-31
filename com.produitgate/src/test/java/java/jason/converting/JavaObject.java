package java.jason.converting;

public class JavaObject {
int id = 263;
String name = "Suhasini";
int[] mob = {96639, 884591};

public JavaObject(){
	
}

public JavaObject(int id, String name, int[] mob) {
	super();
	this.id = id;
	this.name = name;
	this.mob = mob;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int[] getMob() {
	return mob;
}

public void setMob(int[] mob) {
	this.mob = mob;
}



}
