package com.dena.mirrorman.webrtc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;
import com.dena.mirrorman.webrtc.RTCAudioManager;
import com.mirrativ.llstream.encoder.AACEncoder;
import hf.m0;
import java.util.HashSet;
import java.util.Set;
import jo.h;
import jo.p;
import nd.i1;
import of.d;
import oq.a;
import org.webrtc.voiceengine.WebRtcAudioManager;
import org.webrtc.voiceengine.WebRtcAudioMediator;
import org.webrtc.voiceengine.WebRtcAudioUtils;
import wn.f;
import wn.g;

/* loaded from: classes3.dex */
public final class RTCAudioManager implements oq.a {
    private static final String SPEAKERPHONE_FALSE = "false";
    private static final String SPEAKERPHONE_TRUE = "true";
    private static final String TAG = "RTCAudioManager";
    private final Context apprtcContext;
    private final Set<AudioDevice> audioDevices;
    private AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private final AudioManager audioManager;
    private AudioDevice defaultAudioDevice;
    private boolean initialized;
    private final Runnable onStateChangeListener;
    private Integer savedAudioMode;
    private boolean savedIsMicrophoneMute;
    private int savedIsMusicVolume;
    private boolean savedIsSpeakerPhoneOn;
    private final int savedIsVoiceVolume;
    private AudioDevice selectedAudioDevice;
    private final f settingHelper$delegate;
    private final f sharedApplicationModel$delegate;
    private final String useSpeakerphone;
    private BroadcastReceiver wiredHeadsetReceiver;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public enum AudioDevice {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final RTCAudioManager create(Context context, Runnable runnable) {
            p.h(context, "context");
            p.h(runnable, "deviceStateChangeListener");
            return new RTCAudioManager(context, runnable, null);
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioDevice.values().length];
            iArr[AudioDevice.SPEAKER_PHONE.ordinal()] = 1;
            iArr[AudioDevice.EARPIECE.ordinal()] = 2;
            iArr[AudioDevice.WIRED_HEADSET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private RTCAudioManager(Context context, Runnable runnable) {
        AudioDevice audioDevice;
        this.apprtcContext = context;
        this.audioDevices = new HashSet();
        cr.a aVar = cr.a.f28611a;
        this.settingHelper$delegate = g.b(aVar.b(), new RTCAudioManager$special$$inlined$inject$default$1(this, null, null));
        this.sharedApplicationModel$delegate = g.b(aVar.b(), new RTCAudioManager$special$$inlined$inject$default$2(this, null, null));
        this.onStateChangeListener = runnable;
        Object systemService = context.getSystemService("audio");
        p.f(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        this.useSpeakerphone = SPEAKERPHONE_TRUE;
        if (p.c(SPEAKERPHONE_TRUE, SPEAKERPHONE_FALSE)) {
            audioDevice = AudioDevice.EARPIECE;
        } else {
            audioDevice = AudioDevice.SPEAKER_PHONE;
        }
        this.defaultAudioDevice = audioDevice;
        WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(true);
        WebRtcAudioUtils.setDefaultSampleRateHz(AACEncoder.SAMPLING_RATE);
    }

    public /* synthetic */ RTCAudioManager(Context context, Runnable runnable, h hVar) {
        this(context, runnable);
    }

    private final m0 getSettingHelper() {
        return (m0) this.settingHelper$delegate.getValue();
    }

    private final i1 getSharedApplicationModel() {
        return (i1) this.sharedApplicationModel$delegate.getValue();
    }

    private final boolean hasEarpiece() {
        return this.apprtcContext.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private final boolean hasWiredHeadset() {
        return this.audioManager.isWiredHeadsetOn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-0  reason: not valid java name */
    public static final void m20init$lambda0(int i10) {
        String str = i10 != -3 ? i10 != -2 ? i10 != -1 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "AUDIOFOCUS_INVALID" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE" : "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK" : "AUDIOFOCUS_GAIN_TRANSIENT" : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        Log.d(TAG, "onAudioFocusChange: " + str);
    }

    private final void onAudioManagerChangedState() {
        Log.d(TAG, "onAudioManagerChangedState: devices=" + this.audioDevices + ", selected=" + this.selectedAudioDevice);
        Runnable runnable = this.onStateChangeListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void registerForWiredHeadsetIntentBroadcast() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.dena.mirrorman.webrtc.RTCAudioManager$registerForWiredHeadsetIntentBroadcast$1
            private final int STATE_PLUGGED = 1;
            private final int STATE_UNPLUGGED;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                RTCAudioManager.AudioDevice audioDevice;
                p.h(context, "context");
                p.h(intent, "intent");
                int intExtra = intent.getIntExtra("state", this.STATE_UNPLUGGED);
                int i10 = this.STATE_PLUGGED;
                boolean z10 = intExtra == i10;
                if (intExtra == this.STATE_UNPLUGGED) {
                    RTCAudioManager.this.updateAudioDeviceState(z10);
                } else if (intExtra == i10) {
                    audioDevice = RTCAudioManager.this.selectedAudioDevice;
                    if (audioDevice != RTCAudioManager.AudioDevice.WIRED_HEADSET) {
                        RTCAudioManager.this.updateAudioDeviceState(z10);
                    }
                } else {
                    Log.e("RTCAudioManager", "Invalid state");
                }
            }
        };
        this.wiredHeadsetReceiver = broadcastReceiver;
        this.apprtcContext.registerReceiver(broadcastReceiver, intentFilter);
    }

    private final void setAudioDevice(AudioDevice audioDevice) {
        Log.d(TAG, "setAudioDevice(device=" + audioDevice + ')');
        int i10 = audioDevice == null ? -1 : WhenMappings.$EnumSwitchMapping$0[audioDevice.ordinal()];
        if (i10 == 1) {
            setSpeakerphoneOn(true);
            this.selectedAudioDevice = AudioDevice.SPEAKER_PHONE;
        } else if (i10 == 2) {
            setSpeakerphoneOn(false);
            this.selectedAudioDevice = AudioDevice.EARPIECE;
        } else if (i10 != 3) {
            Log.e(TAG, "Invalid audio device selection");
        } else {
            setSpeakerphoneOn(false);
            this.selectedAudioDevice = AudioDevice.WIRED_HEADSET;
        }
        onAudioManagerChangedState();
    }

    private final void setMicrophoneMute(boolean z10) {
        if (this.audioManager.isMicrophoneMute() == z10) {
            return;
        }
        this.audioManager.setMicrophoneMute(z10);
    }

    private final void setSpeakerphoneOn(boolean z10) {
        if (this.audioManager.isSpeakerphoneOn() == z10) {
            return;
        }
        int mode = this.audioManager.getMode();
        this.audioManager.setMode(0);
        this.audioManager.setSpeakerphoneOn(true);
        this.audioManager.setSpeakerphoneOn(z10);
        this.audioManager.setMode(mode);
    }

    private final void unregisterForWiredHeadsetIntentBroadcast() {
        this.apprtcContext.unregisterReceiver(this.wiredHeadsetReceiver);
        this.wiredHeadsetReceiver = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAudioDeviceState(boolean z10) {
        this.audioDevices.clear();
        if (z10) {
            this.audioDevices.add(AudioDevice.WIRED_HEADSET);
        } else {
            this.audioDevices.add(AudioDevice.SPEAKER_PHONE);
            if (hasEarpiece()) {
                this.audioDevices.add(AudioDevice.EARPIECE);
            }
        }
        Log.d(TAG, "audioDevices: " + this.audioDevices);
        if (z10) {
            setAudioDevice(AudioDevice.WIRED_HEADSET);
        } else {
            setAudioDevice(this.defaultAudioDevice);
        }
    }

    public final void close() {
        Log.d(TAG, "close");
        if (this.initialized) {
            unregisterForWiredHeadsetIntentBroadcast();
            setSpeakerphoneOn(this.savedIsSpeakerPhoneOn);
            setMicrophoneMute(this.savedIsMicrophoneMute);
            Integer num = this.savedAudioMode;
            if (num != null) {
                this.audioManager.setMode(num.intValue());
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.audioFocusChangeListener;
            if (onAudioFocusChangeListener != null) {
                this.audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
            if (WebRtcAudioMediator.getInstance().isStarted()) {
                this.audioManager.setStreamVolume(0, this.savedIsVoiceVolume, 0);
            }
            this.initialized = false;
        }
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void init() {
        if (this.initialized) {
            return;
        }
        this.savedAudioMode = Integer.valueOf(this.audioManager.getMode());
        this.savedIsSpeakerPhoneOn = this.audioManager.isSpeakerphoneOn();
        this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
        this.savedIsMusicVolume = this.audioManager.getStreamVolume(3);
        this.audioFocusChangeListener = a.f26335a;
        if (getSharedApplicationModel().a().d()) {
            d dVar = d.f45388a;
            if (dVar.a() || dVar.e() || getSettingHelper().c()) {
                this.audioManager.setMode(0);
                setMicrophoneMute(false);
                updateAudioDeviceState(hasWiredHeadset());
                registerForWiredHeadsetIntentBroadcast();
                this.initialized = true;
            }
        }
        this.audioManager.setMode(3);
        setMicrophoneMute(false);
        updateAudioDeviceState(hasWiredHeadset());
        registerForWiredHeadsetIntentBroadcast();
        this.initialized = true;
    }
}
