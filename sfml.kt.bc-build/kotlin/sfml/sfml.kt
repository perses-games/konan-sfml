@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package sfml

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.sfCircleShape
import cnames.structs.sfClock
import cnames.structs.sfContext
import cnames.structs.sfConvexShape
import cnames.structs.sfFont
import cnames.structs.sfFtp
import cnames.structs.sfFtpDirectoryResponse
import cnames.structs.sfFtpListingResponse
import cnames.structs.sfFtpResponse
import cnames.structs.sfHttp
import cnames.structs.sfHttpRequest
import cnames.structs.sfHttpResponse
import cnames.structs.sfImage
import cnames.structs.sfMusic
import cnames.structs.sfMutex
import cnames.structs.sfPacket
import cnames.structs.sfRectangleShape
import cnames.structs.sfRenderTexture
import cnames.structs.sfRenderWindow
import cnames.structs.sfShader
import cnames.structs.sfShape
import cnames.structs.sfSocketSelector
import cnames.structs.sfSound
import cnames.structs.sfSoundBuffer
import cnames.structs.sfSoundBufferRecorder
import cnames.structs.sfSoundRecorder
import cnames.structs.sfSoundStream
import cnames.structs.sfSprite
import cnames.structs.sfTcpListener
import cnames.structs.sfTcpSocket
import cnames.structs.sfText
import cnames.structs.sfTexture
import cnames.structs.sfThread
import cnames.structs.sfTransformable
import cnames.structs.sfUdpSocket
import cnames.structs.sfVertexArray
import cnames.structs.sfView
import cnames.structs.sfWindow
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.wchar_tVar

// NOTE THIS FILE IS AUTO-GENERATED

fun sfTime_asSeconds(time: CValue<sfTime>): Float {
    memScoped {
        return kniBridge0(time.getPointer(memScope).rawValue)
    }
}

fun sfTime_asMilliseconds(time: CValue<sfTime>): sfInt32 {
    memScoped {
        return kniBridge1(time.getPointer(memScope).rawValue)
    }
}

fun sfTime_asMicroseconds(time: CValue<sfTime>): sfInt64 {
    memScoped {
        return kniBridge2(time.getPointer(memScope).rawValue)
    }
}

