package lab.phb.forecasta.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "rekap_per_tanggal")
data class Resume(
    @Id @Column(name = "tgl")
    var tgl: String,
    @Column(name = "total")
    var total: Double
) {
    constructor(): this("", 0.0)

    override fun toString(): String {
        return "[ " + tgl + " : " + total + " ]"
    }
}
