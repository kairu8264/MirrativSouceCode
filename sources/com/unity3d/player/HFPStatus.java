package com.unity3d.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;

/* loaded from: classes4.dex */
public class HFPStatus {

    /* renamed from: a  reason: collision with root package name */
    private Context f28334a;

    /* renamed from: e  reason: collision with root package name */
    private AudioManager f28338e;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f28335b = null;

    /* renamed from: c  reason: collision with root package name */
    private Intent f28336c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28337d = false;

    /* renamed from: f  reason: collision with root package name */
    private int f28339f = a.f28341a;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f28341a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f28342b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f28343c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ int[] f28344d = {1, 2, 3};
    }

    public HFPStatus(Context context) {
        this.f28338e = null;
        this.f28334a = context;
        this.f28338e = (AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    public final void a() {
        deinitHFPStatusJni();
    }

    public boolean getHFPStat() {
        return this.f28339f == a.f28342b;
    }

    public void requestHFPStat() {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                if (intExtra == 0) {
                    if (HFPStatus.this.f28337d) {
                        HFPStatus.this.f28338e.setMode(0);
                    }
                    HFPStatus.this.f28337d = false;
                } else if (intExtra == 1) {
                    HFPStatus.this.f28339f = a.f28342b;
                    if (HFPStatus.this.f28337d) {
                        HFPStatus.this.f28338e.setMode(3);
                    } else {
                        HFPStatus.this.f28338e.stopBluetoothSco();
                    }
                } else if (intExtra != 2) {
                } else {
                    if (HFPStatus.this.f28339f == a.f28342b) {
                        HFPStatus.this.f28337d = true;
                        return;
                    }
                    HFPStatus.this.f28339f = a.f28343c;
                }
            }
        };
        this.f28335b = broadcastReceiver;
        this.f28336c = this.f28334a.registerReceiver(broadcastReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.f28338e.startBluetoothSco();
        } catch (NullPointerException unused) {
            d.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }
}
