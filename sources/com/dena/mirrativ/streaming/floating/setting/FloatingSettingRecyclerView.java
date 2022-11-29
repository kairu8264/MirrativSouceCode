package com.dena.mirrativ.streaming.floating.setting;

import ac.b2;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dena.mirrativ.streaming.floating.setting.FloatingSettingRecyclerView;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.widget.SettingButtonView;
import com.dena.mirrorman.widget.SettingSwitchView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import gc.c0;
import gc.f0;
import gc.g0;
import gc.k0;
import gc.n0;
import gc.z;
import io.p;
import java.util.List;
import jo.q;
import kf.t;
import kf.x;
import nd.u;
import oq.a;
import wn.v;
import xb.n;
import xb.o;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class FloatingSettingRecyclerView extends ConstraintLayout implements oq.a {
    public gc.e U;
    public final wn.f V;
    public final wn.f W;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f23677a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f23678b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f23679c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f23680d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f23681e0;

    /* renamed from: f0  reason: collision with root package name */
    public final wn.f f23682f0;

    /* renamed from: g0  reason: collision with root package name */
    public final b2 f23683g0;

    /* renamed from: h0  reason: collision with root package name */
    public final p<SettingSwitchView, Boolean, v> f23684h0;

    /* renamed from: i0  reason: collision with root package name */
    public final io.l<SettingButtonView, v> f23685i0;

    /* renamed from: j0  reason: collision with root package name */
    public final View.OnClickListener f23686j0;

    /* renamed from: k0  reason: collision with root package name */
    public List<gc.c> f23687k0;

    /* renamed from: l0  reason: collision with root package name */
    public ye.c f23688l0;

    /* loaded from: classes2.dex */
    public static final class a extends q implements p<SettingSwitchView, Boolean, v> {
        public a() {
            super(2);
        }

        public final void a(SettingSwitchView settingSwitchView, boolean z10) {
            jo.p.h(settingSwitchView, "view");
            int id2 = settingSwitchView.getId();
            int i10 = o.switch_mic;
            String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            if (id2 == i10) {
                dq.c.c().l(new nd.h(!z10));
                MRLogger logger = FloatingSettingRecyclerView.this.getLogger();
                MRLog.Companion companion = MRLog.Companion;
                MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_MIC);
                if (!z10) {
                    str = "0";
                }
                builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str)));
                logger.sendLog(builder.build());
            } else if (id2 == o.switch_screen) {
                FloatingSettingRecyclerView.this.getCastServiceActionCreator().U(!z10);
            } else if (id2 == o.switch_comment) {
                dq.c.c().l(new nd.k(z10));
                MRLogger logger2 = FloatingSettingRecyclerView.this.getLogger();
                MRLog.Companion companion2 = MRLog.Companion;
                MRLog.Builder builder2 = new MRLog.Builder(MRLog.ACTION_TYPE_SETTING_COMMENT);
                if (!z10) {
                    str = "0";
                }
                builder2.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, str)));
                logger2.sendLog(builder2.build());
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(SettingSwitchView settingSwitchView, Boolean bool) {
            a(settingSwitchView, bool.booleanValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.l<SettingButtonView, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Context f23691x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(1);
            this.f23691x = context;
        }

        public final void a(SettingButtonView settingButtonView) {
            jo.p.h(settingButtonView, "view");
            int id2 = settingButtonView.getId();
            if (id2 == o.btn_memo_broadcast) {
                FloatingSettingRecyclerView.this.getFloatViewManager().f(new f0(this.f23691x));
                FloatingSettingRecyclerView.I(FloatingSettingRecyclerView.this, "memo", null, 2, null);
            } else if (id2 == o.btn_collab) {
                if (FloatingSettingRecyclerView.this.getCollabStore().E()) {
                    fa.c floatViewManager = FloatingSettingRecyclerView.this.getFloatViewManager();
                    Context context = this.f23691x;
                    String string = FloatingSettingRecyclerView.this.getResources().getString(xb.r.text_collab_setting_disabled);
                    jo.p.g(string, "resources.getString(R.st…_collab_setting_disabled)");
                    floatViewManager.a(new fa.a(context, string, false));
                    return;
                }
                FloatingSettingRecyclerView.this.getFloatViewManager().f(new z(this.f23691x));
                FloatingSettingRecyclerView.I(FloatingSettingRecyclerView.this, "collab", null, 2, null);
            } else if (id2 == o.btn_tts) {
                FloatingSettingRecyclerView.this.getFloatViewManager().f(new k0(this.f23691x));
                FloatingSettingRecyclerView.I(FloatingSettingRecyclerView.this, "tts", null, 2, null);
            } else if (id2 == o.liveLinkButtonView) {
                if (FloatingSettingRecyclerView.this.getCollabStore().E()) {
                    fa.c floatViewManager2 = FloatingSettingRecyclerView.this.getFloatViewManager();
                    Context context2 = this.f23691x;
                    String string2 = FloatingSettingRecyclerView.this.getResources().getString(xb.r.text_collab_friend_link_disabled);
                    jo.p.g(string2, "resources.getString(R.st…lab_friend_link_disabled)");
                    floatViewManager2.a(new fa.a(context2, string2, false));
                    return;
                }
                dq.c.c().l(new u());
                if (!FloatingSettingRecyclerView.this.getTutorialPreference().p4()) {
                    FloatingSettingRecyclerView.this.getTutorialPreference().F1(true);
                    FloatingSettingRecyclerView.this.getFloatViewManager().f(new n0(this.f23691x));
                    FloatingSettingRecyclerView.I(FloatingSettingRecyclerView.this, "liveLink", null, 2, null);
                }
            } else if (id2 == o.btn_notification_guard) {
                if (Build.VERSION.SDK_INT >= 28) {
                    FloatingSettingRecyclerView.this.getFloatViewManager().f(new g0(this.f23691x));
                } else {
                    Object systemService = this.f23691x.getSystemService("notification");
                    jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    if (((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                        if (FloatingSettingRecyclerView.this.getSettingPreference().b0() == 1) {
                            FloatingSettingRecyclerView.this.getSettingPreference().I4(0);
                        } else {
                            FloatingSettingRecyclerView.this.getSettingPreference().I4(1);
                        }
                        dq.c.c().l(new nd.l());
                    } else {
                        dq.c.c().l(nd.f0.f41962a);
                    }
                }
            } else if (id2 == o.btn_gift_overlay) {
                FloatingSettingRecyclerView.this.getFloatViewManager().f(new c0(this.f23691x));
                FloatingSettingRecyclerView.I(FloatingSettingRecyclerView.this, "giftOverlay", null, 2, null);
            }
            dq.c.c().l(new nd.l());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(SettingButtonView settingButtonView) {
            a(settingButtonView);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.l<SettingButtonView, v> {
        public c() {
            super(1);
        }

        public final void a(SettingButtonView settingButtonView) {
            jo.p.h(settingButtonView, "it");
            FloatingSettingRecyclerView.this.f23685i0.invoke(settingButtonView);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(SettingButtonView settingButtonView) {
            a(settingButtonView);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements p<SettingSwitchView, Boolean, v> {
        public d() {
            super(2);
        }

        public final void a(SettingSwitchView settingSwitchView, boolean z10) {
            jo.p.h(settingSwitchView, "view");
            FloatingSettingRecyclerView.this.f23684h0.invoke(settingSwitchView, Boolean.valueOf(z10));
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(SettingSwitchView settingSwitchView, Boolean bool) {
            a(settingSwitchView, bool.booleanValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.l<View, v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            FloatingSettingRecyclerView.this.f23686j0.onClick(view);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23695w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23696x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23697y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23695w = aVar;
            this.f23696x = aVar2;
            this.f23697y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            xq.a b10;
            oq.a aVar = this.f23695w;
            vq.a aVar2 = this.f23696x;
            io.a<? extends uq.a> aVar3 = this.f23697y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(od.b.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23698w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23699x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23700y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23698w = aVar;
            this.f23699x = aVar2;
            this.f23700y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            xq.a b10;
            oq.a aVar = this.f23698w;
            vq.a aVar2 = this.f23699x;
            io.a<? extends uq.a> aVar3 = this.f23700y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(nf.h.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23701w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23702x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23703y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23701w = aVar;
            this.f23702x = aVar2;
            this.f23703y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            xq.a b10;
            oq.a aVar = this.f23701w;
            vq.a aVar2 = this.f23702x;
            io.a<? extends uq.a> aVar3 = this.f23703y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(hf.r.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23704w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23705x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23706y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23704w = aVar;
            this.f23705x = aVar2;
            this.f23706y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            xq.a b10;
            oq.a aVar = this.f23704w;
            vq.a aVar2 = this.f23705x;
            io.a<? extends uq.a> aVar3 = this.f23706y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(MRLogger.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23707w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23708x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23709y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23707w = aVar;
            this.f23708x = aVar2;
            this.f23709y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final t invoke() {
            xq.a b10;
            oq.a aVar = this.f23707w;
            vq.a aVar2 = this.f23708x;
            io.a<? extends uq.a> aVar3 = this.f23709y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(t.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<kf.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23710w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23711x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23712y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23710w = aVar;
            this.f23711x = aVar2;
            this.f23712y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.v, java.lang.Object] */
        @Override // io.a
        public final kf.v invoke() {
            xq.a b10;
            oq.a aVar = this.f23710w;
            vq.a aVar2 = this.f23711x;
            io.a<? extends uq.a> aVar3 = this.f23712y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(kf.v.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23713w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23714x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23715y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23713w = aVar;
            this.f23714x = aVar2;
            this.f23715y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            xq.a b10;
            oq.a aVar = this.f23713w;
            vq.a aVar2 = this.f23714x;
            io.a<? extends uq.a> aVar3 = this.f23715y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(x.class), aVar2, aVar3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<fa.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f23716w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f23717x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f23718y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f23716w = aVar;
            this.f23717x = aVar2;
            this.f23718y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, fa.c] */
        @Override // io.a
        public final fa.c invoke() {
            xq.a b10;
            oq.a aVar = this.f23716w;
            vq.a aVar2 = this.f23717x;
            io.a<? extends uq.a> aVar3 = this.f23718y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(jo.f0.b(fa.c.class), aVar2, aVar3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingSettingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ FloatingSettingRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, jo.h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void G(FloatingSettingRecyclerView floatingSettingRecyclerView, View view) {
        jo.p.h(floatingSettingRecyclerView, "this$0");
        dq.c.c().l(new nd.q());
        dq.c.c().l(new nd.t());
        I(floatingSettingRecyclerView, "thumbnail", null, 2, null);
    }

    public static /* synthetic */ void I(FloatingSettingRecyclerView floatingSettingRecyclerView, String str, Boolean bool, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bool = null;
        }
        floatingSettingRecyclerView.H(str, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final od.b getCastServiceActionCreator() {
        return (od.b) this.V.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nf.h getCollabStore() {
        return (nf.h) this.W.getValue();
    }

    private final hf.r getFeatureHelper() {
        return (hf.r) this.f23677a0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fa.c getFloatViewManager() {
        return (fa.c) this.f23682f0.getValue();
    }

    private final List<gc.c> getFloatingSettingData() {
        gc.c[] cVarArr = new gc.c[10];
        gc.a aVar = gc.a.SWITCH;
        cVarArr[0] = new gc.c(aVar, o.switch_comment, n.btn_setting_comment, xb.r.text_show_comments);
        cVarArr[1] = new gc.c(aVar, o.switch_mic, n.btn_setting_mic, xb.r.text_float_setting_mic_v2);
        cVarArr[2] = new gc.c(gc.a.THUMBNAIL, o.btn_thumbnail, xb.q.ic_thumbnail, xb.r.text_float_setting_thumbnail_v2);
        gc.a aVar2 = gc.a.BUTTON;
        cVarArr[3] = new gc.c(aVar2, o.btn_memo_broadcast, n.btn_setting_memo_broadcast, xb.r.text_float_setting_live_memo_v2);
        cVarArr[4] = new gc.c(aVar2, o.btn_collab, n.btn_setting_collab, xb.r.text_float_setting_collabo_v2);
        cVarArr[5] = new gc.c(aVar2, o.liveLinkButtonView, n.btn_setting_live_link, xb.r.text_float_setting_live_link_v2);
        cVarArr[6] = new gc.c(aVar2, o.btn_tts, n.btn_setting_text_to_speech, xb.r.text_float_setting_speech_v2);
        cVarArr[7] = new gc.c(aVar, o.switch_screen, n.btn_setting_screen, xb.r.text_float_setting_screen_share_v2);
        cVarArr[8] = new gc.c(aVar2, o.btn_notification_guard, n.btn_setting_hide_notification, Build.VERSION.SDK_INT < 28 ? xb.r.text_label_notification_stop_broadcast : xb.r.text_label_notification_silent);
        cVarArr[9] = new gc.c(aVar2, o.btn_gift_overlay, n.btn_setting_gift_overlay, xb.r.text_float_setting_gift_overlay_v2);
        return s.p(cVarArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MRLogger getLogger() {
        return (MRLogger) this.f23678b0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t getSettingPreference() {
        return (t) this.f23679c0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kf.v getTutorialPreference() {
        return (kf.v) this.f23680d0.getValue();
    }

    private final x getUserPreference() {
        return (x) this.f23681e0.getValue();
    }

    public final void H(String str, Boolean bool) {
        MRLogger logger = getLogger();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_BROADCAST_SETTING_TAP);
        builder.setTargetId(str);
        if (bool != null) {
            builder.setPayload(s.p(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, bool.booleanValue() ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0")));
        }
        logger.sendLog(builder.build());
    }

    public final void J() {
        this.f23687k0 = getFloatingSettingData();
        Context context = getContext();
        jo.p.g(context, "context");
        gc.e eVar = new gc.e(context, this.f23687k0, new c(), new d(), new e());
        eVar.h(this.f23688l0);
        eVar.g(getUserPreference().H3());
        this.U = eVar;
        this.f23683g0.B.setAdapter(eVar);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final ye.c getRecordRequestParams() {
        return this.f23688l0;
    }

    @dq.l
    public final void onEvent(nd.i iVar) {
        jo.p.h(iVar, "events");
        dq.c.c().r(this);
    }

    public final void setRecordRequestParams(ye.c cVar) {
        this.f23688l0 = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingSettingRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        cr.a aVar = cr.a.f28611a;
        this.V = wn.g.b(aVar.b(), new f(this, null, null));
        this.W = wn.g.b(aVar.b(), new g(this, null, null));
        this.f23677a0 = wn.g.b(aVar.b(), new h(this, null, null));
        this.f23678b0 = wn.g.b(aVar.b(), new i(this, null, null));
        this.f23679c0 = wn.g.b(aVar.b(), new j(this, null, null));
        this.f23680d0 = wn.g.b(aVar.b(), new k(this, null, null));
        this.f23681e0 = wn.g.b(aVar.b(), new l(this, null, null));
        this.f23682f0 = wn.g.b(aVar.b(), new m(this, null, null));
        b2 T = b2.T(LayoutInflater.from(context), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f23683g0 = T;
        this.f23684h0 = new a();
        this.f23685i0 = new b(context);
        this.f23686j0 = new View.OnClickListener() { // from class: gc.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FloatingSettingRecyclerView.G(FloatingSettingRecyclerView.this, view);
            }
        };
        this.f23687k0 = s.k();
        dq.c.c().p(this);
    }
}
