package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import org.webrtc.Logging;

/* loaded from: classes4.dex */
final class WebRtcAudioUtils {
    private static final String TAG = "WebRtcAudioUtilsExternal";

    private static String deviceTypeToString(int i10) {
        switch (i10) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static String getThreadInfo() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    private static boolean hasMicrophone(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return audioManager.isVolumeFixed();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        AudioDeviceInfo[] devices = audioManager.getDevices(3);
        if (devices.length == 0) {
            return;
        }
        Logging.d(str, "Audio Devices: ");
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(deviceTypeToString(audioDeviceInfo.getType()));
            sb2.append(audioDeviceInfo.isSource() ? "(in): " : "(out): ");
            if (audioDeviceInfo.getChannelCounts().length > 0) {
                sb2.append("channels=");
                sb2.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getEncodings().length > 0) {
                sb2.append("encodings=");
                sb2.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                sb2.append(", ");
            }
            if (audioDeviceInfo.getSampleRates().length > 0) {
                sb2.append("sample rates=");
                sb2.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                sb2.append(", ");
            }
            sb2.append("id=");
            sb2.append(audioDeviceInfo.getId());
            Logging.d(str, sb2.toString());
        }
    }

    public static void logAudioState(String str, Context context, AudioManager audioManager) {
        logDeviceInfo(str);
        logAudioStateBasic(str, context, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, Context context, AudioManager audioManager) {
        Logging.d(str, "Audio State: audio mode: " + modeToString(audioManager.getMode()) + ", has mic: " + hasMicrophone(context) + ", mic muted: " + audioManager.isMicrophoneMute() + ", music active: " + audioManager.isMusicActive() + ", speakerphone: " + audioManager.isSpeakerphoneOn() + ", BT SCO: " + audioManager.isBluetoothScoOn());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.d(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        Logging.d(str, "  fixed volume=" + isVolumeFixed);
        if (isVolumeFixed) {
            return;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  " + streamTypeToString(i11) + ": ");
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i11));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i11));
            logIsStreamMute(str, audioManager, i11, sb2);
            Logging.d(str, sb2.toString());
        }
    }

    public static void logDeviceInfo(String str) {
        Logging.d(str, "Android SDK: " + Build.VERSION.SDK_INT + ", Release: " + Build.VERSION.RELEASE + ", Brand: " + Build.BRAND + ", Device: " + Build.DEVICE + ", Id: " + Build.ID + ", Hardware: " + Build.HARDWARE + ", Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", Product: " + Build.PRODUCT);
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i10, StringBuilder sb2) {
        if (Build.VERSION.SDK_INT >= 23) {
            sb2.append(", muted=");
            sb2.append(audioManager.isStreamMute(i10));
        }
    }

    public static String modeToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static boolean runningOnLollipopOrHigher() {
        return Build.VERSION.SDK_INT >= 21;
    }

    private static String streamTypeToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }
}
