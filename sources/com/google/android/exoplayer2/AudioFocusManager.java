package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AudioFocusManager {
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 1;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 3;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 0;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    private AudioAttributes audioAttributes;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private int focusGain;
    private final AudioFocusListener focusListener;
    private PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    /* loaded from: classes3.dex */
    public class AudioFocusListener implements AudioManager.OnAudioFocusChangeListener {
        private final Handler eventHandler;

        public AudioFocusListener(Handler handler) {
            this.eventHandler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioFocusChange$0(int i10) {
            AudioFocusManager.this.handlePlatformAudioFocusChange(i10);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i10) {
            this.eventHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.a
                @Override // java.lang.Runnable
                public final void run() {
                    AudioFocusManager.AudioFocusListener.this.lambda$onAudioFocusChange$0(i10);
                }
            });
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface PlayerCommand {
    }

    /* loaded from: classes3.dex */
    public interface PlayerControl {
        void executePlayerCommand(int i10);

        void setVolumeMultiplier(float f10);
    }

    public AudioFocusManager(Context context, Handler handler, PlayerControl playerControl) {
        this.audioManager = (AudioManager) Assertions.checkNotNull((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.playerControl = playerControl;
        this.focusListener = new AudioFocusListener(handler);
    }

    private void abandonAudioFocus() {
        if (this.audioFocusState == 0) {
            return;
        }
        if (Util.SDK_INT >= 26) {
            abandonAudioFocusV26();
        } else {
            abandonAudioFocusDefault();
        }
        setAudioFocusState(0);
    }

    private void abandonAudioFocusDefault() {
        this.audioManager.abandonAudioFocus(this.focusListener);
    }

    private void abandonAudioFocusV26() {
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int convertAudioAttributesToFocusGain(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                Log.w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                Log.w(TAG, "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                return Util.SDK_INT >= 19 ? 4 : 2;
        }
        return 3;
    }

    private void executePlayerCommand(int i10) {
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !willPauseWhenDucked()) {
                setAudioFocusState(3);
                return;
            }
            executePlayerCommand(0);
            setAudioFocusState(2);
        } else if (i10 == -1) {
            executePlayerCommand(-1);
            abandonAudioFocus();
        } else if (i10 != 1) {
            Log.w(TAG, "Unknown focus change type: " + i10);
        } else {
            setAudioFocusState(1);
            executePlayerCommand(1);
        }
    }

    private int requestAudioFocus() {
        if (this.audioFocusState == 1) {
            return 1;
        }
        if ((Util.SDK_INT >= 26 ? requestAudioFocusV26() : requestAudioFocusDefault()) == 1) {
            setAudioFocusState(1);
            return 1;
        }
        setAudioFocusState(0);
        return -1;
    }

    private int requestAudioFocusDefault() {
        return this.audioManager.requestAudioFocus(this.focusListener, Util.getStreamTypeForAudioUsage(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).usage), this.focusGain);
    }

    private int requestAudioFocusV26() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || this.rebuildAudioFocusRequest) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.focusGain);
            } else {
                builder = new AudioFocusRequest.Builder(this.audioFocusRequest);
            }
            this.audioFocusRequest = builder.setAudioAttributes(((AudioAttributes) Assertions.checkNotNull(this.audioAttributes)).getAudioAttributesV21()).setWillPauseWhenDucked(willPauseWhenDucked()).setOnAudioFocusChangeListener(this.focusListener).build();
            this.rebuildAudioFocusRequest = false;
        }
        return this.audioManager.requestAudioFocus(this.audioFocusRequest);
    }

    private void setAudioFocusState(int i10) {
        if (this.audioFocusState == i10) {
            return;
        }
        this.audioFocusState = i10;
        float f10 = i10 == 3 ? VOLUME_MULTIPLIER_DUCK : 1.0f;
        if (this.volumeMultiplier == f10) {
            return;
        }
        this.volumeMultiplier = f10;
        PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f10);
        }
    }

    private boolean shouldAbandonAudioFocus(int i10) {
        return i10 == 1 || this.focusGain != 1;
    }

    private boolean willPauseWhenDucked() {
        AudioAttributes audioAttributes = this.audioAttributes;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    public AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocus();
    }

    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (Util.areEqual(this.audioAttributes, audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        int convertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes);
        this.focusGain = convertAudioAttributesToFocusGain;
        boolean z10 = true;
        if (convertAudioAttributesToFocusGain != 1 && convertAudioAttributesToFocusGain != 0) {
            z10 = false;
        }
        Assertions.checkArgument(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int updateAudioFocus(boolean z10, int i10) {
        if (shouldAbandonAudioFocus(i10)) {
            abandonAudioFocus();
            return z10 ? 1 : -1;
        } else if (z10) {
            return requestAudioFocus();
        } else {
            return -1;
        }
    }
}
