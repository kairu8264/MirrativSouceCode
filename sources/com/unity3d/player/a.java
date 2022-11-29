package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f28453a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f28454b;

    /* renamed from: c  reason: collision with root package name */
    private C0259a f28455c;

    /* renamed from: com.unity3d.player.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0259a extends ContentObserver {

        /* renamed from: b  reason: collision with root package name */
        private final b f28457b;

        /* renamed from: c  reason: collision with root package name */
        private final AudioManager f28458c;

        /* renamed from: d  reason: collision with root package name */
        private final int f28459d;

        /* renamed from: e  reason: collision with root package name */
        private int f28460e;

        public C0259a(Handler handler, AudioManager audioManager, int i10, b bVar) {
            super(handler);
            this.f28458c = audioManager;
            this.f28459d = 3;
            this.f28457b = bVar;
            this.f28460e = audioManager.getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10, Uri uri) {
            int streamVolume;
            AudioManager audioManager = this.f28458c;
            if (audioManager == null || this.f28457b == null || (streamVolume = audioManager.getStreamVolume(this.f28459d)) == this.f28460e) {
                return;
            }
            this.f28460e = streamVolume;
            this.f28457b.onAudioVolumeChanged(streamVolume);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        void onAudioVolumeChanged(int i10);
    }

    public a(Context context) {
        this.f28453a = context;
        this.f28454b = (AudioManager) context.getSystemService("audio");
    }

    public final void a() {
        if (this.f28455c != null) {
            this.f28453a.getContentResolver().unregisterContentObserver(this.f28455c);
            this.f28455c = null;
        }
    }

    public final void a(b bVar) {
        this.f28455c = new C0259a(new Handler(), this.f28454b, 3, bVar);
        this.f28453a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f28455c);
    }
}
