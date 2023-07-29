

package app.easyinvoice.data

import app.easyinvoice.data.models.BaseModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot

abstract class BaseRepository<T : BaseModel>(
    auth: FirebaseAuth,
    firestore: FirebaseFirestore,
    dbNode: String
) {
    private val currentUser = auth.currentUser ?: throw IllegalStateException("User not logged in")
    protected val db = firestore.collection(currentUser.uid).document(dbNode).collection(dbNode)

    fun getData(snapshot: QuerySnapshot, model: Class<T>): List<T> {
        return snapshot.map {
            it.toObject(model).also { model ->
                model.id = it.id
                model.createdAt = it.data["createdAt"].toString().toLong()
                model.updatedAt = it.data["updatedAt"].toString().toLong()
            }
        }
    }
}