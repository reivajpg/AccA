package mattecarra.accapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profiles_table")
data class Profile(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    var cooldownCapacity: Int,
    var pauseCapacity: Int,
    var resumeCapacity: Int,
    var shutdownCapacity: Int,
    var chargingSwitch: String?,
    var cooldownCharge: Int,
    var cooldownPause: Int,
    var onBootCommand: String?,
    var onBootExit: Boolean,
    var onPluggedCommand: String?,
    var resetUnplugged: Boolean,
    var cooldownTemperature: Int,
    var pauseChargingTemperature: Int,
    var cooldownWaitTime: Int,
    var voltageControlFile: String?,
    var voltageMax: Int?
)
