package fr.iutvannes.dual.Persistence

class Eleve(var id_eleve : Int, var nom : String, var prenom : String, var classe : String, var date_naissance : String, var password : String){

    fun getId() : Int = this.id_eleve
    fun setId(value : Int) { this.id_eleve = value }

    fun getName() : String = this.nom
    fun setName(value : String) { this.nom = value }

    fun getFirstName() : String = this.prenom
    fun setFirstName(value : String) { this.prenom = value }

    fun getBirthDate() : String = this.date_naissance
    fun setBirthDate(value : String) { this.date_naissance = value }

    fun getPassword() : String = this.password
    fun setPassword(value : String) { this.password = value }
}