fun sfSeconds(amount: Float): CValue<sfTime> {
    val kniRetVal = nativeHeap.alloc<sfTime>()
    try {
        kniBridge3(amount, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfMilliseconds(amount: sfInt32): CValue<sfTime> {
    val kniRetVal = nativeHeap.alloc<sfTime>()
    try {
        kniBridge4(amount, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfMicroseconds(amount: sfInt64): CValue<sfTime> {
    val kniRetVal = nativeHeap.alloc<sfTime>()
    try {
        kniBridge5(amount, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfClock_create(): CPointer<sfClock>? {
    return interpretCPointer<sfClock>(kniBridge6())
}

fun sfClock_copy(clock: CValuesRef<sfClock>?): CPointer<sfClock>? {
    memScoped {
        return interpretCPointer<sfClock>(kniBridge7(clock?.getPointer(memScope).rawValue))
    }
}

fun sfClock_destroy(clock: CValuesRef<sfClock>?): Unit {
    memScoped {
        return kniBridge8(clock?.getPointer(memScope).rawValue)
    }
}

fun sfClock_getElapsedTime(clock: CValuesRef<sfClock>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge9(clock?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfClock_restart(clock: CValuesRef<sfClock>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge10(clock?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfMutex_create(): CPointer<sfMutex>? {
    return interpretCPointer<sfMutex>(kniBridge11())
}

fun sfMutex_destroy(mutex: CValuesRef<sfMutex>?): Unit {
    memScoped {
        return kniBridge12(mutex?.getPointer(memScope).rawValue)
    }
}

fun sfMutex_lock(mutex: CValuesRef<sfMutex>?): Unit {
    memScoped {
        return kniBridge13(mutex?.getPointer(memScope).rawValue)
    }
}

fun sfMutex_unlock(mutex: CValuesRef<sfMutex>?): Unit {
    memScoped {
        return kniBridge14(mutex?.getPointer(memScope).rawValue)
    }
}

fun sfSleep(duration: CValue<sfTime>): Unit {
    memScoped {
        return kniBridge15(duration.getPointer(memScope).rawValue)
    }
}

fun sfThread_create(function: CPointer<CFunction<(COpaquePointer?) -> Unit>>?, userData: CValuesRef<*>?): CPointer<sfThread>? {
    memScoped {
        return interpretCPointer<sfThread>(kniBridge16(function.rawValue, userData?.getPointer(memScope).rawValue))
    }
}

fun sfThread_destroy(thread: CValuesRef<sfThread>?): Unit {
    memScoped {
        return kniBridge17(thread?.getPointer(memScope).rawValue)
    }
}

fun sfThread_launch(thread: CValuesRef<sfThread>?): Unit {
    memScoped {
        return kniBridge18(thread?.getPointer(memScope).rawValue)
    }
}

fun sfThread_wait(thread: CValuesRef<sfThread>?): Unit {
    memScoped {
        return kniBridge19(thread?.getPointer(memScope).rawValue)
    }
}

fun sfThread_terminate(thread: CValuesRef<sfThread>?): Unit {
    memScoped {
        return kniBridge20(thread?.getPointer(memScope).rawValue)
    }
}

fun sfListener_setGlobalVolume(volume: Float): Unit {
    return kniBridge21(volume)
}

fun sfListener_getGlobalVolume(): Float {
    return kniBridge22()
}

fun sfListener_setPosition(position: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge23(position.getPointer(memScope).rawValue)
    }
}

fun sfListener_getPosition(): CValue<sfVector3f> {
    val kniRetVal = nativeHeap.alloc<sfVector3f>()
    try {
        kniBridge24(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfListener_setDirection(direction: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge25(direction.getPointer(memScope).rawValue)
    }
}

fun sfListener_getDirection(): CValue<sfVector3f> {
    val kniRetVal = nativeHeap.alloc<sfVector3f>()
    try {
        kniBridge26(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfListener_setUpVector(upVector: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge27(upVector.getPointer(memScope).rawValue)
    }
}

fun sfListener_getUpVector(): CValue<sfVector3f> {
    val kniRetVal = nativeHeap.alloc<sfVector3f>()
    try {
        kniBridge28(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfMusic_createFromFile(filename: String?): CPointer<sfMusic>? {
    memScoped {
        return interpretCPointer<sfMusic>(kniBridge29(filename?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfMusic_createFromMemory(data: CValuesRef<*>?, sizeInBytes: size_t): CPointer<sfMusic>? {
    memScoped {
        return interpretCPointer<sfMusic>(kniBridge30(data?.getPointer(memScope).rawValue, sizeInBytes))
    }
}

fun sfMusic_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfMusic>? {
    memScoped {
        return interpretCPointer<sfMusic>(kniBridge31(stream?.getPointer(memScope).rawValue))
    }
}

fun sfMusic_destroy(music: CValuesRef<sfMusic>?): Unit {
    memScoped {
        return kniBridge32(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_setLoop(music: CValuesRef<sfMusic>?, loop: sfBool): Unit {
    memScoped {
        return kniBridge33(music?.getPointer(memScope).rawValue, loop)
    }
}

fun sfMusic_getLoop(music: CValuesRef<sfMusic>?): sfBool {
    memScoped {
        return kniBridge34(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getDuration(music: CValuesRef<sfMusic>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge35(music?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfMusic_play(music: CValuesRef<sfMusic>?): Unit {
    memScoped {
        return kniBridge36(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_pause(music: CValuesRef<sfMusic>?): Unit {
    memScoped {
        return kniBridge37(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_stop(music: CValuesRef<sfMusic>?): Unit {
    memScoped {
        return kniBridge38(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getChannelCount(music: CValuesRef<sfMusic>?): UInt {
    memScoped {
        return kniBridge39(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getSampleRate(music: CValuesRef<sfMusic>?): UInt {
    memScoped {
        return kniBridge40(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getStatus(music: CValuesRef<sfMusic>?): sfSoundStatus {
    memScoped {
        return sfSoundStatus.byValue(kniBridge41(music?.getPointer(memScope).rawValue))
    }
}

fun sfMusic_getPlayingOffset(music: CValuesRef<sfMusic>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge42(music?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfMusic_setPitch(music: CValuesRef<sfMusic>?, pitch: Float): Unit {
    memScoped {
        return kniBridge43(music?.getPointer(memScope).rawValue, pitch)
    }
}

fun sfMusic_setVolume(music: CValuesRef<sfMusic>?, volume: Float): Unit {
    memScoped {
        return kniBridge44(music?.getPointer(memScope).rawValue, volume)
    }
}

fun sfMusic_setPosition(music: CValuesRef<sfMusic>?, position: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge45(music?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfMusic_setRelativeToListener(music: CValuesRef<sfMusic>?, relative: sfBool): Unit {
    memScoped {
        return kniBridge46(music?.getPointer(memScope).rawValue, relative)
    }
}

fun sfMusic_setMinDistance(music: CValuesRef<sfMusic>?, distance: Float): Unit {
    memScoped {
        return kniBridge47(music?.getPointer(memScope).rawValue, distance)
    }
}

fun sfMusic_setAttenuation(music: CValuesRef<sfMusic>?, attenuation: Float): Unit {
    memScoped {
        return kniBridge48(music?.getPointer(memScope).rawValue, attenuation)
    }
}

fun sfMusic_setPlayingOffset(music: CValuesRef<sfMusic>?, timeOffset: CValue<sfTime>): Unit {
    memScoped {
        return kniBridge49(music?.getPointer(memScope).rawValue, timeOffset.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getPitch(music: CValuesRef<sfMusic>?): Float {
    memScoped {
        return kniBridge50(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getVolume(music: CValuesRef<sfMusic>?): Float {
    memScoped {
        return kniBridge51(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getPosition(music: CValuesRef<sfMusic>?): CValue<sfVector3f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector3f>()
        try {
            kniBridge52(music?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfMusic_isRelativeToListener(music: CValuesRef<sfMusic>?): sfBool {
    memScoped {
        return kniBridge53(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getMinDistance(music: CValuesRef<sfMusic>?): Float {
    memScoped {
        return kniBridge54(music?.getPointer(memScope).rawValue)
    }
}

fun sfMusic_getAttenuation(music: CValuesRef<sfMusic>?): Float {
    memScoped {
        return kniBridge55(music?.getPointer(memScope).rawValue)
    }
}

fun sfSound_create(): CPointer<sfSound>? {
    return interpretCPointer<sfSound>(kniBridge56())
}

fun sfSound_copy(sound: CValuesRef<sfSound>?): CPointer<sfSound>? {
    memScoped {
        return interpretCPointer<sfSound>(kniBridge57(sound?.getPointer(memScope).rawValue))
    }
}

fun sfSound_destroy(sound: CValuesRef<sfSound>?): Unit {
    memScoped {
        return kniBridge58(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_play(sound: CValuesRef<sfSound>?): Unit {
    memScoped {
        return kniBridge59(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_pause(sound: CValuesRef<sfSound>?): Unit {
    memScoped {
        return kniBridge60(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_stop(sound: CValuesRef<sfSound>?): Unit {
    memScoped {
        return kniBridge61(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_setBuffer(sound: CValuesRef<sfSound>?, buffer: CValuesRef<sfSoundBuffer>?): Unit {
    memScoped {
        return kniBridge62(sound?.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getBuffer(sound: CValuesRef<sfSound>?): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge63(sound?.getPointer(memScope).rawValue))
    }
}

fun sfSound_setLoop(sound: CValuesRef<sfSound>?, loop: sfBool): Unit {
    memScoped {
        return kniBridge64(sound?.getPointer(memScope).rawValue, loop)
    }
}

fun sfSound_getLoop(sound: CValuesRef<sfSound>?): sfBool {
    memScoped {
        return kniBridge65(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getStatus(sound: CValuesRef<sfSound>?): sfSoundStatus {
    memScoped {
        return sfSoundStatus.byValue(kniBridge66(sound?.getPointer(memScope).rawValue))
    }
}

fun sfSound_setPitch(sound: CValuesRef<sfSound>?, pitch: Float): Unit {
    memScoped {
        return kniBridge67(sound?.getPointer(memScope).rawValue, pitch)
    }
}

fun sfSound_setVolume(sound: CValuesRef<sfSound>?, volume: Float): Unit {
    memScoped {
        return kniBridge68(sound?.getPointer(memScope).rawValue, volume)
    }
}

fun sfSound_setPosition(sound: CValuesRef<sfSound>?, position: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge69(sound?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfSound_setRelativeToListener(sound: CValuesRef<sfSound>?, relative: sfBool): Unit {
    memScoped {
        return kniBridge70(sound?.getPointer(memScope).rawValue, relative)
    }
}

fun sfSound_setMinDistance(sound: CValuesRef<sfSound>?, distance: Float): Unit {
    memScoped {
        return kniBridge71(sound?.getPointer(memScope).rawValue, distance)
    }
}

fun sfSound_setAttenuation(sound: CValuesRef<sfSound>?, attenuation: Float): Unit {
    memScoped {
        return kniBridge72(sound?.getPointer(memScope).rawValue, attenuation)
    }
}

fun sfSound_setPlayingOffset(sound: CValuesRef<sfSound>?, timeOffset: CValue<sfTime>): Unit {
    memScoped {
        return kniBridge73(sound?.getPointer(memScope).rawValue, timeOffset.getPointer(memScope).rawValue)
    }
}

fun sfSound_getPitch(sound: CValuesRef<sfSound>?): Float {
    memScoped {
        return kniBridge74(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getVolume(sound: CValuesRef<sfSound>?): Float {
    memScoped {
        return kniBridge75(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getPosition(sound: CValuesRef<sfSound>?): CValue<sfVector3f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector3f>()
        try {
            kniBridge76(sound?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSound_isRelativeToListener(sound: CValuesRef<sfSound>?): sfBool {
    memScoped {
        return kniBridge77(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getMinDistance(sound: CValuesRef<sfSound>?): Float {
    memScoped {
        return kniBridge78(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getAttenuation(sound: CValuesRef<sfSound>?): Float {
    memScoped {
        return kniBridge79(sound?.getPointer(memScope).rawValue)
    }
}

fun sfSound_getPlayingOffset(sound: CValuesRef<sfSound>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge80(sound?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSoundBuffer_createFromFile(filename: String?): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge81(filename?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfSoundBuffer_createFromMemory(data: CValuesRef<*>?, sizeInBytes: size_t): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge82(data?.getPointer(memScope).rawValue, sizeInBytes))
    }
}

fun sfSoundBuffer_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge83(stream?.getPointer(memScope).rawValue))
    }
}

fun sfSoundBuffer_createFromSamples(samples: CValuesRef<sfInt16Var>?, sampleCount: sfUint64, channelCount: UInt, sampleRate: UInt): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge84(samples?.getPointer(memScope).rawValue, sampleCount, channelCount, sampleRate))
    }
}

fun sfSoundBuffer_copy(soundBuffer: CValuesRef<sfSoundBuffer>?): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge85(soundBuffer?.getPointer(memScope).rawValue))
    }
}

fun sfSoundBuffer_destroy(soundBuffer: CValuesRef<sfSoundBuffer>?): Unit {
    memScoped {
        return kniBridge86(soundBuffer?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBuffer_saveToFile(soundBuffer: CValuesRef<sfSoundBuffer>?, filename: String?): sfBool {
    memScoped {
        return kniBridge87(soundBuffer?.getPointer(memScope).rawValue, filename?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBuffer_getSamples(soundBuffer: CValuesRef<sfSoundBuffer>?): CPointer<sfInt16Var>? {
    memScoped {
        return interpretCPointer<sfInt16Var>(kniBridge88(soundBuffer?.getPointer(memScope).rawValue))
    }
}

fun sfSoundBuffer_getSampleCount(soundBuffer: CValuesRef<sfSoundBuffer>?): sfUint64 {
    memScoped {
        return kniBridge89(soundBuffer?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBuffer_getSampleRate(soundBuffer: CValuesRef<sfSoundBuffer>?): UInt {
    memScoped {
        return kniBridge90(soundBuffer?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBuffer_getChannelCount(soundBuffer: CValuesRef<sfSoundBuffer>?): UInt {
    memScoped {
        return kniBridge91(soundBuffer?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBuffer_getDuration(soundBuffer: CValuesRef<sfSoundBuffer>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge92(soundBuffer?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSoundBufferRecorder_create(): CPointer<sfSoundBufferRecorder>? {
    return interpretCPointer<sfSoundBufferRecorder>(kniBridge93())
}

fun sfSoundBufferRecorder_destroy(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): Unit {
    memScoped {
        return kniBridge94(soundBufferRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBufferRecorder_start(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?, sampleRate: UInt): sfBool {
    memScoped {
        return kniBridge95(soundBufferRecorder?.getPointer(memScope).rawValue, sampleRate)
    }
}

fun sfSoundBufferRecorder_stop(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): Unit {
    memScoped {
        return kniBridge96(soundBufferRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBufferRecorder_getSampleRate(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): UInt {
    memScoped {
        return kniBridge97(soundBufferRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBufferRecorder_getBuffer(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): CPointer<sfSoundBuffer>? {
    memScoped {
        return interpretCPointer<sfSoundBuffer>(kniBridge98(soundBufferRecorder?.getPointer(memScope).rawValue))
    }
}

fun sfSoundBufferRecorder_setDevice(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?, name: String?): sfBool {
    memScoped {
        return kniBridge99(soundBufferRecorder?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfSoundBufferRecorder_getDevice(soundBufferRecorder: CValuesRef<sfSoundBufferRecorder>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge100(soundBufferRecorder?.getPointer(memScope).rawValue))
    }
}

fun sfSoundRecorder_create(onStart: sfSoundRecorderStartCallback?, onProcess: sfSoundRecorderProcessCallback?, onStop: sfSoundRecorderStopCallback?, userData: CValuesRef<*>?): CPointer<sfSoundRecorder>? {
    memScoped {
        return interpretCPointer<sfSoundRecorder>(kniBridge101(onStart.rawValue, onProcess.rawValue, onStop.rawValue, userData?.getPointer(memScope).rawValue))
    }
}

fun sfSoundRecorder_destroy(soundRecorder: CValuesRef<sfSoundRecorder>?): Unit {
    memScoped {
        return kniBridge102(soundRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundRecorder_start(soundRecorder: CValuesRef<sfSoundRecorder>?, sampleRate: UInt): sfBool {
    memScoped {
        return kniBridge103(soundRecorder?.getPointer(memScope).rawValue, sampleRate)
    }
}

fun sfSoundRecorder_stop(soundRecorder: CValuesRef<sfSoundRecorder>?): Unit {
    memScoped {
        return kniBridge104(soundRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundRecorder_getSampleRate(soundRecorder: CValuesRef<sfSoundRecorder>?): UInt {
    memScoped {
        return kniBridge105(soundRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundRecorder_isAvailable(): sfBool {
    return kniBridge106()
}

fun sfSoundRecorder_setProcessingInterval(soundRecorder: CValuesRef<sfSoundRecorder>?, interval: CValue<sfTime>): Unit {
    memScoped {
        return kniBridge107(soundRecorder?.getPointer(memScope).rawValue, interval.getPointer(memScope).rawValue)
    }
}

fun sfSoundRecorder_getAvailableDevices(count: CValuesRef<size_tVar>?): CPointer<CPointerVar<ByteVar>>? {
    memScoped {
        return interpretCPointer<CPointerVar<ByteVar>>(kniBridge108(count?.getPointer(memScope).rawValue))
    }
}

fun sfSoundRecorder_getDefaultDevice(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge109())
}

fun sfSoundRecorder_setDevice(soundRecorder: CValuesRef<sfSoundRecorder>?, name: String?): sfBool {
    memScoped {
        return kniBridge110(soundRecorder?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfSoundRecorder_getDevice(soundRecorder: CValuesRef<sfSoundRecorder>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge111(soundRecorder?.getPointer(memScope).rawValue))
    }
}

fun sfSoundRecorder_setChannelCount(soundRecorder: CValuesRef<sfSoundRecorder>?, channelCount: UInt): Unit {
    memScoped {
        return kniBridge112(soundRecorder?.getPointer(memScope).rawValue, channelCount)
    }
}

fun sfSoundRecorder_getChannelCount(soundRecorder: CValuesRef<sfSoundRecorder>?): UInt {
    memScoped {
        return kniBridge113(soundRecorder?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_create(onGetData: sfSoundStreamGetDataCallback?, onSeek: sfSoundStreamSeekCallback?, channelCount: UInt, sampleRate: UInt, userData: CValuesRef<*>?): CPointer<sfSoundStream>? {
    memScoped {
        return interpretCPointer<sfSoundStream>(kniBridge114(onGetData.rawValue, onSeek.rawValue, channelCount, sampleRate, userData?.getPointer(memScope).rawValue))
    }
}

fun sfSoundStream_destroy(soundStream: CValuesRef<sfSoundStream>?): Unit {
    memScoped {
        return kniBridge115(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_play(soundStream: CValuesRef<sfSoundStream>?): Unit {
    memScoped {
        return kniBridge116(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_pause(soundStream: CValuesRef<sfSoundStream>?): Unit {
    memScoped {
        return kniBridge117(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_stop(soundStream: CValuesRef<sfSoundStream>?): Unit {
    memScoped {
        return kniBridge118(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getStatus(soundStream: CValuesRef<sfSoundStream>?): sfSoundStatus {
    memScoped {
        return sfSoundStatus.byValue(kniBridge119(soundStream?.getPointer(memScope).rawValue))
    }
}

fun sfSoundStream_getChannelCount(soundStream: CValuesRef<sfSoundStream>?): UInt {
    memScoped {
        return kniBridge120(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getSampleRate(soundStream: CValuesRef<sfSoundStream>?): UInt {
    memScoped {
        return kniBridge121(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_setPitch(soundStream: CValuesRef<sfSoundStream>?, pitch: Float): Unit {
    memScoped {
        return kniBridge122(soundStream?.getPointer(memScope).rawValue, pitch)
    }
}

fun sfSoundStream_setVolume(soundStream: CValuesRef<sfSoundStream>?, volume: Float): Unit {
    memScoped {
        return kniBridge123(soundStream?.getPointer(memScope).rawValue, volume)
    }
}

fun sfSoundStream_setPosition(soundStream: CValuesRef<sfSoundStream>?, position: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge124(soundStream?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_setRelativeToListener(soundStream: CValuesRef<sfSoundStream>?, relative: sfBool): Unit {
    memScoped {
        return kniBridge125(soundStream?.getPointer(memScope).rawValue, relative)
    }
}

fun sfSoundStream_setMinDistance(soundStream: CValuesRef<sfSoundStream>?, distance: Float): Unit {
    memScoped {
        return kniBridge126(soundStream?.getPointer(memScope).rawValue, distance)
    }
}

fun sfSoundStream_setAttenuation(soundStream: CValuesRef<sfSoundStream>?, attenuation: Float): Unit {
    memScoped {
        return kniBridge127(soundStream?.getPointer(memScope).rawValue, attenuation)
    }
}

fun sfSoundStream_setPlayingOffset(soundStream: CValuesRef<sfSoundStream>?, timeOffset: CValue<sfTime>): Unit {
    memScoped {
        return kniBridge128(soundStream?.getPointer(memScope).rawValue, timeOffset.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_setLoop(soundStream: CValuesRef<sfSoundStream>?, loop: sfBool): Unit {
    memScoped {
        return kniBridge129(soundStream?.getPointer(memScope).rawValue, loop)
    }
}

fun sfSoundStream_getPitch(soundStream: CValuesRef<sfSoundStream>?): Float {
    memScoped {
        return kniBridge130(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getVolume(soundStream: CValuesRef<sfSoundStream>?): Float {
    memScoped {
        return kniBridge131(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getPosition(soundStream: CValuesRef<sfSoundStream>?): CValue<sfVector3f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector3f>()
        try {
            kniBridge132(soundStream?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSoundStream_isRelativeToListener(soundStream: CValuesRef<sfSoundStream>?): sfBool {
    memScoped {
        return kniBridge133(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getMinDistance(soundStream: CValuesRef<sfSoundStream>?): Float {
    memScoped {
        return kniBridge134(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getAttenuation(soundStream: CValuesRef<sfSoundStream>?): Float {
    memScoped {
        return kniBridge135(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getLoop(soundStream: CValuesRef<sfSoundStream>?): sfBool {
    memScoped {
        return kniBridge136(soundStream?.getPointer(memScope).rawValue)
    }
}

fun sfSoundStream_getPlayingOffset(soundStream: CValuesRef<sfSoundStream>?): CValue<sfTime> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTime>()
        try {
            kniBridge137(soundStream?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfJoystick_isConnected(joystick: UInt): sfBool {
    return kniBridge138(joystick)
}

fun sfJoystick_getButtonCount(joystick: UInt): UInt {
    return kniBridge139(joystick)
}

fun sfJoystick_hasAxis(joystick: UInt, axis: sfJoystickAxis): sfBool {
    return kniBridge140(joystick, axis.value)
}

fun sfJoystick_isButtonPressed(joystick: UInt, button: UInt): sfBool {
    return kniBridge141(joystick, button)
}

fun sfJoystick_getAxisPosition(joystick: UInt, axis: sfJoystickAxis): Float {
    return kniBridge142(joystick, axis.value)
}

fun sfJoystick_getIdentification(joystick: UInt): CValue<sfJoystickIdentification> {
    val kniRetVal = nativeHeap.alloc<sfJoystickIdentification>()
    try {
        kniBridge143(joystick, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfJoystick_update(): Unit {
    return kniBridge144()
}

fun sfKeyboard_isKeyPressed(key: sfKeyCode): sfBool {
    return kniBridge145(key)
}

fun sfKeyboard_setVirtualKeyboardVisible(visible: sfBool): Unit {
    return kniBridge146(visible)
}

fun sfMouse_isButtonPressed(button: sfMouseButton): sfBool {
    return kniBridge147(button.value)
}

fun sfMouse_getPosition(relativeTo: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge148(relativeTo?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfMouse_setPosition(position: CValue<sfVector2i>, relativeTo: CValuesRef<sfWindow>?): Unit {
    memScoped {
        return kniBridge149(position.getPointer(memScope).rawValue, relativeTo?.getPointer(memScope).rawValue)
    }
}

fun sfSensor_isAvailable(sensor: sfSensorType): sfBool {
    return kniBridge150(sensor.value)
}

fun sfSensor_setEnabled(sensor: sfSensorType, enabled: sfBool): Unit {
    return kniBridge151(sensor.value, enabled)
}

fun sfSensor_getValue(sensor: sfSensorType): CValue<sfVector3f> {
    val kniRetVal = nativeHeap.alloc<sfVector3f>()
    try {
        kniBridge152(sensor.value, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfVideoMode_getDesktopMode(): CValue<sfVideoMode> {
    val kniRetVal = nativeHeap.alloc<sfVideoMode>()
    try {
        kniBridge153(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfVideoMode_getFullscreenModes(count: CValuesRef<size_tVar>?): CPointer<sfVideoMode>? {
    memScoped {
        return interpretCPointer<sfVideoMode>(kniBridge154(count?.getPointer(memScope).rawValue))
    }
}

fun sfVideoMode_isValid(mode: CValue<sfVideoMode>): sfBool {
    memScoped {
        return kniBridge155(mode.getPointer(memScope).rawValue)
    }
}

fun sfWindow_create(mode: CValue<sfVideoMode>, title: String?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    memScoped {
        return interpretCPointer<sfWindow>(kniBridge156(mode.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue, style, settings?.getPointer(memScope).rawValue))
    }
}

fun sfWindow_createUnicode(mode: CValue<sfVideoMode>, title: CValuesRef<sfUint32Var>?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    memScoped {
        return interpretCPointer<sfWindow>(kniBridge157(mode.getPointer(memScope).rawValue, title?.getPointer(memScope).rawValue, style, settings?.getPointer(memScope).rawValue))
    }
}

fun sfWindow_createFromHandle(handle: sfWindowHandle, settings: CValuesRef<sfContextSettings>?): CPointer<sfWindow>? {
    memScoped {
        return interpretCPointer<sfWindow>(kniBridge158(handle, settings?.getPointer(memScope).rawValue))
    }
}

fun sfWindow_destroy(window: CValuesRef<sfWindow>?): Unit {
    memScoped {
        return kniBridge159(window?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_close(window: CValuesRef<sfWindow>?): Unit {
    memScoped {
        return kniBridge160(window?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_isOpen(window: CValuesRef<sfWindow>?): sfBool {
    memScoped {
        return kniBridge161(window?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_getSettings(window: CValuesRef<sfWindow>?): CValue<sfContextSettings> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfContextSettings>()
        try {
            kniBridge162(window?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfWindow_pollEvent(window: CValuesRef<sfWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    memScoped {
        return kniBridge163(window?.getPointer(memScope).rawValue, event?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_waitEvent(window: CValuesRef<sfWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    memScoped {
        return kniBridge164(window?.getPointer(memScope).rawValue, event?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_getPosition(window: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge165(window?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfWindow_setPosition(window: CValuesRef<sfWindow>?, position: CValue<sfVector2i>): Unit {
    memScoped {
        return kniBridge166(window?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfWindow_getSize(window: CValuesRef<sfWindow>?): CValue<sfVector2u> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2u>()
        try {
            kniBridge167(window?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfWindow_setSize(window: CValuesRef<sfWindow>?, size: CValue<sfVector2u>): Unit {
    memScoped {
        return kniBridge168(window?.getPointer(memScope).rawValue, size.getPointer(memScope).rawValue)
    }
}

fun sfWindow_setTitle(window: CValuesRef<sfWindow>?, title: String?): Unit {
    memScoped {
        return kniBridge169(window?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_setUnicodeTitle(window: CValuesRef<sfWindow>?, title: CValuesRef<sfUint32Var>?): Unit {
    memScoped {
        return kniBridge170(window?.getPointer(memScope).rawValue, title?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_setIcon(window: CValuesRef<sfWindow>?, width: UInt, height: UInt, pixels: CValuesRef<sfUint8Var>?): Unit {
    memScoped {
        return kniBridge171(window?.getPointer(memScope).rawValue, width, height, pixels?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_setVisible(window: CValuesRef<sfWindow>?, visible: sfBool): Unit {
    memScoped {
        return kniBridge172(window?.getPointer(memScope).rawValue, visible)
    }
}

fun sfWindow_setVerticalSyncEnabled(window: CValuesRef<sfWindow>?, enabled: sfBool): Unit {
    memScoped {
        return kniBridge173(window?.getPointer(memScope).rawValue, enabled)
    }
}

fun sfWindow_setMouseCursorVisible(window: CValuesRef<sfWindow>?, visible: sfBool): Unit {
    memScoped {
        return kniBridge174(window?.getPointer(memScope).rawValue, visible)
    }
}

fun sfWindow_setMouseCursorGrabbed(window: CValuesRef<sfWindow>?, grabbed: sfBool): Unit {
    memScoped {
        return kniBridge175(window?.getPointer(memScope).rawValue, grabbed)
    }
}

fun sfWindow_setKeyRepeatEnabled(window: CValuesRef<sfWindow>?, enabled: sfBool): Unit {
    memScoped {
        return kniBridge176(window?.getPointer(memScope).rawValue, enabled)
    }
}

fun sfWindow_setFramerateLimit(window: CValuesRef<sfWindow>?, limit: UInt): Unit {
    memScoped {
        return kniBridge177(window?.getPointer(memScope).rawValue, limit)
    }
}

fun sfWindow_setJoystickThreshold(window: CValuesRef<sfWindow>?, threshold: Float): Unit {
    memScoped {
        return kniBridge178(window?.getPointer(memScope).rawValue, threshold)
    }
}

fun sfWindow_setActive(window: CValuesRef<sfWindow>?, active: sfBool): sfBool {
    memScoped {
        return kniBridge179(window?.getPointer(memScope).rawValue, active)
    }
}

fun sfWindow_requestFocus(window: CValuesRef<sfWindow>?): Unit {
    memScoped {
        return kniBridge180(window?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_hasFocus(window: CValuesRef<sfWindow>?): sfBool {
    memScoped {
        return kniBridge181(window?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_display(window: CValuesRef<sfWindow>?): Unit {
    memScoped {
        return kniBridge182(window?.getPointer(memScope).rawValue)
    }
}

fun sfWindow_getSystemHandle(window: CValuesRef<sfWindow>?): sfWindowHandle {
    memScoped {
        return kniBridge183(window?.getPointer(memScope).rawValue)
    }
}

fun sfContext_create(): CPointer<sfContext>? {
    return interpretCPointer<sfContext>(kniBridge184())
}

fun sfContext_destroy(context: CValuesRef<sfContext>?): Unit {
    memScoped {
        return kniBridge185(context?.getPointer(memScope).rawValue)
    }
}

fun sfContext_setActive(context: CValuesRef<sfContext>?, active: sfBool): sfBool {
    memScoped {
        return kniBridge186(context?.getPointer(memScope).rawValue, active)
    }
}

fun sfContext_getSettings(context: CValuesRef<sfContext>?): CValue<sfContextSettings> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfContextSettings>()
        try {
            kniBridge187(context?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTouch_isDown(finger: UInt): sfBool {
    return kniBridge188(finger)
}

fun sfTouch_getPosition(finger: UInt, relativeTo: CValuesRef<sfWindow>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge189(finger, relativeTo?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfColor_fromRGB(red: sfUint8, green: sfUint8, blue: sfUint8): CValue<sfColor> {
    val kniRetVal = nativeHeap.alloc<sfColor>()
    try {
        kniBridge190(red, green, blue, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfColor_fromRGBA(red: sfUint8, green: sfUint8, blue: sfUint8, alpha: sfUint8): CValue<sfColor> {
    val kniRetVal = nativeHeap.alloc<sfColor>()
    try {
        kniBridge191(red, green, blue, alpha, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfColor_fromInteger(color: sfUint32): CValue<sfColor> {
    val kniRetVal = nativeHeap.alloc<sfColor>()
    try {
        kniBridge192(color, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfColor_toInteger(color: CValue<sfColor>): sfUint32 {
    memScoped {
        return kniBridge193(color.getPointer(memScope).rawValue)
    }
}

fun sfColor_add(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge194(color1.getPointer(memScope).rawValue, color2.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfColor_subtract(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge195(color1.getPointer(memScope).rawValue, color2.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfColor_modulate(color1: CValue<sfColor>, color2: CValue<sfColor>): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge196(color1.getPointer(memScope).rawValue, color2.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfFloatRect_contains(rect: CValuesRef<sfFloatRect>?, x: Float, y: Float): sfBool {
    memScoped {
        return kniBridge197(rect?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfIntRect_contains(rect: CValuesRef<sfIntRect>?, x: Int, y: Int): sfBool {
    memScoped {
        return kniBridge198(rect?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfFloatRect_intersects(rect1: CValuesRef<sfFloatRect>?, rect2: CValuesRef<sfFloatRect>?, intersection: CValuesRef<sfFloatRect>?): sfBool {
    memScoped {
        return kniBridge199(rect1?.getPointer(memScope).rawValue, rect2?.getPointer(memScope).rawValue, intersection?.getPointer(memScope).rawValue)
    }
}

fun sfIntRect_intersects(rect1: CValuesRef<sfIntRect>?, rect2: CValuesRef<sfIntRect>?, intersection: CValuesRef<sfIntRect>?): sfBool {
    memScoped {
        return kniBridge200(rect1?.getPointer(memScope).rawValue, rect2?.getPointer(memScope).rawValue, intersection?.getPointer(memScope).rawValue)
    }
}

fun sfTransform_fromMatrix(a00: Float, a01: Float, a02: Float, a10: Float, a11: Float, a12: Float, a20: Float, a21: Float, a22: Float): CValue<sfTransform> {
    val kniRetVal = nativeHeap.alloc<sfTransform>()
    try {
        kniBridge201(a00, a01, a02, a10, a11, a12, a20, a21, a22, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfTransform_getMatrix(transform: CValuesRef<sfTransform>?, matrix: CValuesRef<FloatVar>?): Unit {
    memScoped {
        return kniBridge202(transform?.getPointer(memScope).rawValue, matrix?.getPointer(memScope).rawValue)
    }
}

fun sfTransform_getInverse(transform: CValuesRef<sfTransform>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge203(transform?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransform_transformPoint(transform: CValuesRef<sfTransform>?, point: CValue<sfVector2f>): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge204(transform?.getPointer(memScope).rawValue, point.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransform_transformRect(transform: CValuesRef<sfTransform>?, rectangle: CValue<sfFloatRect>): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge205(transform?.getPointer(memScope).rawValue, rectangle.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransform_combine(transform: CValuesRef<sfTransform>?, other: CValuesRef<sfTransform>?): Unit {
    memScoped {
        return kniBridge206(transform?.getPointer(memScope).rawValue, other?.getPointer(memScope).rawValue)
    }
}

fun sfTransform_translate(transform: CValuesRef<sfTransform>?, x: Float, y: Float): Unit {
    memScoped {
        return kniBridge207(transform?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfTransform_rotate(transform: CValuesRef<sfTransform>?, angle: Float): Unit {
    memScoped {
        return kniBridge208(transform?.getPointer(memScope).rawValue, angle)
    }
}

fun sfTransform_rotateWithCenter(transform: CValuesRef<sfTransform>?, angle: Float, centerX: Float, centerY: Float): Unit {
    memScoped {
        return kniBridge209(transform?.getPointer(memScope).rawValue, angle, centerX, centerY)
    }
}

fun sfTransform_scale(transform: CValuesRef<sfTransform>?, scaleX: Float, scaleY: Float): Unit {
    memScoped {
        return kniBridge210(transform?.getPointer(memScope).rawValue, scaleX, scaleY)
    }
}

fun sfTransform_scaleWithCenter(transform: CValuesRef<sfTransform>?, scaleX: Float, scaleY: Float, centerX: Float, centerY: Float): Unit {
    memScoped {
        return kniBridge211(transform?.getPointer(memScope).rawValue, scaleX, scaleY, centerX, centerY)
    }
}

fun sfCircleShape_create(): CPointer<sfCircleShape>? {
    return interpretCPointer<sfCircleShape>(kniBridge212())
}

fun sfCircleShape_copy(shape: CValuesRef<sfCircleShape>?): CPointer<sfCircleShape>? {
    memScoped {
        return interpretCPointer<sfCircleShape>(kniBridge213(shape?.getPointer(memScope).rawValue))
    }
}

fun sfCircleShape_destroy(shape: CValuesRef<sfCircleShape>?): Unit {
    memScoped {
        return kniBridge214(shape?.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setPosition(shape: CValuesRef<sfCircleShape>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge215(shape?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setRotation(shape: CValuesRef<sfCircleShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge216(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfCircleShape_setScale(shape: CValuesRef<sfCircleShape>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge217(shape?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setOrigin(shape: CValuesRef<sfCircleShape>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge218(shape?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_getPosition(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge219(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getRotation(shape: CValuesRef<sfCircleShape>?): Float {
    memScoped {
        return kniBridge220(shape?.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_getScale(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge221(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getOrigin(shape: CValuesRef<sfCircleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge222(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_move(shape: CValuesRef<sfCircleShape>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge223(shape?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_rotate(shape: CValuesRef<sfCircleShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge224(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfCircleShape_scale(shape: CValuesRef<sfCircleShape>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge225(shape?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_getTransform(shape: CValuesRef<sfCircleShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge226(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getInverseTransform(shape: CValuesRef<sfCircleShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge227(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_setTexture(shape: CValuesRef<sfCircleShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    memScoped {
        return kniBridge228(shape?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, resetRect)
    }
}

fun sfCircleShape_setTextureRect(shape: CValuesRef<sfCircleShape>?, rect: CValue<sfIntRect>): Unit {
    memScoped {
        return kniBridge229(shape?.getPointer(memScope).rawValue, rect.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setFillColor(shape: CValuesRef<sfCircleShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge230(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setOutlineColor(shape: CValuesRef<sfCircleShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge231(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setOutlineThickness(shape: CValuesRef<sfCircleShape>?, thickness: Float): Unit {
    memScoped {
        return kniBridge232(shape?.getPointer(memScope).rawValue, thickness)
    }
}

fun sfCircleShape_getTexture(shape: CValuesRef<sfCircleShape>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge233(shape?.getPointer(memScope).rawValue))
    }
}

fun sfCircleShape_getTextureRect(shape: CValuesRef<sfCircleShape>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge234(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getFillColor(shape: CValuesRef<sfCircleShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge235(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getOutlineColor(shape: CValuesRef<sfCircleShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge236(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getOutlineThickness(shape: CValuesRef<sfCircleShape>?): Float {
    memScoped {
        return kniBridge237(shape?.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_getPointCount(shape: CValuesRef<sfCircleShape>?): size_t {
    memScoped {
        return kniBridge238(shape?.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_getPoint(shape: CValuesRef<sfCircleShape>?, index: size_t): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge239(shape?.getPointer(memScope).rawValue, index, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_setRadius(shape: CValuesRef<sfCircleShape>?, radius: Float): Unit {
    memScoped {
        return kniBridge240(shape?.getPointer(memScope).rawValue, radius)
    }
}

fun sfCircleShape_getRadius(shape: CValuesRef<sfCircleShape>?): Float {
    memScoped {
        return kniBridge241(shape?.getPointer(memScope).rawValue)
    }
}

fun sfCircleShape_setPointCount(shape: CValuesRef<sfCircleShape>?, count: size_t): Unit {
    memScoped {
        return kniBridge242(shape?.getPointer(memScope).rawValue, count)
    }
}

fun sfCircleShape_getLocalBounds(shape: CValuesRef<sfCircleShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge243(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfCircleShape_getGlobalBounds(shape: CValuesRef<sfCircleShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge244(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_create(): CPointer<sfConvexShape>? {
    return interpretCPointer<sfConvexShape>(kniBridge245())
}

fun sfConvexShape_copy(shape: CValuesRef<sfConvexShape>?): CPointer<sfConvexShape>? {
    memScoped {
        return interpretCPointer<sfConvexShape>(kniBridge246(shape?.getPointer(memScope).rawValue))
    }
}

fun sfConvexShape_destroy(shape: CValuesRef<sfConvexShape>?): Unit {
    memScoped {
        return kniBridge247(shape?.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_setPosition(shape: CValuesRef<sfConvexShape>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge248(shape?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_setRotation(shape: CValuesRef<sfConvexShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge249(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfConvexShape_setScale(shape: CValuesRef<sfConvexShape>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge250(shape?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_setOrigin(shape: CValuesRef<sfConvexShape>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge251(shape?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_getPosition(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge252(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getRotation(shape: CValuesRef<sfConvexShape>?): Float {
    memScoped {
        return kniBridge253(shape?.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_getScale(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge254(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getOrigin(shape: CValuesRef<sfConvexShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge255(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_move(shape: CValuesRef<sfConvexShape>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge256(shape?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_rotate(shape: CValuesRef<sfConvexShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge257(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfConvexShape_scale(shape: CValuesRef<sfConvexShape>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge258(shape?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_getTransform(shape: CValuesRef<sfConvexShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge259(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getInverseTransform(shape: CValuesRef<sfConvexShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge260(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_setTexture(shape: CValuesRef<sfConvexShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    memScoped {
        return kniBridge261(shape?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, resetRect)
    }
}

fun sfConvexShape_setTextureRect(shape: CValuesRef<sfConvexShape>?, rect: CValue<sfIntRect>): Unit {
    memScoped {
        return kniBridge262(shape?.getPointer(memScope).rawValue, rect.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_setFillColor(shape: CValuesRef<sfConvexShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge263(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_setOutlineColor(shape: CValuesRef<sfConvexShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge264(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_setOutlineThickness(shape: CValuesRef<sfConvexShape>?, thickness: Float): Unit {
    memScoped {
        return kniBridge265(shape?.getPointer(memScope).rawValue, thickness)
    }
}

fun sfConvexShape_getTexture(shape: CValuesRef<sfConvexShape>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge266(shape?.getPointer(memScope).rawValue))
    }
}

fun sfConvexShape_getTextureRect(shape: CValuesRef<sfConvexShape>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge267(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getFillColor(shape: CValuesRef<sfConvexShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge268(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getOutlineColor(shape: CValuesRef<sfConvexShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge269(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getOutlineThickness(shape: CValuesRef<sfConvexShape>?): Float {
    memScoped {
        return kniBridge270(shape?.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_getPointCount(shape: CValuesRef<sfConvexShape>?): size_t {
    memScoped {
        return kniBridge271(shape?.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_getPoint(shape: CValuesRef<sfConvexShape>?, index: size_t): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge272(shape?.getPointer(memScope).rawValue, index, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_setPointCount(shape: CValuesRef<sfConvexShape>?, count: size_t): Unit {
    memScoped {
        return kniBridge273(shape?.getPointer(memScope).rawValue, count)
    }
}

fun sfConvexShape_setPoint(shape: CValuesRef<sfConvexShape>?, index: size_t, point: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge274(shape?.getPointer(memScope).rawValue, index, point.getPointer(memScope).rawValue)
    }
}

fun sfConvexShape_getLocalBounds(shape: CValuesRef<sfConvexShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge275(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfConvexShape_getGlobalBounds(shape: CValuesRef<sfConvexShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge276(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfFont_createFromFile(filename: String?): CPointer<sfFont>? {
    memScoped {
        return interpretCPointer<sfFont>(kniBridge277(filename?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFont_createFromMemory(data: CValuesRef<*>?, sizeInBytes: size_t): CPointer<sfFont>? {
    memScoped {
        return interpretCPointer<sfFont>(kniBridge278(data?.getPointer(memScope).rawValue, sizeInBytes))
    }
}

fun sfFont_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfFont>? {
    memScoped {
        return interpretCPointer<sfFont>(kniBridge279(stream?.getPointer(memScope).rawValue))
    }
}

fun sfFont_copy(font: CValuesRef<sfFont>?): CPointer<sfFont>? {
    memScoped {
        return interpretCPointer<sfFont>(kniBridge280(font?.getPointer(memScope).rawValue))
    }
}

fun sfFont_destroy(font: CValuesRef<sfFont>?): Unit {
    memScoped {
        return kniBridge281(font?.getPointer(memScope).rawValue)
    }
}

fun sfFont_getGlyph(font: CValuesRef<sfFont>?, codePoint: sfUint32, characterSize: UInt, bold: sfBool, outlineThickness: Float): CValue<sfGlyph> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfGlyph>()
        try {
            kniBridge282(font?.getPointer(memScope).rawValue, codePoint, characterSize, bold, outlineThickness, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfFont_getKerning(font: CValuesRef<sfFont>?, first: sfUint32, second: sfUint32, characterSize: UInt): Float {
    memScoped {
        return kniBridge283(font?.getPointer(memScope).rawValue, first, second, characterSize)
    }
}

fun sfFont_getLineSpacing(font: CValuesRef<sfFont>?, characterSize: UInt): Float {
    memScoped {
        return kniBridge284(font?.getPointer(memScope).rawValue, characterSize)
    }
}

fun sfFont_getUnderlinePosition(font: CValuesRef<sfFont>?, characterSize: UInt): Float {
    memScoped {
        return kniBridge285(font?.getPointer(memScope).rawValue, characterSize)
    }
}

fun sfFont_getUnderlineThickness(font: CValuesRef<sfFont>?, characterSize: UInt): Float {
    memScoped {
        return kniBridge286(font?.getPointer(memScope).rawValue, characterSize)
    }
}

fun sfFont_getTexture(font: CValuesRef<sfFont>?, characterSize: UInt): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge287(font?.getPointer(memScope).rawValue, characterSize))
    }
}

fun sfFont_getInfo(font: CValuesRef<sfFont>?): CValue<sfFontInfo> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFontInfo>()
        try {
            kniBridge288(font?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfImage_create(width: UInt, height: UInt): CPointer<sfImage>? {
    return interpretCPointer<sfImage>(kniBridge289(width, height))
}

fun sfImage_createFromColor(width: UInt, height: UInt, color: CValue<sfColor>): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge290(width, height, color.getPointer(memScope).rawValue))
    }
}

fun sfImage_createFromPixels(width: UInt, height: UInt, pixels: CValuesRef<sfUint8Var>?): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge291(width, height, pixels?.getPointer(memScope).rawValue))
    }
}

fun sfImage_createFromFile(filename: String?): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge292(filename?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfImage_createFromMemory(data: CValuesRef<*>?, size: size_t): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge293(data?.getPointer(memScope).rawValue, size))
    }
}

fun sfImage_createFromStream(stream: CValuesRef<sfInputStream>?): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge294(stream?.getPointer(memScope).rawValue))
    }
}

fun sfImage_copy(image: CValuesRef<sfImage>?): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge295(image?.getPointer(memScope).rawValue))
    }
}

fun sfImage_destroy(image: CValuesRef<sfImage>?): Unit {
    memScoped {
        return kniBridge296(image?.getPointer(memScope).rawValue)
    }
}

fun sfImage_saveToFile(image: CValuesRef<sfImage>?, filename: String?): sfBool {
    memScoped {
        return kniBridge297(image?.getPointer(memScope).rawValue, filename?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfImage_getSize(image: CValuesRef<sfImage>?): CValue<sfVector2u> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2u>()
        try {
            kniBridge298(image?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfImage_createMaskFromColor(image: CValuesRef<sfImage>?, color: CValue<sfColor>, alpha: sfUint8): Unit {
    memScoped {
        return kniBridge299(image?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue, alpha)
    }
}

fun sfImage_copyImage(image: CValuesRef<sfImage>?, source: CValuesRef<sfImage>?, destX: UInt, destY: UInt, sourceRect: CValue<sfIntRect>, applyAlpha: sfBool): Unit {
    memScoped {
        return kniBridge300(image?.getPointer(memScope).rawValue, source?.getPointer(memScope).rawValue, destX, destY, sourceRect.getPointer(memScope).rawValue, applyAlpha)
    }
}

fun sfImage_setPixel(image: CValuesRef<sfImage>?, x: UInt, y: UInt, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge301(image?.getPointer(memScope).rawValue, x, y, color.getPointer(memScope).rawValue)
    }
}

fun sfImage_getPixel(image: CValuesRef<sfImage>?, x: UInt, y: UInt): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge302(image?.getPointer(memScope).rawValue, x, y, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfImage_getPixelsPtr(image: CValuesRef<sfImage>?): CPointer<sfUint8Var>? {
    memScoped {
        return interpretCPointer<sfUint8Var>(kniBridge303(image?.getPointer(memScope).rawValue))
    }
}

fun sfImage_flipHorizontally(image: CValuesRef<sfImage>?): Unit {
    memScoped {
        return kniBridge304(image?.getPointer(memScope).rawValue)
    }
}

fun sfImage_flipVertically(image: CValuesRef<sfImage>?): Unit {
    memScoped {
        return kniBridge305(image?.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_create(): CPointer<sfRectangleShape>? {
    return interpretCPointer<sfRectangleShape>(kniBridge306())
}

fun sfRectangleShape_copy(shape: CValuesRef<sfRectangleShape>?): CPointer<sfRectangleShape>? {
    memScoped {
        return interpretCPointer<sfRectangleShape>(kniBridge307(shape?.getPointer(memScope).rawValue))
    }
}

fun sfRectangleShape_destroy(shape: CValuesRef<sfRectangleShape>?): Unit {
    memScoped {
        return kniBridge308(shape?.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_setPosition(shape: CValuesRef<sfRectangleShape>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge309(shape?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_setRotation(shape: CValuesRef<sfRectangleShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge310(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfRectangleShape_setScale(shape: CValuesRef<sfRectangleShape>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge311(shape?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_setOrigin(shape: CValuesRef<sfRectangleShape>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge312(shape?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_getPosition(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge313(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getRotation(shape: CValuesRef<sfRectangleShape>?): Float {
    memScoped {
        return kniBridge314(shape?.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_getScale(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge315(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getOrigin(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge316(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_move(shape: CValuesRef<sfRectangleShape>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge317(shape?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_rotate(shape: CValuesRef<sfRectangleShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge318(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfRectangleShape_scale(shape: CValuesRef<sfRectangleShape>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge319(shape?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_getTransform(shape: CValuesRef<sfRectangleShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge320(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getInverseTransform(shape: CValuesRef<sfRectangleShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge321(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_setTexture(shape: CValuesRef<sfRectangleShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    memScoped {
        return kniBridge322(shape?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, resetRect)
    }
}

fun sfRectangleShape_setTextureRect(shape: CValuesRef<sfRectangleShape>?, rect: CValue<sfIntRect>): Unit {
    memScoped {
        return kniBridge323(shape?.getPointer(memScope).rawValue, rect.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_setFillColor(shape: CValuesRef<sfRectangleShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge324(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_setOutlineColor(shape: CValuesRef<sfRectangleShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge325(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_setOutlineThickness(shape: CValuesRef<sfRectangleShape>?, thickness: Float): Unit {
    memScoped {
        return kniBridge326(shape?.getPointer(memScope).rawValue, thickness)
    }
}

fun sfRectangleShape_getTexture(shape: CValuesRef<sfRectangleShape>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge327(shape?.getPointer(memScope).rawValue))
    }
}

fun sfRectangleShape_getTextureRect(shape: CValuesRef<sfRectangleShape>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge328(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getFillColor(shape: CValuesRef<sfRectangleShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge329(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getOutlineColor(shape: CValuesRef<sfRectangleShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge330(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getOutlineThickness(shape: CValuesRef<sfRectangleShape>?): Float {
    memScoped {
        return kniBridge331(shape?.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_getPointCount(shape: CValuesRef<sfRectangleShape>?): size_t {
    memScoped {
        return kniBridge332(shape?.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_getPoint(shape: CValuesRef<sfRectangleShape>?, index: size_t): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge333(shape?.getPointer(memScope).rawValue, index, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_setSize(shape: CValuesRef<sfRectangleShape>?, size: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge334(shape?.getPointer(memScope).rawValue, size.getPointer(memScope).rawValue)
    }
}

fun sfRectangleShape_getSize(shape: CValuesRef<sfRectangleShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge335(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getLocalBounds(shape: CValuesRef<sfRectangleShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge336(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRectangleShape_getGlobalBounds(shape: CValuesRef<sfRectangleShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge337(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderTexture_create(width: UInt, height: UInt, depthBuffer: sfBool): CPointer<sfRenderTexture>? {
    return interpretCPointer<sfRenderTexture>(kniBridge338(width, height, depthBuffer))
}

fun sfRenderTexture_destroy(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    memScoped {
        return kniBridge339(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_getSize(renderTexture: CValuesRef<sfRenderTexture>?): CValue<sfVector2u> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2u>()
        try {
            kniBridge340(renderTexture?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderTexture_setActive(renderTexture: CValuesRef<sfRenderTexture>?, active: sfBool): sfBool {
    memScoped {
        return kniBridge341(renderTexture?.getPointer(memScope).rawValue, active)
    }
}

fun sfRenderTexture_display(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    memScoped {
        return kniBridge342(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_clear(renderTexture: CValuesRef<sfRenderTexture>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge343(renderTexture?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_setView(renderTexture: CValuesRef<sfRenderTexture>?, view: CValuesRef<sfView>?): Unit {
    memScoped {
        return kniBridge344(renderTexture?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_getView(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfView>? {
    memScoped {
        return interpretCPointer<sfView>(kniBridge345(renderTexture?.getPointer(memScope).rawValue))
    }
}

fun sfRenderTexture_getDefaultView(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfView>? {
    memScoped {
        return interpretCPointer<sfView>(kniBridge346(renderTexture?.getPointer(memScope).rawValue))
    }
}

fun sfRenderTexture_getViewport(renderTexture: CValuesRef<sfRenderTexture>?, view: CValuesRef<sfView>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge347(renderTexture?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderTexture_mapPixelToCoords(renderTexture: CValuesRef<sfRenderTexture>?, point: CValue<sfVector2i>, view: CValuesRef<sfView>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge348(renderTexture?.getPointer(memScope).rawValue, point.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderTexture_mapCoordsToPixel(renderTexture: CValuesRef<sfRenderTexture>?, point: CValue<sfVector2f>, view: CValuesRef<sfView>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge349(renderTexture?.getPointer(memScope).rawValue, point.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderTexture_drawSprite(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfSprite>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge350(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawText(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfText>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge351(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge352(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawCircleShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfCircleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge353(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawConvexShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfConvexShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge354(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawRectangleShape(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfRectangleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge355(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawVertexArray(renderTexture: CValuesRef<sfRenderTexture>?, `object`: CValuesRef<sfVertexArray>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge356(renderTexture?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_drawPrimitives(renderTexture: CValuesRef<sfRenderTexture>?, vertices: CValuesRef<sfVertex>?, vertexCount: size_t, type: sfPrimitiveType, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge357(renderTexture?.getPointer(memScope).rawValue, vertices?.getPointer(memScope).rawValue, vertexCount, type, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_pushGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    memScoped {
        return kniBridge358(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_popGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    memScoped {
        return kniBridge359(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_resetGLStates(renderTexture: CValuesRef<sfRenderTexture>?): Unit {
    memScoped {
        return kniBridge360(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_getTexture(renderTexture: CValuesRef<sfRenderTexture>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge361(renderTexture?.getPointer(memScope).rawValue))
    }
}

fun sfRenderTexture_setSmooth(renderTexture: CValuesRef<sfRenderTexture>?, smooth: sfBool): Unit {
    memScoped {
        return kniBridge362(renderTexture?.getPointer(memScope).rawValue, smooth)
    }
}

fun sfRenderTexture_isSmooth(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    memScoped {
        return kniBridge363(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_setRepeated(renderTexture: CValuesRef<sfRenderTexture>?, repeated: sfBool): Unit {
    memScoped {
        return kniBridge364(renderTexture?.getPointer(memScope).rawValue, repeated)
    }
}

fun sfRenderTexture_isRepeated(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    memScoped {
        return kniBridge365(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderTexture_generateMipmap(renderTexture: CValuesRef<sfRenderTexture>?): sfBool {
    memScoped {
        return kniBridge366(renderTexture?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_create(mode: CValue<sfVideoMode>, title: String?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    memScoped {
        return interpretCPointer<sfRenderWindow>(kniBridge367(mode.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue, style, settings?.getPointer(memScope).rawValue))
    }
}

fun sfRenderWindow_createUnicode(mode: CValue<sfVideoMode>, title: CValuesRef<sfUint32Var>?, style: sfUint32, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    memScoped {
        return interpretCPointer<sfRenderWindow>(kniBridge368(mode.getPointer(memScope).rawValue, title?.getPointer(memScope).rawValue, style, settings?.getPointer(memScope).rawValue))
    }
}

fun sfRenderWindow_createFromHandle(handle: sfWindowHandle, settings: CValuesRef<sfContextSettings>?): CPointer<sfRenderWindow>? {
    memScoped {
        return interpretCPointer<sfRenderWindow>(kniBridge369(handle, settings?.getPointer(memScope).rawValue))
    }
}

fun sfRenderWindow_destroy(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge370(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_close(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge371(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_isOpen(renderWindow: CValuesRef<sfRenderWindow>?): sfBool {
    memScoped {
        return kniBridge372(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_getSettings(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfContextSettings> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfContextSettings>()
        try {
            kniBridge373(renderWindow?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderWindow_pollEvent(renderWindow: CValuesRef<sfRenderWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    memScoped {
        return kniBridge374(renderWindow?.getPointer(memScope).rawValue, event?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_waitEvent(renderWindow: CValuesRef<sfRenderWindow>?, event: CValuesRef<sfEvent>?): sfBool {
    memScoped {
        return kniBridge375(renderWindow?.getPointer(memScope).rawValue, event?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_getPosition(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge376(renderWindow?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderWindow_setPosition(renderWindow: CValuesRef<sfRenderWindow>?, position: CValue<sfVector2i>): Unit {
    memScoped {
        return kniBridge377(renderWindow?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_getSize(renderWindow: CValuesRef<sfRenderWindow>?): CValue<sfVector2u> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2u>()
        try {
            kniBridge378(renderWindow?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderWindow_setSize(renderWindow: CValuesRef<sfRenderWindow>?, size: CValue<sfVector2u>): Unit {
    memScoped {
        return kniBridge379(renderWindow?.getPointer(memScope).rawValue, size.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_setTitle(renderWindow: CValuesRef<sfRenderWindow>?, title: String?): Unit {
    memScoped {
        return kniBridge380(renderWindow?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_setUnicodeTitle(renderWindow: CValuesRef<sfRenderWindow>?, title: CValuesRef<sfUint32Var>?): Unit {
    memScoped {
        return kniBridge381(renderWindow?.getPointer(memScope).rawValue, title?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_setIcon(renderWindow: CValuesRef<sfRenderWindow>?, width: UInt, height: UInt, pixels: CValuesRef<sfUint8Var>?): Unit {
    memScoped {
        return kniBridge382(renderWindow?.getPointer(memScope).rawValue, width, height, pixels?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_setVisible(renderWindow: CValuesRef<sfRenderWindow>?, visible: sfBool): Unit {
    memScoped {
        return kniBridge383(renderWindow?.getPointer(memScope).rawValue, visible)
    }
}

fun sfRenderWindow_setVerticalSyncEnabled(renderWindow: CValuesRef<sfRenderWindow>?, enabled: sfBool): Unit {
    memScoped {
        return kniBridge384(renderWindow?.getPointer(memScope).rawValue, enabled)
    }
}

fun sfRenderWindow_setMouseCursorVisible(renderWindow: CValuesRef<sfRenderWindow>?, show: sfBool): Unit {
    memScoped {
        return kniBridge385(renderWindow?.getPointer(memScope).rawValue, show)
    }
}

fun sfRenderWindow_setMouseCursorGrabbed(renderWindow: CValuesRef<sfRenderWindow>?, grabbed: sfBool): Unit {
    memScoped {
        return kniBridge386(renderWindow?.getPointer(memScope).rawValue, grabbed)
    }
}

fun sfRenderWindow_setKeyRepeatEnabled(renderWindow: CValuesRef<sfRenderWindow>?, enabled: sfBool): Unit {
    memScoped {
        return kniBridge387(renderWindow?.getPointer(memScope).rawValue, enabled)
    }
}

fun sfRenderWindow_setFramerateLimit(renderWindow: CValuesRef<sfRenderWindow>?, limit: UInt): Unit {
    memScoped {
        return kniBridge388(renderWindow?.getPointer(memScope).rawValue, limit)
    }
}

fun sfRenderWindow_setJoystickThreshold(renderWindow: CValuesRef<sfRenderWindow>?, threshold: Float): Unit {
    memScoped {
        return kniBridge389(renderWindow?.getPointer(memScope).rawValue, threshold)
    }
}

fun sfRenderWindow_setActive(renderWindow: CValuesRef<sfRenderWindow>?, active: sfBool): sfBool {
    memScoped {
        return kniBridge390(renderWindow?.getPointer(memScope).rawValue, active)
    }
}

fun sfRenderWindow_requestFocus(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge391(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_hasFocus(renderWindow: CValuesRef<sfRenderWindow>?): sfBool {
    memScoped {
        return kniBridge392(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_display(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge393(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_getSystemHandle(renderWindow: CValuesRef<sfRenderWindow>?): sfWindowHandle {
    memScoped {
        return kniBridge394(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_clear(renderWindow: CValuesRef<sfRenderWindow>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge395(renderWindow?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_setView(renderWindow: CValuesRef<sfRenderWindow>?, view: CValuesRef<sfView>?): Unit {
    memScoped {
        return kniBridge396(renderWindow?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_getView(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfView>? {
    memScoped {
        return interpretCPointer<sfView>(kniBridge397(renderWindow?.getPointer(memScope).rawValue))
    }
}

fun sfRenderWindow_getDefaultView(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfView>? {
    memScoped {
        return interpretCPointer<sfView>(kniBridge398(renderWindow?.getPointer(memScope).rawValue))
    }
}

fun sfRenderWindow_getViewport(renderWindow: CValuesRef<sfRenderWindow>?, view: CValuesRef<sfView>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge399(renderWindow?.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderWindow_mapPixelToCoords(renderWindow: CValuesRef<sfRenderWindow>?, point: CValue<sfVector2i>, view: CValuesRef<sfView>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge400(renderWindow?.getPointer(memScope).rawValue, point.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderWindow_mapCoordsToPixel(renderWindow: CValuesRef<sfRenderWindow>?, point: CValue<sfVector2f>, view: CValuesRef<sfView>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge401(renderWindow?.getPointer(memScope).rawValue, point.getPointer(memScope).rawValue, view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfRenderWindow_drawSprite(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfSprite>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge402(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawText(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfText>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge403(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge404(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawCircleShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfCircleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge405(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawConvexShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfConvexShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge406(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawRectangleShape(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfRectangleShape>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge407(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawVertexArray(renderWindow: CValuesRef<sfRenderWindow>?, `object`: CValuesRef<sfVertexArray>?, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge408(renderWindow?.getPointer(memScope).rawValue, `object`?.getPointer(memScope).rawValue, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_drawPrimitives(renderWindow: CValuesRef<sfRenderWindow>?, vertices: CValuesRef<sfVertex>?, vertexCount: size_t, type: sfPrimitiveType, states: CValuesRef<sfRenderStates>?): Unit {
    memScoped {
        return kniBridge409(renderWindow?.getPointer(memScope).rawValue, vertices?.getPointer(memScope).rawValue, vertexCount, type, states?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_pushGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge410(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_popGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge411(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_resetGLStates(renderWindow: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge412(renderWindow?.getPointer(memScope).rawValue)
    }
}

fun sfRenderWindow_capture(renderWindow: CValuesRef<sfRenderWindow>?): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge413(renderWindow?.getPointer(memScope).rawValue))
    }
}

fun sfMouse_getPositionRenderWindow(relativeTo: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge414(relativeTo?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfMouse_setPositionRenderWindow(position: CValue<sfVector2i>, relativeTo: CValuesRef<sfRenderWindow>?): Unit {
    memScoped {
        return kniBridge415(position.getPointer(memScope).rawValue, relativeTo?.getPointer(memScope).rawValue)
    }
}

fun sfTouch_getPositionRenderWindow(finger: UInt, relativeTo: CValuesRef<sfRenderWindow>?): CValue<sfVector2i> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2i>()
        try {
            kniBridge416(finger, relativeTo?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShader_createFromFile(vertexShaderFilename: String?, geometryShaderFilename: String?, fragmentShaderFilename: String?): CPointer<sfShader>? {
    memScoped {
        return interpretCPointer<sfShader>(kniBridge417(vertexShaderFilename?.cstr?.getPointer(memScope).rawValue, geometryShaderFilename?.cstr?.getPointer(memScope).rawValue, fragmentShaderFilename?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfShader_createFromMemory(vertexShader: String?, geometryShader: String?, fragmentShader: String?): CPointer<sfShader>? {
    memScoped {
        return interpretCPointer<sfShader>(kniBridge418(vertexShader?.cstr?.getPointer(memScope).rawValue, geometryShader?.cstr?.getPointer(memScope).rawValue, fragmentShader?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfShader_createFromStream(vertexShaderStream: CValuesRef<sfInputStream>?, geometryShaderStream: CValuesRef<sfInputStream>?, fragmentShaderStream: CValuesRef<sfInputStream>?): CPointer<sfShader>? {
    memScoped {
        return interpretCPointer<sfShader>(kniBridge419(vertexShaderStream?.getPointer(memScope).rawValue, geometryShaderStream?.getPointer(memScope).rawValue, fragmentShaderStream?.getPointer(memScope).rawValue))
    }
}

fun sfShader_destroy(shader: CValuesRef<sfShader>?): Unit {
    memScoped {
        return kniBridge420(shader?.getPointer(memScope).rawValue)
    }
}

fun sfShader_setFloatUniform(shader: CValuesRef<sfShader>?, name: String?, x: Float): Unit {
    memScoped {
        return kniBridge421(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x)
    }
}

fun sfShader_setVec2Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslVec2>): Unit {
    memScoped {
        return kniBridge422(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setVec3Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslVec3>): Unit {
    memScoped {
        return kniBridge423(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setVec4Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslVec4>): Unit {
    memScoped {
        return kniBridge424(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setColorUniform(shader: CValuesRef<sfShader>?, name: String?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge425(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfShader_setIntUniform(shader: CValuesRef<sfShader>?, name: String?, x: Int): Unit {
    memScoped {
        return kniBridge426(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x)
    }
}

fun sfShader_setIvec2Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslIvec2>): Unit {
    memScoped {
        return kniBridge427(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setIvec3Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslIvec3>): Unit {
    memScoped {
        return kniBridge428(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setIvec4Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslIvec4>): Unit {
    memScoped {
        return kniBridge429(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setIntColorUniform(shader: CValuesRef<sfShader>?, name: String?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge430(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfShader_setBoolUniform(shader: CValuesRef<sfShader>?, name: String?, x: sfBool): Unit {
    memScoped {
        return kniBridge431(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x)
    }
}

fun sfShader_setBvec2Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslBvec2>): Unit {
    memScoped {
        return kniBridge432(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setBvec3Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslBvec3>): Unit {
    memScoped {
        return kniBridge433(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setBvec4Uniform(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfGlslBvec4>): Unit {
    memScoped {
        return kniBridge434(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setMat3Uniform(shader: CValuesRef<sfShader>?, name: String?, matrix: CValuesRef<sfGlslMat3>?): Unit {
    memScoped {
        return kniBridge435(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, matrix?.getPointer(memScope).rawValue)
    }
}

fun sfShader_setMat4Uniform(shader: CValuesRef<sfShader>?, name: String?, matrix: CValuesRef<sfGlslMat4>?): Unit {
    memScoped {
        return kniBridge436(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, matrix?.getPointer(memScope).rawValue)
    }
}

fun sfShader_setTextureUniform(shader: CValuesRef<sfShader>?, name: String?, texture: CValuesRef<sfTexture>?): Unit {
    memScoped {
        return kniBridge437(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue)
    }
}

fun sfShader_setCurrentTextureUniform(shader: CValuesRef<sfShader>?, name: String?): Unit {
    memScoped {
        return kniBridge438(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfShader_setFloatUniformArray(shader: CValuesRef<sfShader>?, name: String?, scalarArray: CValuesRef<FloatVar>?, length: size_t): Unit {
    memScoped {
        return kniBridge439(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, scalarArray?.getPointer(memScope).rawValue, length)
    }
}

fun sfShader_setVec2UniformArray(shader: CValuesRef<sfShader>?, name: String?, vectorArray: CValuesRef<sfGlslVec2>?, length: size_t): Unit {
    memScoped {
        return kniBridge440(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vectorArray?.getPointer(memScope).rawValue, length)
    }
}

fun sfShader_setVec3UniformArray(shader: CValuesRef<sfShader>?, name: String?, vectorArray: CValuesRef<sfGlslVec3>?, length: size_t): Unit {
    memScoped {
        return kniBridge441(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vectorArray?.getPointer(memScope).rawValue, length)
    }
}

fun sfShader_setVec4UniformArray(shader: CValuesRef<sfShader>?, name: String?, vectorArray: CValuesRef<sfGlslVec4>?, length: size_t): Unit {
    memScoped {
        return kniBridge442(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vectorArray?.getPointer(memScope).rawValue, length)
    }
}

fun sfShader_setMat3UniformArray(shader: CValuesRef<sfShader>?, name: String?, matrixArray: CValuesRef<sfGlslMat3>?, length: size_t): Unit {
    memScoped {
        return kniBridge443(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, matrixArray?.getPointer(memScope).rawValue, length)
    }
}

fun sfShader_setMat4UniformArray(shader: CValuesRef<sfShader>?, name: String?, matrixArray: CValuesRef<sfGlslMat4>?, length: size_t): Unit {
    memScoped {
        return kniBridge444(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, matrixArray?.getPointer(memScope).rawValue, length)
    }
}

fun sfShader_setFloatParameter(shader: CValuesRef<sfShader>?, name: String?, x: Float): Unit {
    memScoped {
        return kniBridge445(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x)
    }
}

fun sfShader_setFloat2Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float): Unit {
    memScoped {
        return kniBridge446(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfShader_setFloat3Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float, z: Float): Unit {
    memScoped {
        return kniBridge447(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x, y, z)
    }
}

fun sfShader_setFloat4Parameter(shader: CValuesRef<sfShader>?, name: String?, x: Float, y: Float, z: Float, w: Float): Unit {
    memScoped {
        return kniBridge448(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, x, y, z, w)
    }
}

fun sfShader_setVector2Parameter(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge449(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setVector3Parameter(shader: CValuesRef<sfShader>?, name: String?, vector: CValue<sfVector3f>): Unit {
    memScoped {
        return kniBridge450(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, vector.getPointer(memScope).rawValue)
    }
}

fun sfShader_setColorParameter(shader: CValuesRef<sfShader>?, name: String?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge451(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfShader_setTransformParameter(shader: CValuesRef<sfShader>?, name: String?, transform: CValue<sfTransform>): Unit {
    memScoped {
        return kniBridge452(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, transform.getPointer(memScope).rawValue)
    }
}

fun sfShader_setTextureParameter(shader: CValuesRef<sfShader>?, name: String?, texture: CValuesRef<sfTexture>?): Unit {
    memScoped {
        return kniBridge453(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue)
    }
}

fun sfShader_setCurrentTextureParameter(shader: CValuesRef<sfShader>?, name: String?): Unit {
    memScoped {
        return kniBridge454(shader?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfShader_getNativeHandle(shader: CValuesRef<sfShader>?): UInt {
    memScoped {
        return kniBridge455(shader?.getPointer(memScope).rawValue)
    }
}

fun sfShader_bind(shader: CValuesRef<sfShader>?): Unit {
    memScoped {
        return kniBridge456(shader?.getPointer(memScope).rawValue)
    }
}

fun sfShader_isAvailable(): sfBool {
    return kniBridge457()
}

fun sfShader_isGeometryAvailable(): sfBool {
    return kniBridge458()
}

fun sfShape_create(getPointCount: sfShapeGetPointCountCallback?, getPoint: sfShapeGetPointCallback?, userData: CValuesRef<*>?): CPointer<sfShape>? {
    memScoped {
        return interpretCPointer<sfShape>(kniBridge459(getPointCount.rawValue, getPoint.rawValue, userData?.getPointer(memScope).rawValue))
    }
}

fun sfShape_destroy(shape: CValuesRef<sfShape>?): Unit {
    memScoped {
        return kniBridge460(shape?.getPointer(memScope).rawValue)
    }
}

fun sfShape_setPosition(shape: CValuesRef<sfShape>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge461(shape?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfShape_setRotation(shape: CValuesRef<sfShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge462(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfShape_setScale(shape: CValuesRef<sfShape>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge463(shape?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfShape_setOrigin(shape: CValuesRef<sfShape>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge464(shape?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfShape_getPosition(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge465(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getRotation(shape: CValuesRef<sfShape>?): Float {
    memScoped {
        return kniBridge466(shape?.getPointer(memScope).rawValue)
    }
}

fun sfShape_getScale(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge467(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getOrigin(shape: CValuesRef<sfShape>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge468(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_move(shape: CValuesRef<sfShape>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge469(shape?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfShape_rotate(shape: CValuesRef<sfShape>?, angle: Float): Unit {
    memScoped {
        return kniBridge470(shape?.getPointer(memScope).rawValue, angle)
    }
}

fun sfShape_scale(shape: CValuesRef<sfShape>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge471(shape?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfShape_getTransform(shape: CValuesRef<sfShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge472(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getInverseTransform(shape: CValuesRef<sfShape>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge473(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_setTexture(shape: CValuesRef<sfShape>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    memScoped {
        return kniBridge474(shape?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, resetRect)
    }
}

fun sfShape_setTextureRect(shape: CValuesRef<sfShape>?, rect: CValue<sfIntRect>): Unit {
    memScoped {
        return kniBridge475(shape?.getPointer(memScope).rawValue, rect.getPointer(memScope).rawValue)
    }
}

fun sfShape_setFillColor(shape: CValuesRef<sfShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge476(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfShape_setOutlineColor(shape: CValuesRef<sfShape>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge477(shape?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfShape_setOutlineThickness(shape: CValuesRef<sfShape>?, thickness: Float): Unit {
    memScoped {
        return kniBridge478(shape?.getPointer(memScope).rawValue, thickness)
    }
}

fun sfShape_getTexture(shape: CValuesRef<sfShape>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge479(shape?.getPointer(memScope).rawValue))
    }
}

fun sfShape_getTextureRect(shape: CValuesRef<sfShape>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge480(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getFillColor(shape: CValuesRef<sfShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge481(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getOutlineColor(shape: CValuesRef<sfShape>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge482(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getOutlineThickness(shape: CValuesRef<sfShape>?): Float {
    memScoped {
        return kniBridge483(shape?.getPointer(memScope).rawValue)
    }
}

fun sfShape_getPointCount(shape: CValuesRef<sfShape>?): size_t {
    memScoped {
        return kniBridge484(shape?.getPointer(memScope).rawValue)
    }
}

fun sfShape_getPoint(shape: CValuesRef<sfShape>?, index: size_t): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge485(shape?.getPointer(memScope).rawValue, index, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getLocalBounds(shape: CValuesRef<sfShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge486(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_getGlobalBounds(shape: CValuesRef<sfShape>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge487(shape?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfShape_update(shape: CValuesRef<sfShape>?): Unit {
    memScoped {
        return kniBridge488(shape?.getPointer(memScope).rawValue)
    }
}

fun sfSprite_create(): CPointer<sfSprite>? {
    return interpretCPointer<sfSprite>(kniBridge489())
}

fun sfSprite_copy(sprite: CValuesRef<sfSprite>?): CPointer<sfSprite>? {
    memScoped {
        return interpretCPointer<sfSprite>(kniBridge490(sprite?.getPointer(memScope).rawValue))
    }
}

fun sfSprite_destroy(sprite: CValuesRef<sfSprite>?): Unit {
    memScoped {
        return kniBridge491(sprite?.getPointer(memScope).rawValue)
    }
}

fun sfSprite_setPosition(sprite: CValuesRef<sfSprite>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge492(sprite?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfSprite_setRotation(sprite: CValuesRef<sfSprite>?, angle: Float): Unit {
    memScoped {
        return kniBridge493(sprite?.getPointer(memScope).rawValue, angle)
    }
}

fun sfSprite_setScale(sprite: CValuesRef<sfSprite>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge494(sprite?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfSprite_setOrigin(sprite: CValuesRef<sfSprite>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge495(sprite?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfSprite_getPosition(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge496(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_getRotation(sprite: CValuesRef<sfSprite>?): Float {
    memScoped {
        return kniBridge497(sprite?.getPointer(memScope).rawValue)
    }
}

fun sfSprite_getScale(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge498(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_getOrigin(sprite: CValuesRef<sfSprite>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge499(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_move(sprite: CValuesRef<sfSprite>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge500(sprite?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfSprite_rotate(sprite: CValuesRef<sfSprite>?, angle: Float): Unit {
    memScoped {
        return kniBridge501(sprite?.getPointer(memScope).rawValue, angle)
    }
}

fun sfSprite_scale(sprite: CValuesRef<sfSprite>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge502(sprite?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfSprite_getTransform(sprite: CValuesRef<sfSprite>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge503(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_getInverseTransform(sprite: CValuesRef<sfSprite>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge504(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_setTexture(sprite: CValuesRef<sfSprite>?, texture: CValuesRef<sfTexture>?, resetRect: sfBool): Unit {
    memScoped {
        return kniBridge505(sprite?.getPointer(memScope).rawValue, texture?.getPointer(memScope).rawValue, resetRect)
    }
}

fun sfSprite_setTextureRect(sprite: CValuesRef<sfSprite>?, rectangle: CValue<sfIntRect>): Unit {
    memScoped {
        return kniBridge506(sprite?.getPointer(memScope).rawValue, rectangle.getPointer(memScope).rawValue)
    }
}

fun sfSprite_setColor(sprite: CValuesRef<sfSprite>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge507(sprite?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfSprite_getTexture(sprite: CValuesRef<sfSprite>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge508(sprite?.getPointer(memScope).rawValue))
    }
}

fun sfSprite_getTextureRect(sprite: CValuesRef<sfSprite>?): CValue<sfIntRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIntRect>()
        try {
            kniBridge509(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_getColor(sprite: CValuesRef<sfSprite>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge510(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_getLocalBounds(sprite: CValuesRef<sfSprite>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge511(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfSprite_getGlobalBounds(sprite: CValuesRef<sfSprite>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge512(sprite?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_create(): CPointer<sfText>? {
    return interpretCPointer<sfText>(kniBridge513())
}

fun sfText_copy(text: CValuesRef<sfText>?): CPointer<sfText>? {
    memScoped {
        return interpretCPointer<sfText>(kniBridge514(text?.getPointer(memScope).rawValue))
    }
}

fun sfText_destroy(text: CValuesRef<sfText>?): Unit {
    memScoped {
        return kniBridge515(text?.getPointer(memScope).rawValue)
    }
}

fun sfText_setPosition(text: CValuesRef<sfText>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge516(text?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfText_setRotation(text: CValuesRef<sfText>?, angle: Float): Unit {
    memScoped {
        return kniBridge517(text?.getPointer(memScope).rawValue, angle)
    }
}

fun sfText_setScale(text: CValuesRef<sfText>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge518(text?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfText_setOrigin(text: CValuesRef<sfText>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge519(text?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfText_getPosition(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge520(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getRotation(text: CValuesRef<sfText>?): Float {
    memScoped {
        return kniBridge521(text?.getPointer(memScope).rawValue)
    }
}

fun sfText_getScale(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge522(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getOrigin(text: CValuesRef<sfText>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge523(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_move(text: CValuesRef<sfText>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge524(text?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfText_rotate(text: CValuesRef<sfText>?, angle: Float): Unit {
    memScoped {
        return kniBridge525(text?.getPointer(memScope).rawValue, angle)
    }
}

fun sfText_scale(text: CValuesRef<sfText>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge526(text?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfText_getTransform(text: CValuesRef<sfText>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge527(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getInverseTransform(text: CValuesRef<sfText>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge528(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_setString(text: CValuesRef<sfText>?, string: String?): Unit {
    memScoped {
        return kniBridge529(text?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfText_setUnicodeString(text: CValuesRef<sfText>?, string: CValuesRef<sfUint32Var>?): Unit {
    memScoped {
        return kniBridge530(text?.getPointer(memScope).rawValue, string?.getPointer(memScope).rawValue)
    }
}

fun sfText_setFont(text: CValuesRef<sfText>?, font: CValuesRef<sfFont>?): Unit {
    memScoped {
        return kniBridge531(text?.getPointer(memScope).rawValue, font?.getPointer(memScope).rawValue)
    }
}

fun sfText_setCharacterSize(text: CValuesRef<sfText>?, size: UInt): Unit {
    memScoped {
        return kniBridge532(text?.getPointer(memScope).rawValue, size)
    }
}

fun sfText_setStyle(text: CValuesRef<sfText>?, style: sfUint32): Unit {
    memScoped {
        return kniBridge533(text?.getPointer(memScope).rawValue, style)
    }
}

fun sfText_setColor(text: CValuesRef<sfText>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge534(text?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfText_setFillColor(text: CValuesRef<sfText>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge535(text?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfText_setOutlineColor(text: CValuesRef<sfText>?, color: CValue<sfColor>): Unit {
    memScoped {
        return kniBridge536(text?.getPointer(memScope).rawValue, color.getPointer(memScope).rawValue)
    }
}

fun sfText_setOutlineThickness(text: CValuesRef<sfText>?, thickness: Float): Unit {
    memScoped {
        return kniBridge537(text?.getPointer(memScope).rawValue, thickness)
    }
}

fun sfText_getString(text: CValuesRef<sfText>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge538(text?.getPointer(memScope).rawValue))
    }
}

fun sfText_getUnicodeString(text: CValuesRef<sfText>?): CPointer<sfUint32Var>? {
    memScoped {
        return interpretCPointer<sfUint32Var>(kniBridge539(text?.getPointer(memScope).rawValue))
    }
}

fun sfText_getFont(text: CValuesRef<sfText>?): CPointer<sfFont>? {
    memScoped {
        return interpretCPointer<sfFont>(kniBridge540(text?.getPointer(memScope).rawValue))
    }
}

fun sfText_getCharacterSize(text: CValuesRef<sfText>?): UInt {
    memScoped {
        return kniBridge541(text?.getPointer(memScope).rawValue)
    }
}

fun sfText_getStyle(text: CValuesRef<sfText>?): sfUint32 {
    memScoped {
        return kniBridge542(text?.getPointer(memScope).rawValue)
    }
}

fun sfText_getColor(text: CValuesRef<sfText>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge543(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getFillColor(text: CValuesRef<sfText>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge544(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getOutlineColor(text: CValuesRef<sfText>?): CValue<sfColor> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfColor>()
        try {
            kniBridge545(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getOutlineThickness(text: CValuesRef<sfText>?): Float {
    memScoped {
        return kniBridge546(text?.getPointer(memScope).rawValue)
    }
}

fun sfText_findCharacterPos(text: CValuesRef<sfText>?, index: size_t): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge547(text?.getPointer(memScope).rawValue, index, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getLocalBounds(text: CValuesRef<sfText>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge548(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfText_getGlobalBounds(text: CValuesRef<sfText>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge549(text?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTexture_create(width: UInt, height: UInt): CPointer<sfTexture>? {
    return interpretCPointer<sfTexture>(kniBridge550(width, height))
}

fun sfTexture_createFromFile(filename: String?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge551(filename?.cstr?.getPointer(memScope).rawValue, area?.getPointer(memScope).rawValue))
    }
}

fun sfTexture_createFromMemory(data: CValuesRef<*>?, sizeInBytes: size_t, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge552(data?.getPointer(memScope).rawValue, sizeInBytes, area?.getPointer(memScope).rawValue))
    }
}

fun sfTexture_createFromStream(stream: CValuesRef<sfInputStream>?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge553(stream?.getPointer(memScope).rawValue, area?.getPointer(memScope).rawValue))
    }
}

fun sfTexture_createFromImage(image: CValuesRef<sfImage>?, area: CValuesRef<sfIntRect>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge554(image?.getPointer(memScope).rawValue, area?.getPointer(memScope).rawValue))
    }
}

fun sfTexture_copy(texture: CValuesRef<sfTexture>?): CPointer<sfTexture>? {
    memScoped {
        return interpretCPointer<sfTexture>(kniBridge555(texture?.getPointer(memScope).rawValue))
    }
}

fun sfTexture_destroy(texture: CValuesRef<sfTexture>?): Unit {
    memScoped {
        return kniBridge556(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_getSize(texture: CValuesRef<sfTexture>?): CValue<sfVector2u> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2u>()
        try {
            kniBridge557(texture?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTexture_copyToImage(texture: CValuesRef<sfTexture>?): CPointer<sfImage>? {
    memScoped {
        return interpretCPointer<sfImage>(kniBridge558(texture?.getPointer(memScope).rawValue))
    }
}

fun sfTexture_updateFromPixels(texture: CValuesRef<sfTexture>?, pixels: CValuesRef<sfUint8Var>?, width: UInt, height: UInt, x: UInt, y: UInt): Unit {
    memScoped {
        return kniBridge559(texture?.getPointer(memScope).rawValue, pixels?.getPointer(memScope).rawValue, width, height, x, y)
    }
}

fun sfTexture_updateFromImage(texture: CValuesRef<sfTexture>?, image: CValuesRef<sfImage>?, x: UInt, y: UInt): Unit {
    memScoped {
        return kniBridge560(texture?.getPointer(memScope).rawValue, image?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfTexture_updateFromWindow(texture: CValuesRef<sfTexture>?, window: CValuesRef<sfWindow>?, x: UInt, y: UInt): Unit {
    memScoped {
        return kniBridge561(texture?.getPointer(memScope).rawValue, window?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfTexture_updateFromRenderWindow(texture: CValuesRef<sfTexture>?, renderWindow: CValuesRef<sfRenderWindow>?, x: UInt, y: UInt): Unit {
    memScoped {
        return kniBridge562(texture?.getPointer(memScope).rawValue, renderWindow?.getPointer(memScope).rawValue, x, y)
    }
}

fun sfTexture_setSmooth(texture: CValuesRef<sfTexture>?, smooth: sfBool): Unit {
    memScoped {
        return kniBridge563(texture?.getPointer(memScope).rawValue, smooth)
    }
}

fun sfTexture_isSmooth(texture: CValuesRef<sfTexture>?): sfBool {
    memScoped {
        return kniBridge564(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_setSrgb(texture: CValuesRef<sfTexture>?, sRgb: sfBool): Unit {
    memScoped {
        return kniBridge565(texture?.getPointer(memScope).rawValue, sRgb)
    }
}

fun sfTexture_isSrgb(texture: CValuesRef<sfTexture>?): sfBool {
    memScoped {
        return kniBridge566(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_setRepeated(texture: CValuesRef<sfTexture>?, repeated: sfBool): Unit {
    memScoped {
        return kniBridge567(texture?.getPointer(memScope).rawValue, repeated)
    }
}

fun sfTexture_isRepeated(texture: CValuesRef<sfTexture>?): sfBool {
    memScoped {
        return kniBridge568(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_generateMipmap(texture: CValuesRef<sfTexture>?): sfBool {
    memScoped {
        return kniBridge569(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_getNativeHandle(texture: CValuesRef<sfTexture>?): UInt {
    memScoped {
        return kniBridge570(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_bind(texture: CValuesRef<sfTexture>?): Unit {
    memScoped {
        return kniBridge571(texture?.getPointer(memScope).rawValue)
    }
}

fun sfTexture_getMaximumSize(): UInt {
    return kniBridge572()
}

fun sfTransformable_create(): CPointer<sfTransformable>? {
    return interpretCPointer<sfTransformable>(kniBridge573())
}

fun sfTransformable_copy(transformable: CValuesRef<sfTransformable>?): CPointer<sfTransformable>? {
    memScoped {
        return interpretCPointer<sfTransformable>(kniBridge574(transformable?.getPointer(memScope).rawValue))
    }
}

fun sfTransformable_destroy(transformable: CValuesRef<sfTransformable>?): Unit {
    memScoped {
        return kniBridge575(transformable?.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_setPosition(transformable: CValuesRef<sfTransformable>?, position: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge576(transformable?.getPointer(memScope).rawValue, position.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_setRotation(transformable: CValuesRef<sfTransformable>?, angle: Float): Unit {
    memScoped {
        return kniBridge577(transformable?.getPointer(memScope).rawValue, angle)
    }
}

fun sfTransformable_setScale(transformable: CValuesRef<sfTransformable>?, scale: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge578(transformable?.getPointer(memScope).rawValue, scale.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_setOrigin(transformable: CValuesRef<sfTransformable>?, origin: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge579(transformable?.getPointer(memScope).rawValue, origin.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_getPosition(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge580(transformable?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransformable_getRotation(transformable: CValuesRef<sfTransformable>?): Float {
    memScoped {
        return kniBridge581(transformable?.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_getScale(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge582(transformable?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransformable_getOrigin(transformable: CValuesRef<sfTransformable>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge583(transformable?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransformable_move(transformable: CValuesRef<sfTransformable>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge584(transformable?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_rotate(transformable: CValuesRef<sfTransformable>?, angle: Float): Unit {
    memScoped {
        return kniBridge585(transformable?.getPointer(memScope).rawValue, angle)
    }
}

fun sfTransformable_scale(transformable: CValuesRef<sfTransformable>?, factors: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge586(transformable?.getPointer(memScope).rawValue, factors.getPointer(memScope).rawValue)
    }
}

fun sfTransformable_getTransform(transformable: CValuesRef<sfTransformable>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge587(transformable?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTransformable_getInverseTransform(transformable: CValuesRef<sfTransformable>?): CValue<sfTransform> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfTransform>()
        try {
            kniBridge588(transformable?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfVertexArray_create(): CPointer<sfVertexArray>? {
    return interpretCPointer<sfVertexArray>(kniBridge589())
}

fun sfVertexArray_copy(vertexArray: CValuesRef<sfVertexArray>?): CPointer<sfVertexArray>? {
    memScoped {
        return interpretCPointer<sfVertexArray>(kniBridge590(vertexArray?.getPointer(memScope).rawValue))
    }
}

fun sfVertexArray_destroy(vertexArray: CValuesRef<sfVertexArray>?): Unit {
    memScoped {
        return kniBridge591(vertexArray?.getPointer(memScope).rawValue)
    }
}

fun sfVertexArray_getVertexCount(vertexArray: CValuesRef<sfVertexArray>?): size_t {
    memScoped {
        return kniBridge592(vertexArray?.getPointer(memScope).rawValue)
    }
}

fun sfVertexArray_getVertex(vertexArray: CValuesRef<sfVertexArray>?, index: size_t): CPointer<sfVertex>? {
    memScoped {
        return interpretCPointer<sfVertex>(kniBridge593(vertexArray?.getPointer(memScope).rawValue, index))
    }
}

fun sfVertexArray_clear(vertexArray: CValuesRef<sfVertexArray>?): Unit {
    memScoped {
        return kniBridge594(vertexArray?.getPointer(memScope).rawValue)
    }
}

fun sfVertexArray_resize(vertexArray: CValuesRef<sfVertexArray>?, vertexCount: size_t): Unit {
    memScoped {
        return kniBridge595(vertexArray?.getPointer(memScope).rawValue, vertexCount)
    }
}

fun sfVertexArray_append(vertexArray: CValuesRef<sfVertexArray>?, vertex: CValue<sfVertex>): Unit {
    memScoped {
        return kniBridge596(vertexArray?.getPointer(memScope).rawValue, vertex.getPointer(memScope).rawValue)
    }
}

fun sfVertexArray_setPrimitiveType(vertexArray: CValuesRef<sfVertexArray>?, type: sfPrimitiveType): Unit {
    memScoped {
        return kniBridge597(vertexArray?.getPointer(memScope).rawValue, type)
    }
}

fun sfVertexArray_getPrimitiveType(vertexArray: CValuesRef<sfVertexArray>?): sfPrimitiveType {
    memScoped {
        return kniBridge598(vertexArray?.getPointer(memScope).rawValue)
    }
}

fun sfVertexArray_getBounds(vertexArray: CValuesRef<sfVertexArray>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge599(vertexArray?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfView_create(): CPointer<sfView>? {
    return interpretCPointer<sfView>(kniBridge600())
}

fun sfView_createFromRect(rectangle: CValue<sfFloatRect>): CPointer<sfView>? {
    memScoped {
        return interpretCPointer<sfView>(kniBridge601(rectangle.getPointer(memScope).rawValue))
    }
}

fun sfView_copy(view: CValuesRef<sfView>?): CPointer<sfView>? {
    memScoped {
        return interpretCPointer<sfView>(kniBridge602(view?.getPointer(memScope).rawValue))
    }
}

fun sfView_destroy(view: CValuesRef<sfView>?): Unit {
    memScoped {
        return kniBridge603(view?.getPointer(memScope).rawValue)
    }
}

fun sfView_setCenter(view: CValuesRef<sfView>?, center: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge604(view?.getPointer(memScope).rawValue, center.getPointer(memScope).rawValue)
    }
}

fun sfView_setSize(view: CValuesRef<sfView>?, size: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge605(view?.getPointer(memScope).rawValue, size.getPointer(memScope).rawValue)
    }
}

fun sfView_setRotation(view: CValuesRef<sfView>?, angle: Float): Unit {
    memScoped {
        return kniBridge606(view?.getPointer(memScope).rawValue, angle)
    }
}

fun sfView_setViewport(view: CValuesRef<sfView>?, viewport: CValue<sfFloatRect>): Unit {
    memScoped {
        return kniBridge607(view?.getPointer(memScope).rawValue, viewport.getPointer(memScope).rawValue)
    }
}

fun sfView_reset(view: CValuesRef<sfView>?, rectangle: CValue<sfFloatRect>): Unit {
    memScoped {
        return kniBridge608(view?.getPointer(memScope).rawValue, rectangle.getPointer(memScope).rawValue)
    }
}

fun sfView_getCenter(view: CValuesRef<sfView>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge609(view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfView_getSize(view: CValuesRef<sfView>?): CValue<sfVector2f> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfVector2f>()
        try {
            kniBridge610(view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfView_getRotation(view: CValuesRef<sfView>?): Float {
    memScoped {
        return kniBridge611(view?.getPointer(memScope).rawValue)
    }
}

fun sfView_getViewport(view: CValuesRef<sfView>?): CValue<sfFloatRect> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfFloatRect>()
        try {
            kniBridge612(view?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfView_move(view: CValuesRef<sfView>?, offset: CValue<sfVector2f>): Unit {
    memScoped {
        return kniBridge613(view?.getPointer(memScope).rawValue, offset.getPointer(memScope).rawValue)
    }
}

fun sfView_rotate(view: CValuesRef<sfView>?, angle: Float): Unit {
    memScoped {
        return kniBridge614(view?.getPointer(memScope).rawValue, angle)
    }
}

fun sfView_zoom(view: CValuesRef<sfView>?, factor: Float): Unit {
    memScoped {
        return kniBridge615(view?.getPointer(memScope).rawValue, factor)
    }
}

fun sfIpAddress_fromString(address: String?): CValue<sfIpAddress> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIpAddress>()
        try {
            kniBridge616(address?.cstr?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfIpAddress_fromBytes(byte0: sfUint8, byte1: sfUint8, byte2: sfUint8, byte3: sfUint8): CValue<sfIpAddress> {
    val kniRetVal = nativeHeap.alloc<sfIpAddress>()
    try {
        kniBridge617(byte0, byte1, byte2, byte3, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfIpAddress_fromInteger(address: sfUint32): CValue<sfIpAddress> {
    val kniRetVal = nativeHeap.alloc<sfIpAddress>()
    try {
        kniBridge618(address, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfIpAddress_toString(address: CValue<sfIpAddress>, string: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge619(address.getPointer(memScope).rawValue, string?.getPointer(memScope).rawValue)
    }
}

fun sfIpAddress_toInteger(address: CValue<sfIpAddress>): sfUint32 {
    memScoped {
        return kniBridge620(address.getPointer(memScope).rawValue)
    }
}

fun sfIpAddress_getLocalAddress(): CValue<sfIpAddress> {
    val kniRetVal = nativeHeap.alloc<sfIpAddress>()
    try {
        kniBridge621(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun sfIpAddress_getPublicAddress(timeout: CValue<sfTime>): CValue<sfIpAddress> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIpAddress>()
        try {
            kniBridge622(timeout.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfFtpListingResponse_destroy(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): Unit {
    memScoped {
        return kniBridge623(ftpListingResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpListingResponse_isOk(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): sfBool {
    memScoped {
        return kniBridge624(ftpListingResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpListingResponse_getStatus(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): sfFtpStatus {
    memScoped {
        return kniBridge625(ftpListingResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpListingResponse_getMessage(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge626(ftpListingResponse?.getPointer(memScope).rawValue))
    }
}

fun sfFtpListingResponse_getCount(ftpListingResponse: CValuesRef<sfFtpListingResponse>?): size_t {
    memScoped {
        return kniBridge627(ftpListingResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpListingResponse_getName(ftpListingResponse: CValuesRef<sfFtpListingResponse>?, index: size_t): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge628(ftpListingResponse?.getPointer(memScope).rawValue, index))
    }
}

fun sfFtpDirectoryResponse_destroy(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): Unit {
    memScoped {
        return kniBridge629(ftpDirectoryResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpDirectoryResponse_isOk(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): sfBool {
    memScoped {
        return kniBridge630(ftpDirectoryResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpDirectoryResponse_getStatus(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): sfFtpStatus {
    memScoped {
        return kniBridge631(ftpDirectoryResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpDirectoryResponse_getMessage(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge632(ftpDirectoryResponse?.getPointer(memScope).rawValue))
    }
}

fun sfFtpDirectoryResponse_getDirectory(ftpDirectoryResponse: CValuesRef<sfFtpDirectoryResponse>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge633(ftpDirectoryResponse?.getPointer(memScope).rawValue))
    }
}

fun sfFtpResponse_destroy(ftpResponse: CValuesRef<sfFtpResponse>?): Unit {
    memScoped {
        return kniBridge634(ftpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpResponse_isOk(ftpResponse: CValuesRef<sfFtpResponse>?): sfBool {
    memScoped {
        return kniBridge635(ftpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpResponse_getStatus(ftpResponse: CValuesRef<sfFtpResponse>?): sfFtpStatus {
    memScoped {
        return kniBridge636(ftpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfFtpResponse_getMessage(ftpResponse: CValuesRef<sfFtpResponse>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge637(ftpResponse?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_create(): CPointer<sfFtp>? {
    return interpretCPointer<sfFtp>(kniBridge638())
}

fun sfFtp_destroy(ftp: CValuesRef<sfFtp>?): Unit {
    memScoped {
        return kniBridge639(ftp?.getPointer(memScope).rawValue)
    }
}

fun sfFtp_connect(ftp: CValuesRef<sfFtp>?, server: CValue<sfIpAddress>, port: UShort, timeout: CValue<sfTime>): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge640(ftp?.getPointer(memScope).rawValue, server.getPointer(memScope).rawValue, port, timeout.getPointer(memScope).rawValue))
    }
}

fun sfFtp_loginAnonymous(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge641(ftp?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_login(ftp: CValuesRef<sfFtp>?, name: String?, password: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge642(ftp?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue, password?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_disconnect(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge643(ftp?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_keepAlive(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge644(ftp?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_getWorkingDirectory(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpDirectoryResponse>? {
    memScoped {
        return interpretCPointer<sfFtpDirectoryResponse>(kniBridge645(ftp?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_getDirectoryListing(ftp: CValuesRef<sfFtp>?, directory: String?): CPointer<sfFtpListingResponse>? {
    memScoped {
        return interpretCPointer<sfFtpListingResponse>(kniBridge646(ftp?.getPointer(memScope).rawValue, directory?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_changeDirectory(ftp: CValuesRef<sfFtp>?, directory: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge647(ftp?.getPointer(memScope).rawValue, directory?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_parentDirectory(ftp: CValuesRef<sfFtp>?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge648(ftp?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_createDirectory(ftp: CValuesRef<sfFtp>?, name: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge649(ftp?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_deleteDirectory(ftp: CValuesRef<sfFtp>?, name: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge650(ftp?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_renameFile(ftp: CValuesRef<sfFtp>?, file: String?, newName: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge651(ftp?.getPointer(memScope).rawValue, file?.cstr?.getPointer(memScope).rawValue, newName?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_deleteFile(ftp: CValuesRef<sfFtp>?, name: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge652(ftp?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfFtp_download(ftp: CValuesRef<sfFtp>?, remoteFile: String?, localPath: String?, mode: sfFtpTransferMode): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge653(ftp?.getPointer(memScope).rawValue, remoteFile?.cstr?.getPointer(memScope).rawValue, localPath?.cstr?.getPointer(memScope).rawValue, mode.value))
    }
}

fun sfFtp_upload(ftp: CValuesRef<sfFtp>?, localFile: String?, remotePath: String?, mode: sfFtpTransferMode): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge654(ftp?.getPointer(memScope).rawValue, localFile?.cstr?.getPointer(memScope).rawValue, remotePath?.cstr?.getPointer(memScope).rawValue, mode.value))
    }
}

fun sfFtp_sendCommand(ftp: CValuesRef<sfFtp>?, command: String?, parameter: String?): CPointer<sfFtpResponse>? {
    memScoped {
        return interpretCPointer<sfFtpResponse>(kniBridge655(ftp?.getPointer(memScope).rawValue, command?.cstr?.getPointer(memScope).rawValue, parameter?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfHttpRequest_create(): CPointer<sfHttpRequest>? {
    return interpretCPointer<sfHttpRequest>(kniBridge656())
}

fun sfHttpRequest_destroy(httpRequest: CValuesRef<sfHttpRequest>?): Unit {
    memScoped {
        return kniBridge657(httpRequest?.getPointer(memScope).rawValue)
    }
}

fun sfHttpRequest_setField(httpRequest: CValuesRef<sfHttpRequest>?, field: String?, value: String?): Unit {
    memScoped {
        return kniBridge658(httpRequest?.getPointer(memScope).rawValue, field?.cstr?.getPointer(memScope).rawValue, value?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfHttpRequest_setMethod(httpRequest: CValuesRef<sfHttpRequest>?, method: sfHttpMethod): Unit {
    memScoped {
        return kniBridge659(httpRequest?.getPointer(memScope).rawValue, method.value)
    }
}

fun sfHttpRequest_setUri(httpRequest: CValuesRef<sfHttpRequest>?, uri: String?): Unit {
    memScoped {
        return kniBridge660(httpRequest?.getPointer(memScope).rawValue, uri?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfHttpRequest_setHttpVersion(httpRequest: CValuesRef<sfHttpRequest>?, major: UInt, minor: UInt): Unit {
    memScoped {
        return kniBridge661(httpRequest?.getPointer(memScope).rawValue, major, minor)
    }
}

fun sfHttpRequest_setBody(httpRequest: CValuesRef<sfHttpRequest>?, body: String?): Unit {
    memScoped {
        return kniBridge662(httpRequest?.getPointer(memScope).rawValue, body?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfHttpResponse_destroy(httpResponse: CValuesRef<sfHttpResponse>?): Unit {
    memScoped {
        return kniBridge663(httpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfHttpResponse_getField(httpResponse: CValuesRef<sfHttpResponse>?, field: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge664(httpResponse?.getPointer(memScope).rawValue, field?.cstr?.getPointer(memScope).rawValue))
    }
}

fun sfHttpResponse_getStatus(httpResponse: CValuesRef<sfHttpResponse>?): sfHttpStatus {
    memScoped {
        return kniBridge665(httpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfHttpResponse_getMajorVersion(httpResponse: CValuesRef<sfHttpResponse>?): UInt {
    memScoped {
        return kniBridge666(httpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfHttpResponse_getMinorVersion(httpResponse: CValuesRef<sfHttpResponse>?): UInt {
    memScoped {
        return kniBridge667(httpResponse?.getPointer(memScope).rawValue)
    }
}

fun sfHttpResponse_getBody(httpResponse: CValuesRef<sfHttpResponse>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge668(httpResponse?.getPointer(memScope).rawValue))
    }
}

fun sfHttp_create(): CPointer<sfHttp>? {
    return interpretCPointer<sfHttp>(kniBridge669())
}

fun sfHttp_destroy(http: CValuesRef<sfHttp>?): Unit {
    memScoped {
        return kniBridge670(http?.getPointer(memScope).rawValue)
    }
}

fun sfHttp_setHost(http: CValuesRef<sfHttp>?, host: String?, port: UShort): Unit {
    memScoped {
        return kniBridge671(http?.getPointer(memScope).rawValue, host?.cstr?.getPointer(memScope).rawValue, port)
    }
}

fun sfHttp_sendRequest(http: CValuesRef<sfHttp>?, request: CValuesRef<sfHttpRequest>?, timeout: CValue<sfTime>): CPointer<sfHttpResponse>? {
    memScoped {
        return interpretCPointer<sfHttpResponse>(kniBridge672(http?.getPointer(memScope).rawValue, request?.getPointer(memScope).rawValue, timeout.getPointer(memScope).rawValue))
    }
}

fun sfPacket_create(): CPointer<sfPacket>? {
    return interpretCPointer<sfPacket>(kniBridge673())
}

fun sfPacket_copy(packet: CValuesRef<sfPacket>?): CPointer<sfPacket>? {
    memScoped {
        return interpretCPointer<sfPacket>(kniBridge674(packet?.getPointer(memScope).rawValue))
    }
}

fun sfPacket_destroy(packet: CValuesRef<sfPacket>?): Unit {
    memScoped {
        return kniBridge675(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_append(packet: CValuesRef<sfPacket>?, data: CValuesRef<*>?, sizeInBytes: size_t): Unit {
    memScoped {
        return kniBridge676(packet?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, sizeInBytes)
    }
}

fun sfPacket_clear(packet: CValuesRef<sfPacket>?): Unit {
    memScoped {
        return kniBridge677(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_getData(packet: CValuesRef<sfPacket>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge678(packet?.getPointer(memScope).rawValue))
    }
}

fun sfPacket_getDataSize(packet: CValuesRef<sfPacket>?): size_t {
    memScoped {
        return kniBridge679(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_endOfPacket(packet: CValuesRef<sfPacket>?): sfBool {
    memScoped {
        return kniBridge680(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_canRead(packet: CValuesRef<sfPacket>?): sfBool {
    memScoped {
        return kniBridge681(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readBool(packet: CValuesRef<sfPacket>?): sfBool {
    memScoped {
        return kniBridge682(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readInt8(packet: CValuesRef<sfPacket>?): sfInt8 {
    memScoped {
        return kniBridge683(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readUint8(packet: CValuesRef<sfPacket>?): sfUint8 {
    memScoped {
        return kniBridge684(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readInt16(packet: CValuesRef<sfPacket>?): sfInt16 {
    memScoped {
        return kniBridge685(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readUint16(packet: CValuesRef<sfPacket>?): sfUint16 {
    memScoped {
        return kniBridge686(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readInt32(packet: CValuesRef<sfPacket>?): sfInt32 {
    memScoped {
        return kniBridge687(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readUint32(packet: CValuesRef<sfPacket>?): sfUint32 {
    memScoped {
        return kniBridge688(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readFloat(packet: CValuesRef<sfPacket>?): Float {
    memScoped {
        return kniBridge689(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readDouble(packet: CValuesRef<sfPacket>?): Double {
    memScoped {
        return kniBridge690(packet?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readString(packet: CValuesRef<sfPacket>?, string: CValuesRef<ByteVar>?): Unit {
    memScoped {
        return kniBridge691(packet?.getPointer(memScope).rawValue, string?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_readWideString(packet: CValuesRef<sfPacket>?, string: CValuesRef<wchar_tVar>?): Unit {
    memScoped {
        return kniBridge692(packet?.getPointer(memScope).rawValue, string?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_writeBool(packet: CValuesRef<sfPacket>?, arg1: sfBool): Unit {
    memScoped {
        return kniBridge693(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeInt8(packet: CValuesRef<sfPacket>?, arg1: sfInt8): Unit {
    memScoped {
        return kniBridge694(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeUint8(packet: CValuesRef<sfPacket>?, arg1: sfUint8): Unit {
    memScoped {
        return kniBridge695(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeInt16(packet: CValuesRef<sfPacket>?, arg1: sfInt16): Unit {
    memScoped {
        return kniBridge696(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeUint16(packet: CValuesRef<sfPacket>?, arg1: sfUint16): Unit {
    memScoped {
        return kniBridge697(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeInt32(packet: CValuesRef<sfPacket>?, arg1: sfInt32): Unit {
    memScoped {
        return kniBridge698(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeUint32(packet: CValuesRef<sfPacket>?, arg1: sfUint32): Unit {
    memScoped {
        return kniBridge699(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeFloat(packet: CValuesRef<sfPacket>?, arg1: Float): Unit {
    memScoped {
        return kniBridge700(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeDouble(packet: CValuesRef<sfPacket>?, arg1: Double): Unit {
    memScoped {
        return kniBridge701(packet?.getPointer(memScope).rawValue, arg1)
    }
}

fun sfPacket_writeString(packet: CValuesRef<sfPacket>?, string: String?): Unit {
    memScoped {
        return kniBridge702(packet?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun sfPacket_writeWideString(packet: CValuesRef<sfPacket>?, string: CValuesRef<wchar_tVar>?): Unit {
    memScoped {
        return kniBridge703(packet?.getPointer(memScope).rawValue, string?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_create(): CPointer<sfSocketSelector>? {
    return interpretCPointer<sfSocketSelector>(kniBridge704())
}

fun sfSocketSelector_copy(selector: CValuesRef<sfSocketSelector>?): CPointer<sfSocketSelector>? {
    memScoped {
        return interpretCPointer<sfSocketSelector>(kniBridge705(selector?.getPointer(memScope).rawValue))
    }
}

fun sfSocketSelector_destroy(selector: CValuesRef<sfSocketSelector>?): Unit {
    memScoped {
        return kniBridge706(selector?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_addTcpListener(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpListener>?): Unit {
    memScoped {
        return kniBridge707(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_addTcpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpSocket>?): Unit {
    memScoped {
        return kniBridge708(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_addUdpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfUdpSocket>?): Unit {
    memScoped {
        return kniBridge709(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_removeTcpListener(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpListener>?): Unit {
    memScoped {
        return kniBridge710(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_removeTcpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpSocket>?): Unit {
    memScoped {
        return kniBridge711(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_removeUdpSocket(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfUdpSocket>?): Unit {
    memScoped {
        return kniBridge712(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_clear(selector: CValuesRef<sfSocketSelector>?): Unit {
    memScoped {
        return kniBridge713(selector?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_wait(selector: CValuesRef<sfSocketSelector>?, timeout: CValue<sfTime>): sfBool {
    memScoped {
        return kniBridge714(selector?.getPointer(memScope).rawValue, timeout.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_isTcpListenerReady(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpListener>?): sfBool {
    memScoped {
        return kniBridge715(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_isTcpSocketReady(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfTcpSocket>?): sfBool {
    memScoped {
        return kniBridge716(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfSocketSelector_isUdpSocketReady(selector: CValuesRef<sfSocketSelector>?, socket: CValuesRef<sfUdpSocket>?): sfBool {
    memScoped {
        return kniBridge717(selector?.getPointer(memScope).rawValue, socket?.getPointer(memScope).rawValue)
    }
}

fun sfTcpListener_create(): CPointer<sfTcpListener>? {
    return interpretCPointer<sfTcpListener>(kniBridge718())
}

fun sfTcpListener_destroy(listener: CValuesRef<sfTcpListener>?): Unit {
    memScoped {
        return kniBridge719(listener?.getPointer(memScope).rawValue)
    }
}

fun sfTcpListener_setBlocking(listener: CValuesRef<sfTcpListener>?, blocking: sfBool): Unit {
    memScoped {
        return kniBridge720(listener?.getPointer(memScope).rawValue, blocking)
    }
}

fun sfTcpListener_isBlocking(listener: CValuesRef<sfTcpListener>?): sfBool {
    memScoped {
        return kniBridge721(listener?.getPointer(memScope).rawValue)
    }
}

fun sfTcpListener_getLocalPort(listener: CValuesRef<sfTcpListener>?): UShort {
    memScoped {
        return kniBridge722(listener?.getPointer(memScope).rawValue)
    }
}

fun sfTcpListener_listen(listener: CValuesRef<sfTcpListener>?, port: UShort, address: CValue<sfIpAddress>): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge723(listener?.getPointer(memScope).rawValue, port, address.getPointer(memScope).rawValue))
    }
}

fun sfTcpListener_accept(listener: CValuesRef<sfTcpListener>?, connected: CValuesRef<CPointerVar<sfTcpSocket>>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge724(listener?.getPointer(memScope).rawValue, connected?.getPointer(memScope).rawValue))
    }
}

fun sfTcpSocket_create(): CPointer<sfTcpSocket>? {
    return interpretCPointer<sfTcpSocket>(kniBridge725())
}

fun sfTcpSocket_destroy(socket: CValuesRef<sfTcpSocket>?): Unit {
    memScoped {
        return kniBridge726(socket?.getPointer(memScope).rawValue)
    }
}

fun sfTcpSocket_setBlocking(socket: CValuesRef<sfTcpSocket>?, blocking: sfBool): Unit {
    memScoped {
        return kniBridge727(socket?.getPointer(memScope).rawValue, blocking)
    }
}

fun sfTcpSocket_isBlocking(socket: CValuesRef<sfTcpSocket>?): sfBool {
    memScoped {
        return kniBridge728(socket?.getPointer(memScope).rawValue)
    }
}

fun sfTcpSocket_getLocalPort(socket: CValuesRef<sfTcpSocket>?): UShort {
    memScoped {
        return kniBridge729(socket?.getPointer(memScope).rawValue)
    }
}

fun sfTcpSocket_getRemoteAddress(socket: CValuesRef<sfTcpSocket>?): CValue<sfIpAddress> {
    memScoped {
        val kniRetVal = nativeHeap.alloc<sfIpAddress>()
        try {
            kniBridge730(socket?.getPointer(memScope).rawValue, kniRetVal.rawPtr)
            return kniRetVal.readValue()
        } finally { nativeHeap.free(kniRetVal) }
    }
}

fun sfTcpSocket_getRemotePort(socket: CValuesRef<sfTcpSocket>?): UShort {
    memScoped {
        return kniBridge731(socket?.getPointer(memScope).rawValue)
    }
}

fun sfTcpSocket_connect(socket: CValuesRef<sfTcpSocket>?, remoteAddress: CValue<sfIpAddress>, remotePort: UShort, timeout: CValue<sfTime>): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge732(socket?.getPointer(memScope).rawValue, remoteAddress.getPointer(memScope).rawValue, remotePort, timeout.getPointer(memScope).rawValue))
    }
}

fun sfTcpSocket_disconnect(socket: CValuesRef<sfTcpSocket>?): Unit {
    memScoped {
        return kniBridge733(socket?.getPointer(memScope).rawValue)
    }
}

fun sfTcpSocket_send(socket: CValuesRef<sfTcpSocket>?, data: CValuesRef<*>?, size: size_t): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge734(socket?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, size))
    }
}

fun sfTcpSocket_sendPartial(socket: CValuesRef<sfTcpSocket>?, data: CValuesRef<*>?, size: size_t, sent: CValuesRef<size_tVar>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge735(socket?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, size, sent?.getPointer(memScope).rawValue))
    }
}

fun sfTcpSocket_receive(socket: CValuesRef<sfTcpSocket>?, data: CValuesRef<*>?, size: size_t, received: CValuesRef<size_tVar>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge736(socket?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, size, received?.getPointer(memScope).rawValue))
    }
}

fun sfTcpSocket_sendPacket(socket: CValuesRef<sfTcpSocket>?, packet: CValuesRef<sfPacket>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge737(socket?.getPointer(memScope).rawValue, packet?.getPointer(memScope).rawValue))
    }
}

fun sfTcpSocket_receivePacket(socket: CValuesRef<sfTcpSocket>?, packet: CValuesRef<sfPacket>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge738(socket?.getPointer(memScope).rawValue, packet?.getPointer(memScope).rawValue))
    }
}

fun sfUdpSocket_create(): CPointer<sfUdpSocket>? {
    return interpretCPointer<sfUdpSocket>(kniBridge739())
}

fun sfUdpSocket_destroy(socket: CValuesRef<sfUdpSocket>?): Unit {
    memScoped {
        return kniBridge740(socket?.getPointer(memScope).rawValue)
    }
}

fun sfUdpSocket_setBlocking(socket: CValuesRef<sfUdpSocket>?, blocking: sfBool): Unit {
    memScoped {
        return kniBridge741(socket?.getPointer(memScope).rawValue, blocking)
    }
}

fun sfUdpSocket_isBlocking(socket: CValuesRef<sfUdpSocket>?): sfBool {
    memScoped {
        return kniBridge742(socket?.getPointer(memScope).rawValue)
    }
}

fun sfUdpSocket_getLocalPort(socket: CValuesRef<sfUdpSocket>?): UShort {
    memScoped {
        return kniBridge743(socket?.getPointer(memScope).rawValue)
    }
}

fun sfUdpSocket_bind(socket: CValuesRef<sfUdpSocket>?, port: UShort, address: CValue<sfIpAddress>): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge744(socket?.getPointer(memScope).rawValue, port, address.getPointer(memScope).rawValue))
    }
}

fun sfUdpSocket_unbind(socket: CValuesRef<sfUdpSocket>?): Unit {
    memScoped {
        return kniBridge745(socket?.getPointer(memScope).rawValue)
    }
}

fun sfUdpSocket_send(socket: CValuesRef<sfUdpSocket>?, data: CValuesRef<*>?, size: size_t, remoteAddress: CValue<sfIpAddress>, remotePort: UShort): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge746(socket?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, size, remoteAddress.getPointer(memScope).rawValue, remotePort))
    }
}

fun sfUdpSocket_receive(socket: CValuesRef<sfUdpSocket>?, data: CValuesRef<*>?, size: size_t, received: CValuesRef<size_tVar>?, remoteAddress: CValuesRef<sfIpAddress>?, remotePort: CValuesRef<UShortVar>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge747(socket?.getPointer(memScope).rawValue, data?.getPointer(memScope).rawValue, size, received?.getPointer(memScope).rawValue, remoteAddress?.getPointer(memScope).rawValue, remotePort?.getPointer(memScope).rawValue))
    }
}

fun sfUdpSocket_sendPacket(socket: CValuesRef<sfUdpSocket>?, packet: CValuesRef<sfPacket>?, remoteAddress: CValue<sfIpAddress>, remotePort: UShort): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge748(socket?.getPointer(memScope).rawValue, packet?.getPointer(memScope).rawValue, remoteAddress.getPointer(memScope).rawValue, remotePort))
    }
}

fun sfUdpSocket_receivePacket(socket: CValuesRef<sfUdpSocket>?, packet: CValuesRef<sfPacket>?, remoteAddress: CValuesRef<sfIpAddress>?, remotePort: CValuesRef<UShortVar>?): sfSocketStatus {
    memScoped {
        return sfSocketStatus.byValue(kniBridge749(socket?.getPointer(memScope).rawValue, packet?.getPointer(memScope).rawValue, remoteAddress?.getPointer(memScope).rawValue, remotePort?.getPointer(memScope).rawValue))
    }
}

fun sfUdpSocket_maxDatagramSize(): UInt {
    return kniBridge750()
}

const val CSFML_VERSION_MAJOR: Int = 2

const val CSFML_VERSION_MINOR: Int = 4

const val CSFML_VERSION_PATCH: Int = 0

const val sfFalse: Int = 0

const val sfTrue: Int = 1

val sfTime_Zero: sfTime
    get() = interpretPointed<sfTime>(kniBridge751())

val sfBlendAlpha: sfBlendMode
    get() = interpretPointed<sfBlendMode>(kniBridge752())

val sfBlendAdd: sfBlendMode
    get() = interpretPointed<sfBlendMode>(kniBridge753())

val sfBlendMultiply: sfBlendMode
    get() = interpretPointed<sfBlendMode>(kniBridge754())

val sfBlendNone: sfBlendMode
    get() = interpretPointed<sfBlendMode>(kniBridge755())

val sfBlack: sfColor
    get() = interpretPointed<sfColor>(kniBridge756())

val sfWhite: sfColor
    get() = interpretPointed<sfColor>(kniBridge757())

val sfRed: sfColor
    get() = interpretPointed<sfColor>(kniBridge758())

val sfGreen: sfColor
    get() = interpretPointed<sfColor>(kniBridge759())

val sfBlue: sfColor
    get() = interpretPointed<sfColor>(kniBridge760())

val sfYellow: sfColor
    get() = interpretPointed<sfColor>(kniBridge761())

val sfMagenta: sfColor
    get() = interpretPointed<sfColor>(kniBridge762())

val sfCyan: sfColor
    get() = interpretPointed<sfColor>(kniBridge763())

val sfTransparent: sfColor
    get() = interpretPointed<sfColor>(kniBridge764())

val sfTransform_Identity: sfTransform
    get() = interpretPointed<sfTransform>(kniBridge765())

val sfIpAddress_None: sfIpAddress
    get() = interpretPointed<sfIpAddress>(kniBridge766())

val sfIpAddress_Any: sfIpAddress
    get() = interpretPointed<sfIpAddress>(kniBridge767())

val sfIpAddress_LocalHost: sfIpAddress
    get() = interpretPointed<sfIpAddress>(kniBridge768())

val sfIpAddress_Broadcast: sfIpAddress
    get() = interpretPointed<sfIpAddress>(kniBridge769())

class sfTime(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var microseconds: sfInt64
        get() = memberAt<sfInt64Var>(0).value
        set(value) { memberAt<sfInt64Var>(0).value = value }
    
}




class sfInputStream(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var read: sfInputStreamReadFunc?
        get() = memberAt<sfInputStreamReadFuncVar>(0).value
        set(value) { memberAt<sfInputStreamReadFuncVar>(0).value = value }
    
    var seek: sfInputStreamSeekFunc?
        get() = memberAt<sfInputStreamSeekFuncVar>(8).value
        set(value) { memberAt<sfInputStreamSeekFuncVar>(8).value = value }
    
    var tell: sfInputStreamTellFunc?
        get() = memberAt<sfInputStreamTellFuncVar>(16).value
        set(value) { memberAt<sfInputStreamTellFuncVar>(16).value = value }
    
    var getSize: sfInputStreamGetSizeFunc?
        get() = memberAt<sfInputStreamGetSizeFuncVar>(24).value
        set(value) { memberAt<sfInputStreamGetSizeFuncVar>(24).value = value }
    
    var userData: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(32).value
        set(value) { memberAt<COpaquePointerVar>(32).value = value }
    
}

class sfVector2i(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
}

class sfVector2u(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var x: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var y: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
}

class sfVector2f(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
}

class sfVector3f(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
}







class sfSoundStreamChunk(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var samples: CPointer<sfInt16Var>?
        get() = memberAt<CPointerVar<sfInt16Var>>(0).value
        set(value) { memberAt<CPointerVar<sfInt16Var>>(0).value = value }
    
    var sampleCount: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
}



class sfJoystickIdentification(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var vendorId: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var productId: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
}

class sfKeyEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var code: sfKeyCode
        get() = memberAt<sfKeyCodeVar>(4).value
        set(value) { memberAt<sfKeyCodeVar>(4).value = value }
    
    var alt: sfBool
        get() = memberAt<sfBoolVar>(8).value
        set(value) { memberAt<sfBoolVar>(8).value = value }
    
    var control: sfBool
        get() = memberAt<sfBoolVar>(12).value
        set(value) { memberAt<sfBoolVar>(12).value = value }
    
    var shift: sfBool
        get() = memberAt<sfBoolVar>(16).value
        set(value) { memberAt<sfBoolVar>(16).value = value }
    
    var system: sfBool
        get() = memberAt<sfBoolVar>(20).value
        set(value) { memberAt<sfBoolVar>(20).value = value }
    
}

class sfTextEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var unicode: sfUint32
        get() = memberAt<sfUint32Var>(4).value
        set(value) { memberAt<sfUint32Var>(4).value = value }
    
}

class sfMouseMoveEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfMouseButtonEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var button: sfMouseButton
        get() = memberAt<sfMouseButton.Var>(4).value
        set(value) { memberAt<sfMouseButton.Var>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfMouseWheelEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var delta: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfMouseWheelScrollEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var wheel: sfMouseWheel
        get() = memberAt<sfMouseWheel.Var>(4).value
        set(value) { memberAt<sfMouseWheel.Var>(4).value = value }
    
    var delta: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
}

class sfJoystickMoveEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var axis: sfJoystickAxis
        get() = memberAt<sfJoystickAxis.Var>(8).value
        set(value) { memberAt<sfJoystickAxis.Var>(8).value = value }
    
    var position: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfJoystickButtonEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var button: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
}

class sfJoystickConnectEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var joystickId: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
}

class sfSizeEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var width: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var height: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
}

class sfTouchEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var finger: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var x: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfSensorEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    var sensorType: sfSensorType
        get() = memberAt<sfSensorType.Var>(4).value
        set(value) { memberAt<sfSensorType.Var>(4).value = value }
    
    var x: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(16).value
        set(value) { memberAt<FloatVar>(16).value = value }
    
}

class sfEvent(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var type: sfEventType
        get() = memberAt<sfEventType.Var>(0).value
        set(value) { memberAt<sfEventType.Var>(0).value = value }
    
    val size: sfSizeEvent
        get() = memberAt(0)
    
    val key: sfKeyEvent
        get() = memberAt(0)
    
    val text: sfTextEvent
        get() = memberAt(0)
    
    val mouseMove: sfMouseMoveEvent
        get() = memberAt(0)
    
    val mouseButton: sfMouseButtonEvent
        get() = memberAt(0)
    
    val mouseWheel: sfMouseWheelEvent
        get() = memberAt(0)
    
    val mouseWheelScroll: sfMouseWheelScrollEvent
        get() = memberAt(0)
    
    val joystickMove: sfJoystickMoveEvent
        get() = memberAt(0)
    
    val joystickButton: sfJoystickButtonEvent
        get() = memberAt(0)
    
    val joystickConnect: sfJoystickConnectEvent
        get() = memberAt(0)
    
    val touch: sfTouchEvent
        get() = memberAt(0)
    
    val sensor: sfSensorEvent
        get() = memberAt(0)
    
}

class sfVideoMode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var width: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var height: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var bitsPerPixel: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
}

class sfContextSettings(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(28, 4)
    
    var depthBits: UInt
        get() = memberAt<UIntVar>(0).value
        set(value) { memberAt<UIntVar>(0).value = value }
    
    var stencilBits: UInt
        get() = memberAt<UIntVar>(4).value
        set(value) { memberAt<UIntVar>(4).value = value }
    
    var antialiasingLevel: UInt
        get() = memberAt<UIntVar>(8).value
        set(value) { memberAt<UIntVar>(8).value = value }
    
    var majorVersion: UInt
        get() = memberAt<UIntVar>(12).value
        set(value) { memberAt<UIntVar>(12).value = value }
    
    var minorVersion: UInt
        get() = memberAt<UIntVar>(16).value
        set(value) { memberAt<UIntVar>(16).value = value }
    
    var attributeFlags: sfUint32
        get() = memberAt<sfUint32Var>(20).value
        set(value) { memberAt<sfUint32Var>(20).value = value }
    
    var sRgbCapable: sfBool
        get() = memberAt<sfBoolVar>(24).value
        set(value) { memberAt<sfBoolVar>(24).value = value }
    
}

class sfBlendMode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var colorSrcFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(0).value
        set(value) { memberAt<sfBlendFactor.Var>(0).value = value }
    
    var colorDstFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(4).value
        set(value) { memberAt<sfBlendFactor.Var>(4).value = value }
    
    var colorEquation: sfBlendEquation
        get() = memberAt<sfBlendEquation.Var>(8).value
        set(value) { memberAt<sfBlendEquation.Var>(8).value = value }
    
    var alphaSrcFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(12).value
        set(value) { memberAt<sfBlendFactor.Var>(12).value = value }
    
    var alphaDstFactor: sfBlendFactor
        get() = memberAt<sfBlendFactor.Var>(16).value
        set(value) { memberAt<sfBlendFactor.Var>(16).value = value }
    
    var alphaEquation: sfBlendEquation
        get() = memberAt<sfBlendEquation.Var>(20).value
        set(value) { memberAt<sfBlendEquation.Var>(20).value = value }
    
}

class sfColor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 1)
    
    var r: sfUint8
        get() = memberAt<sfUint8Var>(0).value
        set(value) { memberAt<sfUint8Var>(0).value = value }
    
    var g: sfUint8
        get() = memberAt<sfUint8Var>(1).value
        set(value) { memberAt<sfUint8Var>(1).value = value }
    
    var b: sfUint8
        get() = memberAt<sfUint8Var>(2).value
        set(value) { memberAt<sfUint8Var>(2).value = value }
    
    var a: sfUint8
        get() = memberAt<sfUint8Var>(3).value
        set(value) { memberAt<sfUint8Var>(3).value = value }
    
}

class sfFloatRect(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var left: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var top: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var width: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var height: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfIntRect(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var left: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var top: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var width: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}
















class sfTransform(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    val matrix: CArrayPointer<FloatVar>
        get() = arrayMemberAt(0)
    
}

class sfFontInfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var family: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
}

class sfGlyph(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    var advance: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    val bounds: sfFloatRect
        get() = memberAt(4)
    
    val textureRect: sfIntRect
        get() = memberAt(20)
    
}

class sfRenderStates(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(80, 8)
    
    val blendMode: sfBlendMode
        get() = memberAt(0)
    
    val transform: sfTransform
        get() = memberAt(24)
    
    var texture: CPointer<sfTexture>?
        get() = memberAt<CPointerVar<sfTexture>>(64).value
        set(value) { memberAt<CPointerVar<sfTexture>>(64).value = value }
    
    var shader: CPointer<sfShader>?
        get() = memberAt<CPointerVar<sfShader>>(72).value
        set(value) { memberAt<CPointerVar<sfShader>>(72).value = value }
    
}

class sfVertex(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    val position: sfVector2f
        get() = memberAt(0)
    
    val color: sfColor
        get() = memberAt(8)
    
    val texCoords: sfVector2f
        get() = memberAt(12)
    
}

class sfGlslBvec2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var x: sfBool
        get() = memberAt<sfBoolVar>(0).value
        set(value) { memberAt<sfBoolVar>(0).value = value }
    
    var y: sfBool
        get() = memberAt<sfBoolVar>(4).value
        set(value) { memberAt<sfBoolVar>(4).value = value }
    
}

class sfGlslIvec3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var z: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
}

class sfGlslBvec3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var x: sfBool
        get() = memberAt<sfBoolVar>(0).value
        set(value) { memberAt<sfBoolVar>(0).value = value }
    
    var y: sfBool
        get() = memberAt<sfBoolVar>(4).value
        set(value) { memberAt<sfBoolVar>(4).value = value }
    
    var z: sfBool
        get() = memberAt<sfBoolVar>(8).value
        set(value) { memberAt<sfBoolVar>(8).value = value }
    
}

class sfGlslVec4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var x: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var y: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var z: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var w: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
    
}

class sfGlslIvec4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var x: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var y: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var z: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var w: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
}

class sfGlslBvec4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var x: sfBool
        get() = memberAt<sfBoolVar>(0).value
        set(value) { memberAt<sfBoolVar>(0).value = value }
    
    var y: sfBool
        get() = memberAt<sfBoolVar>(4).value
        set(value) { memberAt<sfBoolVar>(4).value = value }
    
    var z: sfBool
        get() = memberAt<sfBoolVar>(8).value
        set(value) { memberAt<sfBoolVar>(8).value = value }
    
    var w: sfBool
        get() = memberAt<sfBoolVar>(12).value
        set(value) { memberAt<sfBoolVar>(12).value = value }
    
}

class sfGlslMat3(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    val array: CArrayPointer<FloatVar>
        get() = arrayMemberAt(0)
    
}

class sfGlslMat4(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 4)
    
    val array: CArrayPointer<FloatVar>
        get() = arrayMemberAt(0)
    
}

class sfIpAddress(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    val address: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
}













enum class sfSoundStatus(override val value: UInt) : CEnum {
    sfStopped(0u),
    sfPaused(1u),
    sfPlaying(2u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfSoundStatus.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfSoundStatus
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

// enum (anonymous at /usr/include/SFML/Window/Joystick.h:39:1):
val sfJoystickCount: UInt get() = 8u
val sfJoystickButtonCount: UInt get() = 32u
val sfJoystickAxisCount: UInt get() = 8u

enum class sfJoystickAxis(override val value: UInt) : CEnum {
    sfJoystickX(0u),
    sfJoystickY(1u),
    sfJoystickZ(2u),
    sfJoystickR(3u),
    sfJoystickU(4u),
    sfJoystickV(5u),
    sfJoystickPovX(6u),
    sfJoystickPovY(7u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfJoystickAxis.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfJoystickAxis
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias sfKeyCodeVar = IntVarOf<sfKeyCode>
typealias sfKeyCode = Int

val sfKeyUnknown: sfKeyCode get() = -1
val sfKeyA: sfKeyCode get() = 0
val sfKeyB: sfKeyCode get() = 1
val sfKeyC: sfKeyCode get() = 2
val sfKeyD: sfKeyCode get() = 3
val sfKeyE: sfKeyCode get() = 4
val sfKeyF: sfKeyCode get() = 5
val sfKeyG: sfKeyCode get() = 6
val sfKeyH: sfKeyCode get() = 7
val sfKeyI: sfKeyCode get() = 8
val sfKeyJ: sfKeyCode get() = 9
val sfKeyK: sfKeyCode get() = 10
val sfKeyL: sfKeyCode get() = 11
val sfKeyM: sfKeyCode get() = 12
val sfKeyN: sfKeyCode get() = 13
val sfKeyO: sfKeyCode get() = 14
val sfKeyP: sfKeyCode get() = 15
val sfKeyQ: sfKeyCode get() = 16
val sfKeyR: sfKeyCode get() = 17
val sfKeyS: sfKeyCode get() = 18
val sfKeyT: sfKeyCode get() = 19
val sfKeyU: sfKeyCode get() = 20
val sfKeyV: sfKeyCode get() = 21
val sfKeyW: sfKeyCode get() = 22
val sfKeyX: sfKeyCode get() = 23
val sfKeyY: sfKeyCode get() = 24
val sfKeyZ: sfKeyCode get() = 25
val sfKeyNum0: sfKeyCode get() = 26
val sfKeyNum1: sfKeyCode get() = 27
val sfKeyNum2: sfKeyCode get() = 28
val sfKeyNum3: sfKeyCode get() = 29
val sfKeyNum4: sfKeyCode get() = 30
val sfKeyNum5: sfKeyCode get() = 31
val sfKeyNum6: sfKeyCode get() = 32
val sfKeyNum7: sfKeyCode get() = 33
val sfKeyNum8: sfKeyCode get() = 34
val sfKeyNum9: sfKeyCode get() = 35
val sfKeyEscape: sfKeyCode get() = 36
val sfKeyLControl: sfKeyCode get() = 37
val sfKeyLShift: sfKeyCode get() = 38
val sfKeyLAlt: sfKeyCode get() = 39
val sfKeyLSystem: sfKeyCode get() = 40
val sfKeyRControl: sfKeyCode get() = 41
val sfKeyRShift: sfKeyCode get() = 42
val sfKeyRAlt: sfKeyCode get() = 43
val sfKeyRSystem: sfKeyCode get() = 44
val sfKeyMenu: sfKeyCode get() = 45
val sfKeyLBracket: sfKeyCode get() = 46
val sfKeyRBracket: sfKeyCode get() = 47
val sfKeySemiColon: sfKeyCode get() = 48
val sfKeyComma: sfKeyCode get() = 49
val sfKeyPeriod: sfKeyCode get() = 50
val sfKeyQuote: sfKeyCode get() = 51
val sfKeySlash: sfKeyCode get() = 52
val sfKeyBackSlash: sfKeyCode get() = 53
val sfKeyTilde: sfKeyCode get() = 54
val sfKeyEqual: sfKeyCode get() = 55
val sfKeyDash: sfKeyCode get() = 56
val sfKeySpace: sfKeyCode get() = 57
val sfKeyReturn: sfKeyCode get() = 58
val sfKeyBack: sfKeyCode get() = 59
val sfKeyTab: sfKeyCode get() = 60
val sfKeyPageUp: sfKeyCode get() = 61
val sfKeyPageDown: sfKeyCode get() = 62
val sfKeyEnd: sfKeyCode get() = 63
val sfKeyHome: sfKeyCode get() = 64
val sfKeyInsert: sfKeyCode get() = 65
val sfKeyDelete: sfKeyCode get() = 66
val sfKeyAdd: sfKeyCode get() = 67
val sfKeySubtract: sfKeyCode get() = 68
val sfKeyMultiply: sfKeyCode get() = 69
val sfKeyDivide: sfKeyCode get() = 70
val sfKeyLeft: sfKeyCode get() = 71
val sfKeyRight: sfKeyCode get() = 72
val sfKeyUp: sfKeyCode get() = 73
val sfKeyDown: sfKeyCode get() = 74
val sfKeyNumpad0: sfKeyCode get() = 75
val sfKeyNumpad1: sfKeyCode get() = 76
val sfKeyNumpad2: sfKeyCode get() = 77
val sfKeyNumpad3: sfKeyCode get() = 78
val sfKeyNumpad4: sfKeyCode get() = 79
val sfKeyNumpad5: sfKeyCode get() = 80
val sfKeyNumpad6: sfKeyCode get() = 81
val sfKeyNumpad7: sfKeyCode get() = 82
val sfKeyNumpad8: sfKeyCode get() = 83
val sfKeyNumpad9: sfKeyCode get() = 84
val sfKeyF1: sfKeyCode get() = 85
val sfKeyF2: sfKeyCode get() = 86
val sfKeyF3: sfKeyCode get() = 87
val sfKeyF4: sfKeyCode get() = 88
val sfKeyF5: sfKeyCode get() = 89
val sfKeyF6: sfKeyCode get() = 90
val sfKeyF7: sfKeyCode get() = 91
val sfKeyF8: sfKeyCode get() = 92
val sfKeyF9: sfKeyCode get() = 93
val sfKeyF10: sfKeyCode get() = 94
val sfKeyF11: sfKeyCode get() = 95
val sfKeyF12: sfKeyCode get() = 96
val sfKeyF13: sfKeyCode get() = 97
val sfKeyF14: sfKeyCode get() = 98
val sfKeyF15: sfKeyCode get() = 99
val sfKeyPause: sfKeyCode get() = 100
val sfKeyCount: sfKeyCode get() = 101

enum class sfMouseButton(override val value: UInt) : CEnum {
    sfMouseLeft(0u),
    sfMouseRight(1u),
    sfMouseMiddle(2u),
    sfMouseXButton1(3u),
    sfMouseXButton2(4u),
    sfMouseButtonCount(5u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfMouseButton.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfMouseButton
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class sfMouseWheel(override val value: UInt) : CEnum {
    sfMouseVerticalWheel(0u),
    sfMouseHorizontalWheel(1u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfMouseWheel.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfMouseWheel
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class sfSensorType(override val value: UInt) : CEnum {
    sfSensorAccelerometer(0u),
    sfSensorGyroscope(1u),
    sfSensorMagnetometer(2u),
    sfSensorGravity(3u),
    sfSensorUserAcceleration(4u),
    sfSensorOrientation(5u),
    sfSensorCount(6u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfSensorType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfSensorType
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class sfEventType(override val value: UInt) : CEnum {
    sfEvtClosed(0u),
    sfEvtResized(1u),
    sfEvtLostFocus(2u),
    sfEvtGainedFocus(3u),
    sfEvtTextEntered(4u),
    sfEvtKeyPressed(5u),
    sfEvtKeyReleased(6u),
    sfEvtMouseWheelMoved(7u),
    sfEvtMouseWheelScrolled(8u),
    sfEvtMouseButtonPressed(9u),
    sfEvtMouseButtonReleased(10u),
    sfEvtMouseMoved(11u),
    sfEvtMouseEntered(12u),
    sfEvtMouseLeft(13u),
    sfEvtJoystickButtonPressed(14u),
    sfEvtJoystickButtonReleased(15u),
    sfEvtJoystickMoved(16u),
    sfEvtJoystickConnected(17u),
    sfEvtJoystickDisconnected(18u),
    sfEvtTouchBegan(19u),
    sfEvtTouchMoved(20u),
    sfEvtTouchEnded(21u),
    sfEvtSensorChanged(22u),
    sfEvtCount(23u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfEventType.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfEventType
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias sfWindowStyleVar = UIntVarOf<sfWindowStyle>
typealias sfWindowStyle = UInt

val sfNone: sfWindowStyle get() = 0u
val sfTitlebar: sfWindowStyle get() = 1u
val sfResize: sfWindowStyle get() = 2u
val sfClose: sfWindowStyle get() = 4u
val sfFullscreen: sfWindowStyle get() = 8u
val sfDefaultStyle: sfWindowStyle get() = 7u

typealias sfContextAttributeVar = UIntVarOf<sfContextAttribute>
typealias sfContextAttribute = UInt

val sfContextDefault: sfContextAttribute get() = 0u
val sfContextCore: sfContextAttribute get() = 1u
val sfContextDebug: sfContextAttribute get() = 4u

enum class sfBlendFactor(override val value: UInt) : CEnum {
    sfBlendFactorZero(0u),
    sfBlendFactorOne(1u),
    sfBlendFactorSrcColor(2u),
    sfBlendFactorOneMinusSrcColor(3u),
    sfBlendFactorDstColor(4u),
    sfBlendFactorOneMinusDstColor(5u),
    sfBlendFactorSrcAlpha(6u),
    sfBlendFactorOneMinusSrcAlpha(7u),
    sfBlendFactorDstAlpha(8u),
    sfBlendFactorOneMinusDstAlpha(9u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfBlendFactor.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfBlendFactor
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

enum class sfBlendEquation(override val value: UInt) : CEnum {
    sfBlendEquationAdd(0u),
    sfBlendEquationSubtract(1u),
    sfBlendEquationReverseSubtract(2u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfBlendEquation.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfBlendEquation
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias sfPrimitiveTypeVar = UIntVarOf<sfPrimitiveType>
typealias sfPrimitiveType = UInt

val sfPoints: sfPrimitiveType get() = 0u
val sfLines: sfPrimitiveType get() = 1u
val sfLineStrip: sfPrimitiveType get() = 2u
val sfTriangles: sfPrimitiveType get() = 3u
val sfTriangleStrip: sfPrimitiveType get() = 4u
val sfTriangleFan: sfPrimitiveType get() = 5u
val sfQuads: sfPrimitiveType get() = 6u
val sfLinesStrip: sfPrimitiveType get() = 2u
val sfTrianglesStrip: sfPrimitiveType get() = 4u
val sfTrianglesFan: sfPrimitiveType get() = 5u

typealias sfTextStyleVar = UIntVarOf<sfTextStyle>
typealias sfTextStyle = UInt

val sfTextRegular: sfTextStyle get() = 0u
val sfTextBold: sfTextStyle get() = 1u
val sfTextItalic: sfTextStyle get() = 2u
val sfTextUnderlined: sfTextStyle get() = 4u
val sfTextStrikeThrough: sfTextStyle get() = 8u

enum class sfFtpTransferMode(override val value: UInt) : CEnum {
    sfFtpBinary(0u),
    sfFtpAscii(1u),
    sfFtpEbcdic(2u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfFtpTransferMode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfFtpTransferMode
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias sfFtpStatusVar = UIntVarOf<sfFtpStatus>
typealias sfFtpStatus = UInt

val sfFtpRestartMarkerReply: sfFtpStatus get() = 110u
val sfFtpServiceReadySoon: sfFtpStatus get() = 120u
val sfFtpDataConnectionAlreadyOpened: sfFtpStatus get() = 125u
val sfFtpOpeningDataConnection: sfFtpStatus get() = 150u
val sfFtpOk: sfFtpStatus get() = 200u
val sfFtpPointlessCommand: sfFtpStatus get() = 202u
val sfFtpSystemStatus: sfFtpStatus get() = 211u
val sfFtpDirectoryStatus: sfFtpStatus get() = 212u
val sfFtpFileStatus: sfFtpStatus get() = 213u
val sfFtpHelpMessage: sfFtpStatus get() = 214u
val sfFtpSystemType: sfFtpStatus get() = 215u
val sfFtpServiceReady: sfFtpStatus get() = 220u
val sfFtpClosingConnection: sfFtpStatus get() = 221u
val sfFtpDataConnectionOpened: sfFtpStatus get() = 225u
val sfFtpClosingDataConnection: sfFtpStatus get() = 226u
val sfFtpEnteringPassiveMode: sfFtpStatus get() = 227u
val sfFtpLoggedIn: sfFtpStatus get() = 230u
val sfFtpFileActionOk: sfFtpStatus get() = 250u
val sfFtpDirectoryOk: sfFtpStatus get() = 257u
val sfFtpNeedPassword: sfFtpStatus get() = 331u
val sfFtpNeedAccountToLogIn: sfFtpStatus get() = 332u
val sfFtpNeedInformation: sfFtpStatus get() = 350u
val sfFtpServiceUnavailable: sfFtpStatus get() = 421u
val sfFtpDataConnectionUnavailable: sfFtpStatus get() = 425u
val sfFtpTransferAborted: sfFtpStatus get() = 426u
val sfFtpFileActionAborted: sfFtpStatus get() = 450u
val sfFtpLocalError: sfFtpStatus get() = 451u
val sfFtpInsufficientStorageSpace: sfFtpStatus get() = 452u
val sfFtpCommandUnknown: sfFtpStatus get() = 500u
val sfFtpParametersUnknown: sfFtpStatus get() = 501u
val sfFtpCommandNotImplemented: sfFtpStatus get() = 502u
val sfFtpBadCommandSequence: sfFtpStatus get() = 503u
val sfFtpParameterNotImplemented: sfFtpStatus get() = 504u
val sfFtpNotLoggedIn: sfFtpStatus get() = 530u
val sfFtpNeedAccountToStore: sfFtpStatus get() = 532u
val sfFtpFileUnavailable: sfFtpStatus get() = 550u
val sfFtpPageTypeUnknown: sfFtpStatus get() = 551u
val sfFtpNotEnoughMemory: sfFtpStatus get() = 552u
val sfFtpFilenameNotAllowed: sfFtpStatus get() = 553u
val sfFtpInvalidResponse: sfFtpStatus get() = 1000u
val sfFtpConnectionFailed: sfFtpStatus get() = 1001u
val sfFtpConnectionClosed: sfFtpStatus get() = 1002u
val sfFtpInvalidFile: sfFtpStatus get() = 1003u

enum class sfHttpMethod(override val value: UInt) : CEnum {
    sfHttpGet(0u),
    sfHttpPost(1u),
    sfHttpHead(2u),
    sfHttpPut(3u),
    sfHttpDelete(4u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfHttpMethod.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfHttpMethod
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias sfHttpStatusVar = UIntVarOf<sfHttpStatus>
typealias sfHttpStatus = UInt

val sfHttpOk: sfHttpStatus get() = 200u
val sfHttpCreated: sfHttpStatus get() = 201u
val sfHttpAccepted: sfHttpStatus get() = 202u
val sfHttpNoContent: sfHttpStatus get() = 204u
val sfHttpResetContent: sfHttpStatus get() = 205u
val sfHttpPartialContent: sfHttpStatus get() = 206u
val sfHttpMultipleChoices: sfHttpStatus get() = 300u
val sfHttpMovedPermanently: sfHttpStatus get() = 301u
val sfHttpMovedTemporarily: sfHttpStatus get() = 302u
val sfHttpNotModified: sfHttpStatus get() = 304u
val sfHttpBadRequest: sfHttpStatus get() = 400u
val sfHttpUnauthorized: sfHttpStatus get() = 401u
val sfHttpForbidden: sfHttpStatus get() = 403u
val sfHttpNotFound: sfHttpStatus get() = 404u
val sfHttpRangeNotSatisfiable: sfHttpStatus get() = 407u
val sfHttpInternalServerError: sfHttpStatus get() = 500u
val sfHttpNotImplemented: sfHttpStatus get() = 501u
val sfHttpBadGateway: sfHttpStatus get() = 502u
val sfHttpServiceNotAvailable: sfHttpStatus get() = 503u
val sfHttpGatewayTimeout: sfHttpStatus get() = 504u
val sfHttpVersionNotSupported: sfHttpStatus get() = 505u
val sfHttpInvalidResponse: sfHttpStatus get() = 1000u
val sfHttpConnectionFailed: sfHttpStatus get() = 1001u

enum class sfSocketStatus(override val value: UInt) : CEnum {
    sfSocketDone(0u),
    sfSocketNotReady(1u),
    sfSocketPartial(2u),
    sfSocketDisconnected(3u),
    sfSocketError(4u),
    ;
    
    companion object {
        fun byValue(value: UInt) = sfSocketStatus.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(UIntVar.size.toInt())
        var value: sfSocketStatus
            get() = byValue(this.reinterpret<UIntVar>().value)
            set(value) { this.reinterpret<UIntVar>().value = value.value }
    }
}

typealias sfBoolVar = IntVarOf<sfBool>
typealias sfBool = Int

typealias sfInt8Var = ByteVarOf<sfInt8>
typealias sfInt8 = Byte

typealias sfUint8Var = UByteVarOf<sfUint8>
typealias sfUint8 = UByte

typealias sfInt16Var = ShortVarOf<sfInt16>
typealias sfInt16 = Short

typealias sfUint16Var = UShortVarOf<sfUint16>
typealias sfUint16 = UShort

typealias sfInt32Var = IntVarOf<sfInt32>
typealias sfInt32 = Int

typealias sfUint32Var = UIntVarOf<sfUint32>
typealias sfUint32 = UInt

typealias sfInt64Var = LongVarOf<sfInt64>
typealias sfInt64 = Long

typealias sfUint64Var = ULongVarOf<sfUint64>
typealias sfUint64 = ULong

typealias sfInputStreamReadFuncVar = CPointerVarOf<sfInputStreamReadFunc>
typealias sfInputStreamReadFunc = CPointer<CFunction<(COpaquePointer?, sfInt64, COpaquePointer?) -> sfInt64>>

typealias sfInputStreamSeekFuncVar = CPointerVarOf<sfInputStreamSeekFunc>
typealias sfInputStreamSeekFunc = CPointer<CFunction<(sfInt64, COpaquePointer?) -> sfInt64>>

typealias sfInputStreamTellFuncVar = CPointerVarOf<sfInputStreamTellFunc>
typealias sfInputStreamTellFunc = CPointer<CFunction<(COpaquePointer?) -> sfInt64>>

typealias sfInputStreamGetSizeFuncVar = CPointerVarOf<sfInputStreamGetSizeFunc>
typealias sfInputStreamGetSizeFunc = CPointer<CFunction<(COpaquePointer?) -> sfInt64>>

typealias sfSoundRecorderStartCallbackVar = CPointerVarOf<sfSoundRecorderStartCallback>
typealias sfSoundRecorderStartCallback = CPointer<CFunction<(COpaquePointer?) -> sfBool>>

typealias sfSoundRecorderProcessCallbackVar = CPointerVarOf<sfSoundRecorderProcessCallback>
typealias sfSoundRecorderProcessCallback = CPointer<CFunction<(CPointer<sfInt16Var>?, size_t, COpaquePointer?) -> sfBool>>

typealias sfSoundRecorderStopCallbackVar = CPointerVarOf<sfSoundRecorderStopCallback>
typealias sfSoundRecorderStopCallback = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias sfSoundStreamGetDataCallbackVar = CPointerVarOf<sfSoundStreamGetDataCallback>
typealias sfSoundStreamGetDataCallback = CPointer<CFunction<(CPointer<sfSoundStreamChunk>?, COpaquePointer?) -> sfBool>>

typealias sfSoundStreamSeekCallbackVar = CPointerVarOf<sfSoundStreamSeekCallback>
typealias sfSoundStreamSeekCallback = CPointer<CFunction<(CValue<sfTime>, COpaquePointer?) -> Unit>>

typealias sfWindowHandleVar = ULongVarOf<sfWindowHandle>
typealias sfWindowHandle = ULong

typealias sfGlslVec2 = sfVector2f

typealias sfGlslIvec2 = sfVector2i

typealias sfGlslVec3 = sfVector3f

typealias sfShapeGetPointCountCallbackVar = CPointerVarOf<sfShapeGetPointCountCallback>
typealias sfShapeGetPointCountCallback = CPointer<CFunction<(COpaquePointer?) -> size_t>>

typealias sfShapeGetPointCallbackVar = CPointerVarOf<sfShapeGetPointCallback>
typealias sfShapeGetPointCallback = CPointer<CFunction<(size_t, COpaquePointer?) -> CValue<sfVector2f>>>

@SymbolName("sfml_kniBridge0")
private external fun kniBridge0(p0: NativePtr): Float
@SymbolName("sfml_kniBridge1")
private external fun kniBridge1(p0: NativePtr): Int
@SymbolName("sfml_kniBridge2")
private external fun kniBridge2(p0: NativePtr): Long
@SymbolName("sfml_kniBridge3")
private external fun kniBridge3(p0: Float, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge4")
private external fun kniBridge4(p0: Int, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge5")
private external fun kniBridge5(p0: Long, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge6")
private external fun kniBridge6(): NativePtr
@SymbolName("sfml_kniBridge7")
private external fun kniBridge7(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge8")
private external fun kniBridge8(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge11")
private external fun kniBridge11(): NativePtr
@SymbolName("sfml_kniBridge12")
private external fun kniBridge12(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge13")
private external fun kniBridge13(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge14")
private external fun kniBridge14(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge17")
private external fun kniBridge17(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge18")
private external fun kniBridge18(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge19")
private external fun kniBridge19(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge20")
private external fun kniBridge20(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge21")
private external fun kniBridge21(p0: Float): Unit
@SymbolName("sfml_kniBridge22")
private external fun kniBridge22(): Float
@SymbolName("sfml_kniBridge23")
private external fun kniBridge23(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge24")
private external fun kniBridge24(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge25")
private external fun kniBridge25(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge26")
private external fun kniBridge26(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge27")
private external fun kniBridge27(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge28")
private external fun kniBridge28(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge29")
private external fun kniBridge29(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sfml_kniBridge31")
private external fun kniBridge31(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge32")
private external fun kniBridge32(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge34")
private external fun kniBridge34(p0: NativePtr): Int
@SymbolName("sfml_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge36")
private external fun kniBridge36(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge37")
private external fun kniBridge37(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge38")
private external fun kniBridge38(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge39")
private external fun kniBridge39(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge40")
private external fun kniBridge40(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge41")
private external fun kniBridge41(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge42")
private external fun kniBridge42(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge50")
private external fun kniBridge50(p0: NativePtr): Float
@SymbolName("sfml_kniBridge51")
private external fun kniBridge51(p0: NativePtr): Float
@SymbolName("sfml_kniBridge52")
private external fun kniBridge52(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge53")
private external fun kniBridge53(p0: NativePtr): Int
@SymbolName("sfml_kniBridge54")
private external fun kniBridge54(p0: NativePtr): Float
@SymbolName("sfml_kniBridge55")
private external fun kniBridge55(p0: NativePtr): Float
@SymbolName("sfml_kniBridge56")
private external fun kniBridge56(): NativePtr
@SymbolName("sfml_kniBridge57")
private external fun kniBridge57(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge58")
private external fun kniBridge58(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge59")
private external fun kniBridge59(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge60")
private external fun kniBridge60(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge61")
private external fun kniBridge61(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge62")
private external fun kniBridge62(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge63")
private external fun kniBridge63(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge65")
private external fun kniBridge65(p0: NativePtr): Int
@SymbolName("sfml_kniBridge66")
private external fun kniBridge66(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge74")
private external fun kniBridge74(p0: NativePtr): Float
@SymbolName("sfml_kniBridge75")
private external fun kniBridge75(p0: NativePtr): Float
@SymbolName("sfml_kniBridge76")
private external fun kniBridge76(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge77")
private external fun kniBridge77(p0: NativePtr): Int
@SymbolName("sfml_kniBridge78")
private external fun kniBridge78(p0: NativePtr): Float
@SymbolName("sfml_kniBridge79")
private external fun kniBridge79(p0: NativePtr): Float
@SymbolName("sfml_kniBridge80")
private external fun kniBridge80(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge81")
private external fun kniBridge81(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge82")
private external fun kniBridge82(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sfml_kniBridge83")
private external fun kniBridge83(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge84")
private external fun kniBridge84(p0: NativePtr, p1: ULong, p2: UInt, p3: UInt): NativePtr
@SymbolName("sfml_kniBridge85")
private external fun kniBridge85(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge86")
private external fun kniBridge86(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge88")
private external fun kniBridge88(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge89")
private external fun kniBridge89(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge90")
private external fun kniBridge90(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge91")
private external fun kniBridge91(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge93")
private external fun kniBridge93(): NativePtr
@SymbolName("sfml_kniBridge94")
private external fun kniBridge94(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge95")
private external fun kniBridge95(p0: NativePtr, p1: UInt): Int
@SymbolName("sfml_kniBridge96")
private external fun kniBridge96(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge97")
private external fun kniBridge97(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge98")
private external fun kniBridge98(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge100")
private external fun kniBridge100(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@SymbolName("sfml_kniBridge102")
private external fun kniBridge102(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge103")
private external fun kniBridge103(p0: NativePtr, p1: UInt): Int
@SymbolName("sfml_kniBridge104")
private external fun kniBridge104(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge105")
private external fun kniBridge105(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge106")
private external fun kniBridge106(): Int
@SymbolName("sfml_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge108")
private external fun kniBridge108(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge109")
private external fun kniBridge109(): NativePtr
@SymbolName("sfml_kniBridge110")
private external fun kniBridge110(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge111")
private external fun kniBridge111(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge112")
private external fun kniBridge112(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge113")
private external fun kniBridge113(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge114")
private external fun kniBridge114(p0: NativePtr, p1: NativePtr, p2: UInt, p3: UInt, p4: NativePtr): NativePtr
@SymbolName("sfml_kniBridge115")
private external fun kniBridge115(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge116")
private external fun kniBridge116(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge117")
private external fun kniBridge117(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge118")
private external fun kniBridge118(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge119")
private external fun kniBridge119(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge120")
private external fun kniBridge120(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge121")
private external fun kniBridge121(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge122")
private external fun kniBridge122(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge123")
private external fun kniBridge123(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge124")
private external fun kniBridge124(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge128")
private external fun kniBridge128(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge130")
private external fun kniBridge130(p0: NativePtr): Float
@SymbolName("sfml_kniBridge131")
private external fun kniBridge131(p0: NativePtr): Float
@SymbolName("sfml_kniBridge132")
private external fun kniBridge132(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge133")
private external fun kniBridge133(p0: NativePtr): Int
@SymbolName("sfml_kniBridge134")
private external fun kniBridge134(p0: NativePtr): Float
@SymbolName("sfml_kniBridge135")
private external fun kniBridge135(p0: NativePtr): Float
@SymbolName("sfml_kniBridge136")
private external fun kniBridge136(p0: NativePtr): Int
@SymbolName("sfml_kniBridge137")
private external fun kniBridge137(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge138")
private external fun kniBridge138(p0: UInt): Int
@SymbolName("sfml_kniBridge139")
private external fun kniBridge139(p0: UInt): UInt
@SymbolName("sfml_kniBridge140")
private external fun kniBridge140(p0: UInt, p1: UInt): Int
@SymbolName("sfml_kniBridge141")
private external fun kniBridge141(p0: UInt, p1: UInt): Int
@SymbolName("sfml_kniBridge142")
private external fun kniBridge142(p0: UInt, p1: UInt): Float
@SymbolName("sfml_kniBridge143")
private external fun kniBridge143(p0: UInt, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge144")
private external fun kniBridge144(): Unit
@SymbolName("sfml_kniBridge145")
private external fun kniBridge145(p0: Int): Int
@SymbolName("sfml_kniBridge146")
private external fun kniBridge146(p0: Int): Unit
@SymbolName("sfml_kniBridge147")
private external fun kniBridge147(p0: UInt): Int
@SymbolName("sfml_kniBridge148")
private external fun kniBridge148(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge149")
private external fun kniBridge149(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge150")
private external fun kniBridge150(p0: UInt): Int
@SymbolName("sfml_kniBridge151")
private external fun kniBridge151(p0: UInt, p1: Int): Unit
@SymbolName("sfml_kniBridge152")
private external fun kniBridge152(p0: UInt, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge153")
private external fun kniBridge153(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge154")
private external fun kniBridge154(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge155")
private external fun kniBridge155(p0: NativePtr): Int
@SymbolName("sfml_kniBridge156")
private external fun kniBridge156(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("sfml_kniBridge157")
private external fun kniBridge157(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("sfml_kniBridge158")
private external fun kniBridge158(p0: ULong, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge159")
private external fun kniBridge159(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge160")
private external fun kniBridge160(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge161")
private external fun kniBridge161(p0: NativePtr): Int
@SymbolName("sfml_kniBridge162")
private external fun kniBridge162(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge163")
private external fun kniBridge163(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge164")
private external fun kniBridge164(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge165")
private external fun kniBridge165(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge166")
private external fun kniBridge166(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge167")
private external fun kniBridge167(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge168")
private external fun kniBridge168(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge169")
private external fun kniBridge169(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge170")
private external fun kniBridge170(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge171")
private external fun kniBridge171(p0: NativePtr, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge172")
private external fun kniBridge172(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge173")
private external fun kniBridge173(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge174")
private external fun kniBridge174(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge175")
private external fun kniBridge175(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge176")
private external fun kniBridge176(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge177")
private external fun kniBridge177(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge178")
private external fun kniBridge178(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge179")
private external fun kniBridge179(p0: NativePtr, p1: Int): Int
@SymbolName("sfml_kniBridge180")
private external fun kniBridge180(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge181")
private external fun kniBridge181(p0: NativePtr): Int
@SymbolName("sfml_kniBridge182")
private external fun kniBridge182(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge183")
private external fun kniBridge183(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge184")
private external fun kniBridge184(): NativePtr
@SymbolName("sfml_kniBridge185")
private external fun kniBridge185(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge186")
private external fun kniBridge186(p0: NativePtr, p1: Int): Int
@SymbolName("sfml_kniBridge187")
private external fun kniBridge187(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge188")
private external fun kniBridge188(p0: UInt): Int
@SymbolName("sfml_kniBridge189")
private external fun kniBridge189(p0: UInt, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge190")
private external fun kniBridge190(p0: UByte, p1: UByte, p2: UByte, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge191")
private external fun kniBridge191(p0: UByte, p1: UByte, p2: UByte, p3: UByte, p4: NativePtr): Unit
@SymbolName("sfml_kniBridge192")
private external fun kniBridge192(p0: UInt, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge193")
private external fun kniBridge193(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge194")
private external fun kniBridge194(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge195")
private external fun kniBridge195(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge196")
private external fun kniBridge196(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge197")
private external fun kniBridge197(p0: NativePtr, p1: Float, p2: Float): Int
@SymbolName("sfml_kniBridge198")
private external fun kniBridge198(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("sfml_kniBridge199")
private external fun kniBridge199(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sfml_kniBridge200")
private external fun kniBridge200(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("sfml_kniBridge201")
private external fun kniBridge201(p0: Float, p1: Float, p2: Float, p3: Float, p4: Float, p5: Float, p6: Float, p7: Float, p8: Float, p9: NativePtr): Unit
@SymbolName("sfml_kniBridge202")
private external fun kniBridge202(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge203")
private external fun kniBridge203(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge204")
private external fun kniBridge204(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge205")
private external fun kniBridge205(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge206")
private external fun kniBridge206(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge207")
private external fun kniBridge207(p0: NativePtr, p1: Float, p2: Float): Unit
@SymbolName("sfml_kniBridge208")
private external fun kniBridge208(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge209")
private external fun kniBridge209(p0: NativePtr, p1: Float, p2: Float, p3: Float): Unit
@SymbolName("sfml_kniBridge210")
private external fun kniBridge210(p0: NativePtr, p1: Float, p2: Float): Unit
@SymbolName("sfml_kniBridge211")
private external fun kniBridge211(p0: NativePtr, p1: Float, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("sfml_kniBridge212")
private external fun kniBridge212(): NativePtr
@SymbolName("sfml_kniBridge213")
private external fun kniBridge213(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge214")
private external fun kniBridge214(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge215")
private external fun kniBridge215(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge216")
private external fun kniBridge216(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge217")
private external fun kniBridge217(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge218")
private external fun kniBridge218(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge219")
private external fun kniBridge219(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge220")
private external fun kniBridge220(p0: NativePtr): Float
@SymbolName("sfml_kniBridge221")
private external fun kniBridge221(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge222")
private external fun kniBridge222(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge223")
private external fun kniBridge223(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge224")
private external fun kniBridge224(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge225")
private external fun kniBridge225(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge226")
private external fun kniBridge226(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge227")
private external fun kniBridge227(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge228")
private external fun kniBridge228(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge229")
private external fun kniBridge229(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge230")
private external fun kniBridge230(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge231")
private external fun kniBridge231(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge232")
private external fun kniBridge232(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge233")
private external fun kniBridge233(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge234")
private external fun kniBridge234(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge235")
private external fun kniBridge235(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge236")
private external fun kniBridge236(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge237")
private external fun kniBridge237(p0: NativePtr): Float
@SymbolName("sfml_kniBridge238")
private external fun kniBridge238(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge239")
private external fun kniBridge239(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge240")
private external fun kniBridge240(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge241")
private external fun kniBridge241(p0: NativePtr): Float
@SymbolName("sfml_kniBridge242")
private external fun kniBridge242(p0: NativePtr, p1: ULong): Unit
@SymbolName("sfml_kniBridge243")
private external fun kniBridge243(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge244")
private external fun kniBridge244(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge245")
private external fun kniBridge245(): NativePtr
@SymbolName("sfml_kniBridge246")
private external fun kniBridge246(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge247")
private external fun kniBridge247(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge248")
private external fun kniBridge248(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge249")
private external fun kniBridge249(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge250")
private external fun kniBridge250(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge251")
private external fun kniBridge251(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge252")
private external fun kniBridge252(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge253")
private external fun kniBridge253(p0: NativePtr): Float
@SymbolName("sfml_kniBridge254")
private external fun kniBridge254(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge255")
private external fun kniBridge255(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge256")
private external fun kniBridge256(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge257")
private external fun kniBridge257(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge258")
private external fun kniBridge258(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge259")
private external fun kniBridge259(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge260")
private external fun kniBridge260(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge261")
private external fun kniBridge261(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge262")
private external fun kniBridge262(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge263")
private external fun kniBridge263(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge264")
private external fun kniBridge264(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge265")
private external fun kniBridge265(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge266")
private external fun kniBridge266(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge267")
private external fun kniBridge267(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge268")
private external fun kniBridge268(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge269")
private external fun kniBridge269(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge270")
private external fun kniBridge270(p0: NativePtr): Float
@SymbolName("sfml_kniBridge271")
private external fun kniBridge271(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge272")
private external fun kniBridge272(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge273")
private external fun kniBridge273(p0: NativePtr, p1: ULong): Unit
@SymbolName("sfml_kniBridge274")
private external fun kniBridge274(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge275")
private external fun kniBridge275(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge276")
private external fun kniBridge276(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge277")
private external fun kniBridge277(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge278")
private external fun kniBridge278(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sfml_kniBridge279")
private external fun kniBridge279(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge280")
private external fun kniBridge280(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge281")
private external fun kniBridge281(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge282")
private external fun kniBridge282(p0: NativePtr, p1: UInt, p2: UInt, p3: Int, p4: Float, p5: NativePtr): Unit
@SymbolName("sfml_kniBridge283")
private external fun kniBridge283(p0: NativePtr, p1: UInt, p2: UInt, p3: UInt): Float
@SymbolName("sfml_kniBridge284")
private external fun kniBridge284(p0: NativePtr, p1: UInt): Float
@SymbolName("sfml_kniBridge285")
private external fun kniBridge285(p0: NativePtr, p1: UInt): Float
@SymbolName("sfml_kniBridge286")
private external fun kniBridge286(p0: NativePtr, p1: UInt): Float
@SymbolName("sfml_kniBridge287")
private external fun kniBridge287(p0: NativePtr, p1: UInt): NativePtr
@SymbolName("sfml_kniBridge288")
private external fun kniBridge288(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge289")
private external fun kniBridge289(p0: UInt, p1: UInt): NativePtr
@SymbolName("sfml_kniBridge290")
private external fun kniBridge290(p0: UInt, p1: UInt, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge291")
private external fun kniBridge291(p0: UInt, p1: UInt, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge292")
private external fun kniBridge292(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge293")
private external fun kniBridge293(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sfml_kniBridge294")
private external fun kniBridge294(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge295")
private external fun kniBridge295(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge296")
private external fun kniBridge296(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge297")
private external fun kniBridge297(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge298")
private external fun kniBridge298(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge299")
private external fun kniBridge299(p0: NativePtr, p1: NativePtr, p2: UByte): Unit
@SymbolName("sfml_kniBridge300")
private external fun kniBridge300(p0: NativePtr, p1: NativePtr, p2: UInt, p3: UInt, p4: NativePtr, p5: Int): Unit
@SymbolName("sfml_kniBridge301")
private external fun kniBridge301(p0: NativePtr, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge302")
private external fun kniBridge302(p0: NativePtr, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge303")
private external fun kniBridge303(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge304")
private external fun kniBridge304(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge305")
private external fun kniBridge305(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge306")
private external fun kniBridge306(): NativePtr
@SymbolName("sfml_kniBridge307")
private external fun kniBridge307(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge308")
private external fun kniBridge308(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge309")
private external fun kniBridge309(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge310")
private external fun kniBridge310(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge311")
private external fun kniBridge311(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge312")
private external fun kniBridge312(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge313")
private external fun kniBridge313(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge314")
private external fun kniBridge314(p0: NativePtr): Float
@SymbolName("sfml_kniBridge315")
private external fun kniBridge315(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge316")
private external fun kniBridge316(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge317")
private external fun kniBridge317(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge318")
private external fun kniBridge318(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge319")
private external fun kniBridge319(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge320")
private external fun kniBridge320(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge321")
private external fun kniBridge321(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge322")
private external fun kniBridge322(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge323")
private external fun kniBridge323(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge324")
private external fun kniBridge324(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge325")
private external fun kniBridge325(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge326")
private external fun kniBridge326(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge327")
private external fun kniBridge327(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge328")
private external fun kniBridge328(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge329")
private external fun kniBridge329(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge330")
private external fun kniBridge330(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge331")
private external fun kniBridge331(p0: NativePtr): Float
@SymbolName("sfml_kniBridge332")
private external fun kniBridge332(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge333")
private external fun kniBridge333(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge334")
private external fun kniBridge334(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge335")
private external fun kniBridge335(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge336")
private external fun kniBridge336(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge337")
private external fun kniBridge337(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge338")
private external fun kniBridge338(p0: UInt, p1: UInt, p2: Int): NativePtr
@SymbolName("sfml_kniBridge339")
private external fun kniBridge339(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge340")
private external fun kniBridge340(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge341")
private external fun kniBridge341(p0: NativePtr, p1: Int): Int
@SymbolName("sfml_kniBridge342")
private external fun kniBridge342(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge343")
private external fun kniBridge343(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge344")
private external fun kniBridge344(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge345")
private external fun kniBridge345(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge346")
private external fun kniBridge346(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge347")
private external fun kniBridge347(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge348")
private external fun kniBridge348(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge349")
private external fun kniBridge349(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge350")
private external fun kniBridge350(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge351")
private external fun kniBridge351(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge352")
private external fun kniBridge352(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge353")
private external fun kniBridge353(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge354")
private external fun kniBridge354(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge355")
private external fun kniBridge355(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge356")
private external fun kniBridge356(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge357")
private external fun kniBridge357(p0: NativePtr, p1: NativePtr, p2: ULong, p3: UInt, p4: NativePtr): Unit
@SymbolName("sfml_kniBridge358")
private external fun kniBridge358(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge359")
private external fun kniBridge359(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge360")
private external fun kniBridge360(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge361")
private external fun kniBridge361(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge362")
private external fun kniBridge362(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge363")
private external fun kniBridge363(p0: NativePtr): Int
@SymbolName("sfml_kniBridge364")
private external fun kniBridge364(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge365")
private external fun kniBridge365(p0: NativePtr): Int
@SymbolName("sfml_kniBridge366")
private external fun kniBridge366(p0: NativePtr): Int
@SymbolName("sfml_kniBridge367")
private external fun kniBridge367(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("sfml_kniBridge368")
private external fun kniBridge368(p0: NativePtr, p1: NativePtr, p2: UInt, p3: NativePtr): NativePtr
@SymbolName("sfml_kniBridge369")
private external fun kniBridge369(p0: ULong, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge370")
private external fun kniBridge370(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge371")
private external fun kniBridge371(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge372")
private external fun kniBridge372(p0: NativePtr): Int
@SymbolName("sfml_kniBridge373")
private external fun kniBridge373(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge374")
private external fun kniBridge374(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge375")
private external fun kniBridge375(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge376")
private external fun kniBridge376(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge377")
private external fun kniBridge377(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge378")
private external fun kniBridge378(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge379")
private external fun kniBridge379(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge380")
private external fun kniBridge380(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge381")
private external fun kniBridge381(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge382")
private external fun kniBridge382(p0: NativePtr, p1: UInt, p2: UInt, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge383")
private external fun kniBridge383(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge384")
private external fun kniBridge384(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge385")
private external fun kniBridge385(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge386")
private external fun kniBridge386(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge387")
private external fun kniBridge387(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge388")
private external fun kniBridge388(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge389")
private external fun kniBridge389(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge390")
private external fun kniBridge390(p0: NativePtr, p1: Int): Int
@SymbolName("sfml_kniBridge391")
private external fun kniBridge391(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge392")
private external fun kniBridge392(p0: NativePtr): Int
@SymbolName("sfml_kniBridge393")
private external fun kniBridge393(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge394")
private external fun kniBridge394(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge395")
private external fun kniBridge395(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge396")
private external fun kniBridge396(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge397")
private external fun kniBridge397(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge398")
private external fun kniBridge398(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge399")
private external fun kniBridge399(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge400")
private external fun kniBridge400(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge401")
private external fun kniBridge401(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): Unit
@SymbolName("sfml_kniBridge402")
private external fun kniBridge402(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge403")
private external fun kniBridge403(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge404")
private external fun kniBridge404(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge405")
private external fun kniBridge405(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge406")
private external fun kniBridge406(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge407")
private external fun kniBridge407(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge408")
private external fun kniBridge408(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge409")
private external fun kniBridge409(p0: NativePtr, p1: NativePtr, p2: ULong, p3: UInt, p4: NativePtr): Unit
@SymbolName("sfml_kniBridge410")
private external fun kniBridge410(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge411")
private external fun kniBridge411(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge412")
private external fun kniBridge412(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge413")
private external fun kniBridge413(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge414")
private external fun kniBridge414(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge415")
private external fun kniBridge415(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge416")
private external fun kniBridge416(p0: UInt, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge417")
private external fun kniBridge417(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge418")
private external fun kniBridge418(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge419")
private external fun kniBridge419(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge420")
private external fun kniBridge420(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge421")
private external fun kniBridge421(p0: NativePtr, p1: NativePtr, p2: Float): Unit
@SymbolName("sfml_kniBridge422")
private external fun kniBridge422(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge423")
private external fun kniBridge423(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge424")
private external fun kniBridge424(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge425")
private external fun kniBridge425(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge426")
private external fun kniBridge426(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge427")
private external fun kniBridge427(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge428")
private external fun kniBridge428(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge429")
private external fun kniBridge429(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge430")
private external fun kniBridge430(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge431")
private external fun kniBridge431(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge432")
private external fun kniBridge432(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge433")
private external fun kniBridge433(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge434")
private external fun kniBridge434(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge435")
private external fun kniBridge435(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge436")
private external fun kniBridge436(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge437")
private external fun kniBridge437(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge438")
private external fun kniBridge438(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge439")
private external fun kniBridge439(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("sfml_kniBridge440")
private external fun kniBridge440(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("sfml_kniBridge441")
private external fun kniBridge441(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("sfml_kniBridge442")
private external fun kniBridge442(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("sfml_kniBridge443")
private external fun kniBridge443(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("sfml_kniBridge444")
private external fun kniBridge444(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: ULong): Unit
@SymbolName("sfml_kniBridge445")
private external fun kniBridge445(p0: NativePtr, p1: NativePtr, p2: Float): Unit
@SymbolName("sfml_kniBridge446")
private external fun kniBridge446(p0: NativePtr, p1: NativePtr, p2: Float, p3: Float): Unit
@SymbolName("sfml_kniBridge447")
private external fun kniBridge447(p0: NativePtr, p1: NativePtr, p2: Float, p3: Float, p4: Float): Unit
@SymbolName("sfml_kniBridge448")
private external fun kniBridge448(p0: NativePtr, p1: NativePtr, p2: Float, p3: Float, p4: Float, p5: Float): Unit
@SymbolName("sfml_kniBridge449")
private external fun kniBridge449(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge450")
private external fun kniBridge450(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge451")
private external fun kniBridge451(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge452")
private external fun kniBridge452(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge453")
private external fun kniBridge453(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge454")
private external fun kniBridge454(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge455")
private external fun kniBridge455(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge456")
private external fun kniBridge456(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge457")
private external fun kniBridge457(): Int
@SymbolName("sfml_kniBridge458")
private external fun kniBridge458(): Int
@SymbolName("sfml_kniBridge459")
private external fun kniBridge459(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge460")
private external fun kniBridge460(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge461")
private external fun kniBridge461(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge462")
private external fun kniBridge462(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge463")
private external fun kniBridge463(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge464")
private external fun kniBridge464(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge465")
private external fun kniBridge465(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge466")
private external fun kniBridge466(p0: NativePtr): Float
@SymbolName("sfml_kniBridge467")
private external fun kniBridge467(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge468")
private external fun kniBridge468(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge469")
private external fun kniBridge469(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge470")
private external fun kniBridge470(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge471")
private external fun kniBridge471(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge472")
private external fun kniBridge472(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge473")
private external fun kniBridge473(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge474")
private external fun kniBridge474(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge475")
private external fun kniBridge475(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge476")
private external fun kniBridge476(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge477")
private external fun kniBridge477(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge478")
private external fun kniBridge478(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge479")
private external fun kniBridge479(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge480")
private external fun kniBridge480(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge481")
private external fun kniBridge481(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge482")
private external fun kniBridge482(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge483")
private external fun kniBridge483(p0: NativePtr): Float
@SymbolName("sfml_kniBridge484")
private external fun kniBridge484(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge485")
private external fun kniBridge485(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge486")
private external fun kniBridge486(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge487")
private external fun kniBridge487(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge488")
private external fun kniBridge488(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge489")
private external fun kniBridge489(): NativePtr
@SymbolName("sfml_kniBridge490")
private external fun kniBridge490(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge491")
private external fun kniBridge491(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge492")
private external fun kniBridge492(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge493")
private external fun kniBridge493(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge494")
private external fun kniBridge494(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge495")
private external fun kniBridge495(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge496")
private external fun kniBridge496(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge497")
private external fun kniBridge497(p0: NativePtr): Float
@SymbolName("sfml_kniBridge498")
private external fun kniBridge498(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge499")
private external fun kniBridge499(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge500")
private external fun kniBridge500(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge501")
private external fun kniBridge501(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge502")
private external fun kniBridge502(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge503")
private external fun kniBridge503(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge504")
private external fun kniBridge504(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge505")
private external fun kniBridge505(p0: NativePtr, p1: NativePtr, p2: Int): Unit
@SymbolName("sfml_kniBridge506")
private external fun kniBridge506(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge507")
private external fun kniBridge507(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge508")
private external fun kniBridge508(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge509")
private external fun kniBridge509(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge510")
private external fun kniBridge510(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge511")
private external fun kniBridge511(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge512")
private external fun kniBridge512(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge513")
private external fun kniBridge513(): NativePtr
@SymbolName("sfml_kniBridge514")
private external fun kniBridge514(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge515")
private external fun kniBridge515(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge516")
private external fun kniBridge516(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge517")
private external fun kniBridge517(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge518")
private external fun kniBridge518(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge519")
private external fun kniBridge519(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge520")
private external fun kniBridge520(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge521")
private external fun kniBridge521(p0: NativePtr): Float
@SymbolName("sfml_kniBridge522")
private external fun kniBridge522(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge523")
private external fun kniBridge523(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge524")
private external fun kniBridge524(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge525")
private external fun kniBridge525(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge526")
private external fun kniBridge526(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge527")
private external fun kniBridge527(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge528")
private external fun kniBridge528(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge529")
private external fun kniBridge529(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge530")
private external fun kniBridge530(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge531")
private external fun kniBridge531(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge532")
private external fun kniBridge532(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge533")
private external fun kniBridge533(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge534")
private external fun kniBridge534(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge535")
private external fun kniBridge535(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge536")
private external fun kniBridge536(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge537")
private external fun kniBridge537(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge538")
private external fun kniBridge538(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge539")
private external fun kniBridge539(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge540")
private external fun kniBridge540(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge541")
private external fun kniBridge541(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge542")
private external fun kniBridge542(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge543")
private external fun kniBridge543(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge544")
private external fun kniBridge544(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge545")
private external fun kniBridge545(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge546")
private external fun kniBridge546(p0: NativePtr): Float
@SymbolName("sfml_kniBridge547")
private external fun kniBridge547(p0: NativePtr, p1: ULong, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge548")
private external fun kniBridge548(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge549")
private external fun kniBridge549(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge550")
private external fun kniBridge550(p0: UInt, p1: UInt): NativePtr
@SymbolName("sfml_kniBridge551")
private external fun kniBridge551(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge552")
private external fun kniBridge552(p0: NativePtr, p1: ULong, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge553")
private external fun kniBridge553(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge554")
private external fun kniBridge554(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge555")
private external fun kniBridge555(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge556")
private external fun kniBridge556(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge557")
private external fun kniBridge557(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge558")
private external fun kniBridge558(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge559")
private external fun kniBridge559(p0: NativePtr, p1: NativePtr, p2: UInt, p3: UInt, p4: UInt, p5: UInt): Unit
@SymbolName("sfml_kniBridge560")
private external fun kniBridge560(p0: NativePtr, p1: NativePtr, p2: UInt, p3: UInt): Unit
@SymbolName("sfml_kniBridge561")
private external fun kniBridge561(p0: NativePtr, p1: NativePtr, p2: UInt, p3: UInt): Unit
@SymbolName("sfml_kniBridge562")
private external fun kniBridge562(p0: NativePtr, p1: NativePtr, p2: UInt, p3: UInt): Unit
@SymbolName("sfml_kniBridge563")
private external fun kniBridge563(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge564")
private external fun kniBridge564(p0: NativePtr): Int
@SymbolName("sfml_kniBridge565")
private external fun kniBridge565(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge566")
private external fun kniBridge566(p0: NativePtr): Int
@SymbolName("sfml_kniBridge567")
private external fun kniBridge567(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge568")
private external fun kniBridge568(p0: NativePtr): Int
@SymbolName("sfml_kniBridge569")
private external fun kniBridge569(p0: NativePtr): Int
@SymbolName("sfml_kniBridge570")
private external fun kniBridge570(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge571")
private external fun kniBridge571(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge572")
private external fun kniBridge572(): UInt
@SymbolName("sfml_kniBridge573")
private external fun kniBridge573(): NativePtr
@SymbolName("sfml_kniBridge574")
private external fun kniBridge574(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge575")
private external fun kniBridge575(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge576")
private external fun kniBridge576(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge577")
private external fun kniBridge577(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge578")
private external fun kniBridge578(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge579")
private external fun kniBridge579(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge580")
private external fun kniBridge580(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge581")
private external fun kniBridge581(p0: NativePtr): Float
@SymbolName("sfml_kniBridge582")
private external fun kniBridge582(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge583")
private external fun kniBridge583(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge584")
private external fun kniBridge584(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge585")
private external fun kniBridge585(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge586")
private external fun kniBridge586(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge587")
private external fun kniBridge587(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge588")
private external fun kniBridge588(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge589")
private external fun kniBridge589(): NativePtr
@SymbolName("sfml_kniBridge590")
private external fun kniBridge590(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge591")
private external fun kniBridge591(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge592")
private external fun kniBridge592(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge593")
private external fun kniBridge593(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sfml_kniBridge594")
private external fun kniBridge594(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge595")
private external fun kniBridge595(p0: NativePtr, p1: ULong): Unit
@SymbolName("sfml_kniBridge596")
private external fun kniBridge596(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge597")
private external fun kniBridge597(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge598")
private external fun kniBridge598(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge599")
private external fun kniBridge599(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge600")
private external fun kniBridge600(): NativePtr
@SymbolName("sfml_kniBridge601")
private external fun kniBridge601(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge602")
private external fun kniBridge602(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge603")
private external fun kniBridge603(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge604")
private external fun kniBridge604(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge605")
private external fun kniBridge605(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge606")
private external fun kniBridge606(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge607")
private external fun kniBridge607(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge608")
private external fun kniBridge608(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge609")
private external fun kniBridge609(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge610")
private external fun kniBridge610(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge611")
private external fun kniBridge611(p0: NativePtr): Float
@SymbolName("sfml_kniBridge612")
private external fun kniBridge612(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge613")
private external fun kniBridge613(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge614")
private external fun kniBridge614(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge615")
private external fun kniBridge615(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge616")
private external fun kniBridge616(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge617")
private external fun kniBridge617(p0: UByte, p1: UByte, p2: UByte, p3: UByte, p4: NativePtr): Unit
@SymbolName("sfml_kniBridge618")
private external fun kniBridge618(p0: UInt, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge619")
private external fun kniBridge619(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge620")
private external fun kniBridge620(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge621")
private external fun kniBridge621(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge622")
private external fun kniBridge622(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge623")
private external fun kniBridge623(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge624")
private external fun kniBridge624(p0: NativePtr): Int
@SymbolName("sfml_kniBridge625")
private external fun kniBridge625(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge626")
private external fun kniBridge626(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge627")
private external fun kniBridge627(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge628")
private external fun kniBridge628(p0: NativePtr, p1: ULong): NativePtr
@SymbolName("sfml_kniBridge629")
private external fun kniBridge629(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge630")
private external fun kniBridge630(p0: NativePtr): Int
@SymbolName("sfml_kniBridge631")
private external fun kniBridge631(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge632")
private external fun kniBridge632(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge633")
private external fun kniBridge633(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge634")
private external fun kniBridge634(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge635")
private external fun kniBridge635(p0: NativePtr): Int
@SymbolName("sfml_kniBridge636")
private external fun kniBridge636(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge637")
private external fun kniBridge637(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge638")
private external fun kniBridge638(): NativePtr
@SymbolName("sfml_kniBridge639")
private external fun kniBridge639(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge640")
private external fun kniBridge640(p0: NativePtr, p1: NativePtr, p2: UShort, p3: NativePtr): NativePtr
@SymbolName("sfml_kniBridge641")
private external fun kniBridge641(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge642")
private external fun kniBridge642(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge643")
private external fun kniBridge643(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge644")
private external fun kniBridge644(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge645")
private external fun kniBridge645(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge646")
private external fun kniBridge646(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge647")
private external fun kniBridge647(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge648")
private external fun kniBridge648(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge649")
private external fun kniBridge649(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge650")
private external fun kniBridge650(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge651")
private external fun kniBridge651(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge652")
private external fun kniBridge652(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge653")
private external fun kniBridge653(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UInt): NativePtr
@SymbolName("sfml_kniBridge654")
private external fun kniBridge654(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UInt): NativePtr
@SymbolName("sfml_kniBridge655")
private external fun kniBridge655(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge656")
private external fun kniBridge656(): NativePtr
@SymbolName("sfml_kniBridge657")
private external fun kniBridge657(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge658")
private external fun kniBridge658(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("sfml_kniBridge659")
private external fun kniBridge659(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge660")
private external fun kniBridge660(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge661")
private external fun kniBridge661(p0: NativePtr, p1: UInt, p2: UInt): Unit
@SymbolName("sfml_kniBridge662")
private external fun kniBridge662(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge663")
private external fun kniBridge663(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge664")
private external fun kniBridge664(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("sfml_kniBridge665")
private external fun kniBridge665(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge666")
private external fun kniBridge666(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge667")
private external fun kniBridge667(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge668")
private external fun kniBridge668(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge669")
private external fun kniBridge669(): NativePtr
@SymbolName("sfml_kniBridge670")
private external fun kniBridge670(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge671")
private external fun kniBridge671(p0: NativePtr, p1: NativePtr, p2: UShort): Unit
@SymbolName("sfml_kniBridge672")
private external fun kniBridge672(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@SymbolName("sfml_kniBridge673")
private external fun kniBridge673(): NativePtr
@SymbolName("sfml_kniBridge674")
private external fun kniBridge674(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge675")
private external fun kniBridge675(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge676")
private external fun kniBridge676(p0: NativePtr, p1: NativePtr, p2: ULong): Unit
@SymbolName("sfml_kniBridge677")
private external fun kniBridge677(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge678")
private external fun kniBridge678(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge679")
private external fun kniBridge679(p0: NativePtr): ULong
@SymbolName("sfml_kniBridge680")
private external fun kniBridge680(p0: NativePtr): Int
@SymbolName("sfml_kniBridge681")
private external fun kniBridge681(p0: NativePtr): Int
@SymbolName("sfml_kniBridge682")
private external fun kniBridge682(p0: NativePtr): Int
@SymbolName("sfml_kniBridge683")
private external fun kniBridge683(p0: NativePtr): Byte
@SymbolName("sfml_kniBridge684")
private external fun kniBridge684(p0: NativePtr): UByte
@SymbolName("sfml_kniBridge685")
private external fun kniBridge685(p0: NativePtr): Short
@SymbolName("sfml_kniBridge686")
private external fun kniBridge686(p0: NativePtr): UShort
@SymbolName("sfml_kniBridge687")
private external fun kniBridge687(p0: NativePtr): Int
@SymbolName("sfml_kniBridge688")
private external fun kniBridge688(p0: NativePtr): UInt
@SymbolName("sfml_kniBridge689")
private external fun kniBridge689(p0: NativePtr): Float
@SymbolName("sfml_kniBridge690")
private external fun kniBridge690(p0: NativePtr): Double
@SymbolName("sfml_kniBridge691")
private external fun kniBridge691(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge692")
private external fun kniBridge692(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge693")
private external fun kniBridge693(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge694")
private external fun kniBridge694(p0: NativePtr, p1: Byte): Unit
@SymbolName("sfml_kniBridge695")
private external fun kniBridge695(p0: NativePtr, p1: UByte): Unit
@SymbolName("sfml_kniBridge696")
private external fun kniBridge696(p0: NativePtr, p1: Short): Unit
@SymbolName("sfml_kniBridge697")
private external fun kniBridge697(p0: NativePtr, p1: UShort): Unit
@SymbolName("sfml_kniBridge698")
private external fun kniBridge698(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge699")
private external fun kniBridge699(p0: NativePtr, p1: UInt): Unit
@SymbolName("sfml_kniBridge700")
private external fun kniBridge700(p0: NativePtr, p1: Float): Unit
@SymbolName("sfml_kniBridge701")
private external fun kniBridge701(p0: NativePtr, p1: Double): Unit
@SymbolName("sfml_kniBridge702")
private external fun kniBridge702(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge703")
private external fun kniBridge703(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge704")
private external fun kniBridge704(): NativePtr
@SymbolName("sfml_kniBridge705")
private external fun kniBridge705(p0: NativePtr): NativePtr
@SymbolName("sfml_kniBridge706")
private external fun kniBridge706(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge707")
private external fun kniBridge707(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge708")
private external fun kniBridge708(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge709")
private external fun kniBridge709(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge710")
private external fun kniBridge710(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge711")
private external fun kniBridge711(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge712")
private external fun kniBridge712(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge713")
private external fun kniBridge713(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge714")
private external fun kniBridge714(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge715")
private external fun kniBridge715(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge716")
private external fun kniBridge716(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge717")
private external fun kniBridge717(p0: NativePtr, p1: NativePtr): Int
@SymbolName("sfml_kniBridge718")
private external fun kniBridge718(): NativePtr
@SymbolName("sfml_kniBridge719")
private external fun kniBridge719(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge720")
private external fun kniBridge720(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge721")
private external fun kniBridge721(p0: NativePtr): Int
@SymbolName("sfml_kniBridge722")
private external fun kniBridge722(p0: NativePtr): UShort
@SymbolName("sfml_kniBridge723")
private external fun kniBridge723(p0: NativePtr, p1: UShort, p2: NativePtr): UInt
@SymbolName("sfml_kniBridge724")
private external fun kniBridge724(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sfml_kniBridge725")
private external fun kniBridge725(): NativePtr
@SymbolName("sfml_kniBridge726")
private external fun kniBridge726(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge727")
private external fun kniBridge727(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge728")
private external fun kniBridge728(p0: NativePtr): Int
@SymbolName("sfml_kniBridge729")
private external fun kniBridge729(p0: NativePtr): UShort
@SymbolName("sfml_kniBridge730")
private external fun kniBridge730(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("sfml_kniBridge731")
private external fun kniBridge731(p0: NativePtr): UShort
@SymbolName("sfml_kniBridge732")
private external fun kniBridge732(p0: NativePtr, p1: NativePtr, p2: UShort, p3: NativePtr): UInt
@SymbolName("sfml_kniBridge733")
private external fun kniBridge733(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge734")
private external fun kniBridge734(p0: NativePtr, p1: NativePtr, p2: ULong): UInt
@SymbolName("sfml_kniBridge735")
private external fun kniBridge735(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): UInt
@SymbolName("sfml_kniBridge736")
private external fun kniBridge736(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr): UInt
@SymbolName("sfml_kniBridge737")
private external fun kniBridge737(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sfml_kniBridge738")
private external fun kniBridge738(p0: NativePtr, p1: NativePtr): UInt
@SymbolName("sfml_kniBridge739")
private external fun kniBridge739(): NativePtr
@SymbolName("sfml_kniBridge740")
private external fun kniBridge740(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge741")
private external fun kniBridge741(p0: NativePtr, p1: Int): Unit
@SymbolName("sfml_kniBridge742")
private external fun kniBridge742(p0: NativePtr): Int
@SymbolName("sfml_kniBridge743")
private external fun kniBridge743(p0: NativePtr): UShort
@SymbolName("sfml_kniBridge744")
private external fun kniBridge744(p0: NativePtr, p1: UShort, p2: NativePtr): UInt
@SymbolName("sfml_kniBridge745")
private external fun kniBridge745(p0: NativePtr): Unit
@SymbolName("sfml_kniBridge746")
private external fun kniBridge746(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: UShort): UInt
@SymbolName("sfml_kniBridge747")
private external fun kniBridge747(p0: NativePtr, p1: NativePtr, p2: ULong, p3: NativePtr, p4: NativePtr, p5: NativePtr): UInt
@SymbolName("sfml_kniBridge748")
private external fun kniBridge748(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: UShort): UInt
@SymbolName("sfml_kniBridge749")
private external fun kniBridge749(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): UInt
@SymbolName("sfml_kniBridge750")
private external fun kniBridge750(): UInt
@SymbolName("sfml_kniBridge751")
private external fun kniBridge751(): NativePtr
@SymbolName("sfml_kniBridge752")
private external fun kniBridge752(): NativePtr
@SymbolName("sfml_kniBridge753")
private external fun kniBridge753(): NativePtr
@SymbolName("sfml_kniBridge754")
private external fun kniBridge754(): NativePtr
@SymbolName("sfml_kniBridge755")
private external fun kniBridge755(): NativePtr
@SymbolName("sfml_kniBridge756")
private external fun kniBridge756(): NativePtr
@SymbolName("sfml_kniBridge757")
private external fun kniBridge757(): NativePtr
@SymbolName("sfml_kniBridge758")
private external fun kniBridge758(): NativePtr
@SymbolName("sfml_kniBridge759")
private external fun kniBridge759(): NativePtr
@SymbolName("sfml_kniBridge760")
private external fun kniBridge760(): NativePtr
@SymbolName("sfml_kniBridge761")
private external fun kniBridge761(): NativePtr
@SymbolName("sfml_kniBridge762")
private external fun kniBridge762(): NativePtr
@SymbolName("sfml_kniBridge763")
private external fun kniBridge763(): NativePtr
@SymbolName("sfml_kniBridge764")
private external fun kniBridge764(): NativePtr
@SymbolName("sfml_kniBridge765")
private external fun kniBridge765(): NativePtr
@SymbolName("sfml_kniBridge766")
private external fun kniBridge766(): NativePtr
@SymbolName("sfml_kniBridge767")
private external fun kniBridge767(): NativePtr
@SymbolName("sfml_kniBridge768")
private external fun kniBridge768(): NativePtr
@SymbolName("sfml_kniBridge769")
private external fun kniBridge769(): NativePtr
