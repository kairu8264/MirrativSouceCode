package com.dena.mirrativ.user.mypage.chat;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Editable;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.user.mypage.chat.ChatPageActivity;
import com.dena.mirrativ.user.userprofile.UserProfileActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Chat;
import com.dena.mirrorman.net.api.response.ChatThreadMessages;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import com.dena.mirrorman.net.bcsvr.BcsvrAddress;
import com.dena.mirrorman.net.bcsvr.BcsvrChannel;
import com.dena.mirrorman.net.bcsvr.response.ChatMessageRead;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import ge.e;
import ge.j;
import ge.k;
import hf.v0;
import ie.i;
import ie.j;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import uo.q0;
import uo.r0;
import yd.g1;

/* loaded from: classes2.dex */
public final class ChatPageActivity extends e.b implements ge.i, ie.j, q0 {
    public static final a A0 = new a(null);
    public static final int B0 = 8;
    public ae.e P;
    public String Q;
    public ge.j R;
    public boolean T;
    public LinearLayoutManager U;
    public ge.k V;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f24502a0;

    /* renamed from: b0  reason: collision with root package name */
    public Cipher f24503b0;

    /* renamed from: c0  reason: collision with root package name */
    public BcsvrAddress f24504c0;

    /* renamed from: d0  reason: collision with root package name */
    public SecretKeySpec f24505d0;

    /* renamed from: e0  reason: collision with root package name */
    public BcsvrChannel.OnMessageReceivedListener f24506e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f24507f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f24508g0;

    /* renamed from: h0  reason: collision with root package name */
    public Long f24509h0;

    /* renamed from: i0  reason: collision with root package name */
    public Long f24510i0;

    /* renamed from: j0  reason: collision with root package name */
    public HandlerThread f24511j0;

    /* renamed from: k0  reason: collision with root package name */
    public Handler f24512k0;

    /* renamed from: l0  reason: collision with root package name */
    public Runnable f24513l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f24514m0;

    /* renamed from: n0  reason: collision with root package name */
    public Runnable f24515n0;

    /* renamed from: p0  reason: collision with root package name */
    public final wn.f f24517p0;

    /* renamed from: q0  reason: collision with root package name */
    public final wn.f f24518q0;

    /* renamed from: r0  reason: collision with root package name */
    public final wn.f f24519r0;

    /* renamed from: s0  reason: collision with root package name */
    public final wn.f f24520s0;

    /* renamed from: t0  reason: collision with root package name */
    public final wn.f f24521t0;

    /* renamed from: u0  reason: collision with root package name */
    public final wn.f f24522u0;

    /* renamed from: v0  reason: collision with root package name */
    public final wn.f f24523v0;

    /* renamed from: w0  reason: collision with root package name */
    public final wn.f f24524w0;

    /* renamed from: x0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f24525x0;

    /* renamed from: y0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f24526y0;

    /* renamed from: z0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f24527z0;
    public final /* synthetic */ q0 O = r0.b();
    public String S = Referer.Chat.THREAD;
    public int W = -1;
    public int X = -1;

    /* renamed from: o0  reason: collision with root package name */
    public final FragmentRunner f24516o0 = new FragmentRunner(this);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, ge.j jVar) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, ChatPageActivity.class);
            intent.putExtra("EXTRA_DEEPLINK_HASH", str);
            intent.putExtra("EXTRA_THREAD", jVar);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a0 extends jo.q implements io.l<Chat.Message, wn.v> {
        public a0() {
            super(1);
        }

        public final void a(Chat.Message message) {
            jo.p.h(message, "message");
            if (ChatPageActivity.this.g().b() != o.c.RESUMED) {
                return;
            }
            ge.h.R0.a(String.valueOf(message.getId()), message.getText().getBody()).z3(ChatPageActivity.this.a3(), "ChatMessageBottomSheetDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Chat.Message message) {
            a(message);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements BcsvrChannel.OnMessageReceivedListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ xm.e f24530b;

        public b(xm.e eVar) {
            this.f24530b = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: JSONException -> 0x0088, TryCatch #0 {JSONException -> 0x0088, blocks: (B:3:0x0005, B:6:0x000e, B:13:0x0026, B:14:0x0048, B:15:0x004e, B:17:0x0061, B:23:0x006d, B:24:0x0073), top: B:29:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: JSONException -> 0x0088, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0088, blocks: (B:3:0x0005, B:6:0x000e, B:13:0x0026, B:14:0x0048, B:15:0x004e, B:17:0x0061, B:23:0x006d, B:24:0x0073), top: B:29:0x0005 }] */
        @Override // com.dena.mirrorman.net.bcsvr.BcsvrChannel.OnMessageReceivedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMessageReceived(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r0 = "json"
                jo.p.h(r4, r0)
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity r0 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.this     // Catch: org.json.JSONException -> L88
                boolean r0 = r0.isFinishing()     // Catch: org.json.JSONException -> L88
                if (r0 == 0) goto Le
                return
            Le:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L88
                r0.<init>(r4)     // Catch: org.json.JSONException -> L88
                java.lang.String r1 = "t"
                int r1 = r0.getInt(r1)     // Catch: org.json.JSONException -> L88
                r2 = 18
                if (r1 == r2) goto L4e
                r0 = 20
                if (r1 == r0) goto L48
                r0 = 46
                if (r1 == r0) goto L26
                goto L8f
            L26:
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity r0 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.this     // Catch: org.json.JSONException -> L88
                xm.f r1 = new xm.f     // Catch: org.json.JSONException -> L88
                r1.<init>()     // Catch: org.json.JSONException -> L88
                xm.c r2 = xm.c.LOWER_CASE_WITH_UNDERSCORES     // Catch: org.json.JSONException -> L88
                xm.f r1 = r1.e(r2)     // Catch: org.json.JSONException -> L88
                xm.e r1 = r1.b()     // Catch: org.json.JSONException -> L88
                java.lang.Class<com.dena.mirrorman.net.bcsvr.response.ChatMessageRead> r2 = com.dena.mirrorman.net.bcsvr.response.ChatMessageRead.class
                java.lang.Object r4 = r1.i(r4, r2)     // Catch: org.json.JSONException -> L88
                java.lang.String r1 = "GsonBuilder()\n          …tMessageRead::class.java)"
                jo.p.g(r4, r1)     // Catch: org.json.JSONException -> L88
                com.dena.mirrorman.net.bcsvr.response.ChatMessageRead r4 = (com.dena.mirrorman.net.bcsvr.response.ChatMessageRead) r4     // Catch: org.json.JSONException -> L88
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity.U4(r0, r4)     // Catch: org.json.JSONException -> L88
                goto L8f
            L48:
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity r4 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.this     // Catch: org.json.JSONException -> L88
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity.r4(r4)     // Catch: org.json.JSONException -> L88
                goto L8f
            L4e:
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity r4 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.this     // Catch: org.json.JSONException -> L88
                java.lang.String r1 = "message"
                java.lang.String r0 = r0.getString(r1)     // Catch: org.json.JSONException -> L88
                java.lang.String r1 = "jsonObj.getString(\"message\")"
                jo.p.g(r0, r1)     // Catch: org.json.JSONException -> L88
                java.lang.String r4 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.Y3(r4, r0)     // Catch: org.json.JSONException -> L88
                if (r4 == 0) goto L6a
                int r0 = r4.length()     // Catch: org.json.JSONException -> L88
                if (r0 != 0) goto L68
                goto L6a
            L68:
                r0 = 0
                goto L6b
            L6a:
                r0 = 1
            L6b:
                if (r0 == 0) goto L73
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity r4 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.this     // Catch: org.json.JSONException -> L88
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity.r4(r4)     // Catch: org.json.JSONException -> L88
                goto L8f
            L73:
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity r0 = com.dena.mirrativ.user.mypage.chat.ChatPageActivity.this     // Catch: org.json.JSONException -> L88
                xm.e r1 = r3.f24530b     // Catch: org.json.JSONException -> L88
                java.lang.Class<com.dena.mirrorman.net.api.response.Chat$Message> r2 = com.dena.mirrorman.net.api.response.Chat.Message.class
                java.lang.Object r4 = r1.i(r4, r2)     // Catch: org.json.JSONException -> L88
                java.lang.String r1 = "gson.fromJson(decodedMes…Chat.Message::class.java)"
                jo.p.g(r4, r1)     // Catch: org.json.JSONException -> L88
                com.dena.mirrorman.net.api.response.Chat$Message r4 = (com.dena.mirrorman.net.api.response.Chat.Message) r4     // Catch: org.json.JSONException -> L88
                com.dena.mirrativ.user.mypage.chat.ChatPageActivity.T3(r0, r4)     // Catch: org.json.JSONException -> L88
                goto L8f
            L88:
                r4 = move-exception
                r4.printStackTrace()
                g9.a.c(r4)
            L8f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.chat.ChatPageActivity.b.onMessageReceived(java.lang.String):void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b0 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: w  reason: collision with root package name */
        public boolean f24531w;

        /* renamed from: x  reason: collision with root package name */
        public final Rect f24532x = new Rect();

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f24533y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ChatPageActivity f24534z;

        public b0(View view, ChatPageActivity chatPageActivity) {
            this.f24533y = view;
            this.f24534z = chatPageActivity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f24533y.getWindowVisibleDisplayFrame(this.f24532x);
            boolean z10 = this.f24533y.getMeasuredHeight() - this.f24532x.height() > 100;
            if (z10 == this.f24531w) {
                return;
            }
            this.f24531w = z10;
            if (z10 && this.f24534z.X == 0) {
                this.f24534z.Z5();
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$fetchGroupUsers$1", f = "ChatPageActivity.kt", l = {860}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24535w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            UsersResponse usersResponse;
            Object c10 = bo.c.c();
            int i10 = this.f24535w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest p52 = ChatPageActivity.this.p5();
                    String o52 = ChatPageActivity.this.o5();
                    ge.j jVar = ChatPageActivity.this.R;
                    jo.p.e(jVar);
                    String f10 = jVar.f();
                    this.f24535w = 1;
                    obj = p52.getGroupUsers(o52, f10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                usersResponse = (UsersResponse) obj;
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ChatPageActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ChatPageActivity chatPageActivity = ChatPageActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ChatPageActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(chatPageActivity, message, false);
                }
            }
            if (ChatPageActivity.this.R == null) {
                return wn.v.f59242a;
            }
            ArrayList arrayList = new ArrayList();
            List<UserBasicWithGraphParams> users = usersResponse.getUsers();
            ArrayList arrayList2 = new ArrayList(xn.t.u(users, 10));
            for (UserBasicWithGraphParams userBasicWithGraphParams : users) {
                arrayList2.add(userBasicWithGraphParams.getUserId());
            }
            arrayList.addAll(arrayList2);
            ChatPageActivity chatPageActivity2 = ChatPageActivity.this;
            ge.j jVar2 = chatPageActivity2.R;
            jo.p.e(jVar2);
            chatPageActivity2.R = jVar2.q(arrayList);
            ChatPageActivity.this.v6();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c0 extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24537w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24538x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24539y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24537w = componentCallbacks;
            this.f24538x = aVar;
            this.f24539y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f24537w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRRequest.class), this.f24538x, this.f24539y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.Q5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d0 extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24541w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24542x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24543y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24541w = componentCallbacks;
            this.f24542x = aVar;
            this.f24543y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f24541w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(i1.class), this.f24542x, this.f24543y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.N5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e0 extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24545w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24546x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24547y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24545w = componentCallbacks;
            this.f24546x = aVar;
            this.f24547y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24545w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(v0.class), this.f24546x, this.f24547y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.H5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f0 extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24549w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24550x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24549w = componentCallbacks;
            this.f24550x = aVar;
            this.f24551y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f24549w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f24550x, this.f24551y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.G5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g0 extends jo.q implements io.a<hf.r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24553w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24554x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24555y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24553w = componentCallbacks;
            this.f24554x = aVar;
            this.f24555y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final hf.r invoke() {
            ComponentCallbacks componentCallbacks = this.f24553w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.r.class), this.f24554x, this.f24555y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends RecyclerView.u {
        public h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            jo.p.h(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            ChatPageActivity chatPageActivity = ChatPageActivity.this;
            chatPageActivity.X = chatPageActivity.W;
            ChatPageActivity chatPageActivity2 = ChatPageActivity.this;
            LinearLayoutManager linearLayoutManager = chatPageActivity2.U;
            if (linearLayoutManager == null) {
                jo.p.v("timelineLayoutManager");
                linearLayoutManager = null;
            }
            chatPageActivity2.W = linearLayoutManager.i2();
            if (ChatPageActivity.this.B5()) {
                ae.e eVar = ChatPageActivity.this.P;
                if (eVar == null) {
                    jo.p.v("binding");
                    eVar = null;
                }
                eVar.E.setVisibility(8);
            }
            if (ChatPageActivity.this.Z) {
                return;
            }
            LinearLayoutManager linearLayoutManager2 = ChatPageActivity.this.U;
            if (linearLayoutManager2 == null) {
                jo.p.v("timelineLayoutManager");
                linearLayoutManager2 = null;
            }
            int l22 = linearLayoutManager2.l2();
            ge.k kVar = ChatPageActivity.this.V;
            if (kVar == null) {
                jo.p.v("timelineAdapter");
                kVar = null;
            }
            if (l22 >= kVar.getItemCount() - 1) {
                ge.k kVar2 = ChatPageActivity.this.V;
                if (kVar2 == null) {
                    jo.p.v("timelineAdapter");
                    kVar2 = null;
                }
                if (!kVar2.k() || ChatPageActivity.this.f24510i0 == null) {
                    return;
                }
                ChatPageActivity chatPageActivity3 = ChatPageActivity.this;
                chatPageActivity3.Z4(null, chatPageActivity3.f24510i0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class h0 extends jo.q implements io.a<hf.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24557w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24558x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24559y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24557w = componentCallbacks;
            this.f24558x = aVar;
            this.f24559y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.e, java.lang.Object] */
        @Override // io.a
        public final hf.e invoke() {
            ComponentCallbacks componentCallbacks = this.f24557w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(hf.e.class), this.f24558x, this.f24559y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.I5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i0 extends jo.q implements io.a<tc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24561w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24562x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24563y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24561w = componentCallbacks;
            this.f24562x = aVar;
            this.f24563y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tc.a, java.lang.Object] */
        @Override // io.a
        public final tc.a invoke() {
            ComponentCallbacks componentCallbacks = this.f24561w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(tc.a.class), this.f24562x, this.f24563y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {
        public j() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.P5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j0 extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24565w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ComponentActivity componentActivity) {
            super(0);
            this.f24565w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f24565w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.l<View, wn.v> {
        public k() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.S5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class k0 extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f24567w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24568x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24569y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24570z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f24567w = aVar;
            this.f24568x = aVar2;
            this.f24569y = aVar3;
            this.f24570z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f24567w;
            vq.a aVar2 = this.f24568x;
            io.a aVar3 = this.f24569y;
            xq.a aVar4 = this.f24570z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(tc.c0.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.l<View, wn.v> {
        public l() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.M5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l0 extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24572w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ComponentActivity componentActivity) {
            super(0);
            this.f24572w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24572w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends jo.q implements io.l<View, wn.v> {
        public m() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.J5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$threadVisibility$1", f = "ChatPageActivity.kt", l = {1037}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m0 extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24574w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f24576y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(int i10, ao.d<? super m0> dVar) {
            super(2, dVar);
            this.f24576y = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m0(this.f24576y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24574w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest p52 = ChatPageActivity.this.p5();
                        String o52 = ChatPageActivity.this.o5();
                        ge.j jVar = ChatPageActivity.this.R;
                        jo.p.e(jVar);
                        String m10 = jVar.m();
                        ge.j jVar2 = ChatPageActivity.this.R;
                        jo.p.e(jVar2);
                        String f10 = jVar2.f();
                        int i11 = this.f24576y;
                        this.f24574w = 1;
                        obj = p52.postChatThreadVisibility(o52, m10, f10, i11, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    StatusResponse statusResponse = (StatusResponse) obj;
                    ChatPageActivity chatPageActivity = ChatPageActivity.this;
                    ge.j jVar3 = chatPageActivity.R;
                    jo.p.e(jVar3);
                    chatPageActivity.R = jVar3.s(this.f24576y);
                    ChatPageActivity.this.p6(false);
                    ChatPageActivity.this.t6();
                } catch (Exception e10) {
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (!(error instanceof MRError.ForceUpdate)) {
                        z10 = jo.p.c(error, MRError.Maintenance.INSTANCE);
                    }
                    if (z10) {
                        of.n.f45411a.l(ChatPageActivity.this, error);
                    } else {
                        of.n nVar = of.n.f45411a;
                        ChatPageActivity chatPageActivity2 = ChatPageActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = ChatPageActivity.this.getString(nc.i.f41875e);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(chatPageActivity2, message, false);
                    }
                    of.n.z(ChatPageActivity.this);
                }
                return wn.v.f59242a;
            } finally {
                ChatPageActivity.this.h5();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.l<View, wn.v> {
        public n() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            ChatPageActivity.this.K5();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$togglePushSetting$1", f = "ChatPageActivity.kt", l = {958}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n0 extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24578w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ boolean f24580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(boolean z10, ao.d<? super n0> dVar) {
            super(2, dVar);
            this.f24580y = z10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new n0(this.f24580y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((n0) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24578w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest p52 = ChatPageActivity.this.p5();
                    String o52 = ChatPageActivity.this.o5();
                    ge.j jVar = ChatPageActivity.this.R;
                    jo.p.e(jVar);
                    String m10 = jVar.m();
                    ge.j jVar2 = ChatPageActivity.this.R;
                    jo.p.e(jVar2);
                    String f10 = jVar2.f();
                    ge.j jVar3 = ChatPageActivity.this.R;
                    jo.p.e(jVar3);
                    int i11 = jVar3.k() ? 1 : 0;
                    this.f24578w = 1;
                    obj = p52.postChatPushSettings(o52, m10, f10, i11, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
            } catch (Exception e10) {
                ChatPageActivity chatPageActivity = ChatPageActivity.this;
                ge.j jVar4 = chatPageActivity.R;
                jo.p.e(jVar4);
                chatPageActivity.R = jVar4.r(this.f24580y);
                ChatPageActivity.this.t6();
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ChatPageActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ChatPageActivity chatPageActivity2 = ChatPageActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ChatPageActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(chatPageActivity2, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$join$1", f = "ChatPageActivity.kt", l = {692}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24581w;

        public o(ao.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new o(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((o) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24581w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest p52 = ChatPageActivity.this.p5();
                    String o52 = ChatPageActivity.this.o5();
                    ge.j jVar = ChatPageActivity.this.R;
                    jo.p.e(jVar);
                    String m10 = jVar.m();
                    ge.j jVar2 = ChatPageActivity.this.R;
                    jo.p.e(jVar2);
                    String f10 = jVar2.f();
                    this.f24581w = 1;
                    obj = p52.postChatJoin(o52, m10, f10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Chat.Join join = (Chat.Join) obj;
                ChatPageActivity.this.f24508g0 = true;
                if (join.isKickedBy().length() == 0) {
                    ChatPageActivity.this.f24504c0 = new BcsvrAddress(join.getBroadcastHost(), join.getBroadcastPort(), join.getBroadcastKey());
                    if (join.getBroadcastSecret().length() > 0) {
                        try {
                            ChatPageActivity chatPageActivity = ChatPageActivity.this;
                            String broadcastSecret = join.getBroadcastSecret();
                            Charset forName = Charset.forName(C.UTF8_NAME);
                            jo.p.g(forName, "forName(charsetName)");
                            byte[] bytes = broadcastSecret.getBytes(forName);
                            jo.p.g(bytes, "this as java.lang.String).getBytes(charset)");
                            chatPageActivity.f24505d0 = new SecretKeySpec(bytes, "AES");
                        } catch (UnsupportedEncodingException e10) {
                            e10.printStackTrace();
                            g9.a.c(e10);
                        }
                    }
                    ChatPageActivity.this.e5();
                    ge.k kVar = ChatPageActivity.this.V;
                    if (kVar == null) {
                        jo.p.v("timelineAdapter");
                        kVar = null;
                    }
                    kVar.s(join.getLastReadMessages());
                } else {
                    ChatPageActivity.this.U5(join.isKickedBy());
                }
            } catch (Exception e11) {
                MRError error = MRErrorKt.convertMRException(e11).getError();
                if (error instanceof MRError.ForceUpdate ? true : jo.p.c(error, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(ChatPageActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ChatPageActivity chatPageActivity2 = ChatPageActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ChatPageActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(chatPageActivity2, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$leave$1", f = "ChatPageActivity.kt", l = {1066}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24583w;

        public p(ao.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new p(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((p) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24583w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        ChatPageActivity.this.d5();
                        MRRequest p52 = ChatPageActivity.this.p5();
                        String o52 = ChatPageActivity.this.o5();
                        ge.j jVar = ChatPageActivity.this.R;
                        jo.p.e(jVar);
                        String f10 = jVar.f();
                        jo.p.e(f10);
                        this.f24583w = 1;
                        obj = p52.postGroupLeave(o52, f10, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    StatusResponse statusResponse = (StatusResponse) obj;
                    ChatPageActivity.this.d5();
                    Intent intent = new Intent();
                    intent.putExtra("KEY_RESULT_THREAD", ChatPageActivity.this.R);
                    intent.putExtra("KEY_RESULT_READ", ChatPageActivity.this.Y);
                    intent.putExtra("KEY_RESULT_LEFT", true);
                    intent.putExtra("KEY_RESULT_JOIN_THREAD", false);
                    intent.putExtra("KEY_RESULT_POST_THREAD", ChatPageActivity.this.f24507f0);
                    ChatPageActivity.this.setResult(-1, intent);
                    ChatPageActivity.this.finish();
                } catch (Exception e10) {
                    ChatPageActivity.this.e5();
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (!(error instanceof MRError.ForceUpdate)) {
                        z10 = jo.p.c(error, MRError.Maintenance.INSTANCE);
                    }
                    if (z10) {
                        of.n.f45411a.l(ChatPageActivity.this, error);
                    } else {
                        of.n nVar = of.n.f45411a;
                        ChatPageActivity chatPageActivity = ChatPageActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = ChatPageActivity.this.getString(nc.i.f41875e);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(chatPageActivity, message, false);
                    }
                }
                ChatPageActivity.this.h5();
                return wn.v.f59242a;
            } catch (Throwable th2) {
                ChatPageActivity.this.h5();
                throw th2;
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$notifyRead$1", f = "ChatPageActivity.kt", l = {933}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class q extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24585w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f24587y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j10, ao.d<? super q> dVar) {
            super(2, dVar);
            this.f24587y = j10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new q(this.f24587y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((q) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24585w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest p52 = ChatPageActivity.this.p5();
                    String o52 = ChatPageActivity.this.o5();
                    ge.j jVar = ChatPageActivity.this.R;
                    jo.p.e(jVar);
                    String m10 = jVar.m();
                    ge.j jVar2 = ChatPageActivity.this.R;
                    jo.p.e(jVar2);
                    String f10 = jVar2.f();
                    long j10 = this.f24587y;
                    this.f24585w = 1;
                    if (p52.postChatRead(o52, m10, f10, j10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ChatPageActivity.this.Y = true;
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.ForceUpdate ? true : jo.p.c(error, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(ChatPageActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ChatPageActivity chatPageActivity = ChatPageActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ChatPageActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(chatPageActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$onClickSend$1", f = "ChatPageActivity.kt", l = {448}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24588w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24590y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, ao.d<? super r> dVar) {
            super(2, dVar);
            this.f24590y = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new r(this.f24590y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((r) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24588w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest p52 = ChatPageActivity.this.p5();
                    String o52 = ChatPageActivity.this.o5();
                    ge.j jVar = ChatPageActivity.this.R;
                    jo.p.e(jVar);
                    String m10 = jVar.m();
                    ge.j jVar2 = ChatPageActivity.this.R;
                    jo.p.e(jVar2);
                    String f10 = jVar2.f();
                    String str = this.f24590y;
                    this.f24588w = 1;
                    if (p52.postChatText(o52, m10, f10, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ChatPageActivity.this.f24507f0 = true;
                hf.b.f35490a.b().a();
            } catch (Exception e10) {
                ChatPageActivity.this.g6(this.f24590y);
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ChatPageActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ChatPageActivity chatPageActivity = ChatPageActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ChatPageActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(chatPageActivity, message, false);
                    hf.b.f35490a.b().a();
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$onCreate$1", f = "ChatPageActivity.kt", l = {183}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24591w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<ChatThreadMessages> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ChatPageActivity f24593w;

            public a(ChatPageActivity chatPageActivity) {
                this.f24593w = chatPageActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ChatThreadMessages chatThreadMessages, ao.d<? super wn.v> dVar) {
                j.a aVar = ge.j.G;
                ae.e eVar = null;
                ge.j a10 = aVar.a(chatThreadMessages.getThread(), chatThreadMessages.getChatEntirePushEnabled() == 1, null);
                if (chatThreadMessages.isKickedBy().length() > 0) {
                    this.f24593w.R = a10;
                    this.f24593w.v6();
                    this.f24593w.U5(chatThreadMessages.isKickedBy());
                    return wn.v.f59242a;
                }
                this.f24593w.m6(aVar.a(chatThreadMessages.getThread(), chatThreadMessages.getChatEntirePushEnabled() == 1, null));
                String str = this.f24593w.Q;
                if (!(str == null || str.length() == 0)) {
                    this.f24593w.C5();
                }
                this.f24593w.a5(chatThreadMessages.getMessages());
                ge.k kVar = this.f24593w.V;
                if (kVar == null) {
                    jo.p.v("timelineAdapter");
                    kVar = null;
                }
                kVar.r(chatThreadMessages.getHasOld() == 1);
                this.f24593w.Z5();
                this.f24593w.a6(200);
                if (this.f24593w.R == null) {
                    return wn.v.f59242a;
                }
                if (chatThreadMessages.getMessages().isEmpty()) {
                    ge.j jVar = this.f24593w.R;
                    jo.p.e(jVar);
                    if (!jVar.n()) {
                        ae.e eVar2 = this.f24593w.P;
                        if (eVar2 == null) {
                            jo.p.v("binding");
                            eVar2 = null;
                        }
                        eVar2.Y.setVisibility(0);
                        ge.j jVar2 = this.f24593w.R;
                        List<String> j10 = jVar2 != null ? jVar2.j() : null;
                        if (j10 != null && (!j10.isEmpty())) {
                            GlideRequest<Drawable> apply = GlideApp.with((androidx.fragment.app.h) this.f24593w).load((String) xn.a0.X(j10)).placeholder(nc.d.D).apply((e8.a<?>) new e8.h().circleCrop());
                            ae.e eVar3 = this.f24593w.P;
                            if (eVar3 == null) {
                                jo.p.v("binding");
                                eVar3 = null;
                            }
                            apply.into(eVar3.B);
                        }
                        GlideRequest<Drawable> apply2 = GlideApp.with((androidx.fragment.app.h) this.f24593w).load(this.f24593w.r5().u2()).placeholder(nc.d.D).apply((e8.a<?>) new e8.h().circleCrop());
                        ae.e eVar4 = this.f24593w.P;
                        if (eVar4 == null) {
                            jo.p.v("binding");
                        } else {
                            eVar = eVar4;
                        }
                        apply2.into(eVar.C);
                        return wn.v.f59242a;
                    }
                }
                ae.e eVar5 = this.f24593w.P;
                if (eVar5 == null) {
                    jo.p.v("binding");
                } else {
                    eVar = eVar5;
                }
                eVar.Y.setVisibility(8);
                return wn.v.f59242a;
            }
        }

        public s(ao.d<? super s> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new s(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((s) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24591w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<ChatThreadMessages> o10 = ChatPageActivity.this.l5().o();
                a aVar = new a(ChatPageActivity.this);
                this.f24591w = 1;
                if (o10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$onCreate$2", f = "ChatPageActivity.kt", l = {221}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class t extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24594w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ChatPageActivity f24596w;

            public a(ChatPageActivity chatPageActivity) {
                this.f24596w = chatPageActivity;
            }

            public static final void g(ChatPageActivity chatPageActivity, DialogInterface dialogInterface, int i10) {
                jo.p.h(chatPageActivity, "this$0");
                chatPageActivity.finish();
            }

            @Override // xo.d
            /* renamed from: d */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                this.f24596w.d5();
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f24596w.getString(nc.i.f41875e);
                    jo.p.g(message, "getString(R.string.error_access)");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(this.f24596w);
                builder.setMessage(message);
                builder.setCancelable(false);
                int i10 = nc.i.E4;
                final ChatPageActivity chatPageActivity = this.f24596w;
                builder.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: tc.y
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        ChatPageActivity.t.a.g(ChatPageActivity.this, dialogInterface, i11);
                    }
                });
                AlertDialog create = builder.create();
                create.show();
                Button button = create.getButton(-1);
                ChatPageActivity chatPageActivity2 = this.f24596w;
                int i11 = nc.b.f41804x;
                button.setTextColor(chatPageActivity2.getColor(i11));
                create.getButton(-2).setTextColor(this.f24596w.getColor(i11));
                return wn.v.f59242a;
            }
        }

        public t(ao.d<? super t> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new t(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((t) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24594w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> n10 = ChatPageActivity.this.l5().n();
                a aVar = new a(ChatPageActivity.this);
                this.f24594w = 1;
                if (n10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$onCreate$3", f = "ChatPageActivity.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24597w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<ChatThreadMessages> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ChatPageActivity f24599w;

            public a(ChatPageActivity chatPageActivity) {
                this.f24599w = chatPageActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(ChatThreadMessages chatThreadMessages, ao.d<? super wn.v> dVar) {
                this.f24599w.a5(chatThreadMessages.getMessages());
                ge.k kVar = this.f24599w.V;
                if (kVar == null) {
                    jo.p.v("timelineAdapter");
                    kVar = null;
                }
                kVar.r(chatThreadMessages.getHasOld() == 1);
                return wn.v.f59242a;
            }
        }

        public u(ao.d<? super u> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24597w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<ChatThreadMessages> k10 = ChatPageActivity.this.l5().k();
                a aVar = new a(ChatPageActivity.this);
                this.f24597w = 1;
                if (k10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$onCreate$4", f = "ChatPageActivity.kt", l = {243}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24600w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ChatPageActivity f24602w;

            public a(ChatPageActivity chatPageActivity) {
                this.f24602w = chatPageActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                of.n.A(this.f24602w, nc.i.f41894v5, false);
                return wn.v.f59242a;
            }
        }

        public v(ao.d<? super v> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24600w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<wn.v> p10 = ChatPageActivity.this.l5().p();
                a aVar = new a(ChatPageActivity.this);
                this.f24600w = 1;
                if (p10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$onCreate$5", f = "ChatPageActivity.kt", l = {248}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class w extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24603w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ChatPageActivity f24605w;

            public a(ChatPageActivity chatPageActivity) {
                this.f24605w = chatPageActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super wn.v> dVar) {
                if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(this.f24605w, mRError);
                } else {
                    if (mRError instanceof MRError.Failure ? true : mRError instanceof MRError.Blocked ? true : mRError instanceof MRError.Banned) {
                        of.n.f45411a.B(this.f24605w, mRError.getMessage(), false);
                    } else if (mRError instanceof MRError.Network) {
                        of.n.z(this.f24605w);
                    }
                }
                return wn.v.f59242a;
            }
        }

        public w(ao.d<? super w> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new w(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((w) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24603w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> l10 = ChatPageActivity.this.l5().l();
                a aVar = new a(ChatPageActivity.this);
                this.f24603w = 1;
                if (l10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class x extends jo.q implements io.a<wn.v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f24607x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(String str) {
            super(0);
            this.f24607x = str;
        }

        public static final void d(final ChatPageActivity chatPageActivity, String str) {
            jo.p.h(chatPageActivity, "this$0");
            jo.p.h(str, "$kickedBy");
            e.a aVar = new e.a();
            String string = chatPageActivity.getString(nc.i.text_chat_outcast_dialog_ttl);
            jo.p.g(string, "getString(R.string.text_chat_outcast_dialog_ttl)");
            e.a g10 = aVar.g(string);
            String string2 = chatPageActivity.getString(nc.i.text_chat_outcast_dialog_body, new Object[]{str});
            jo.p.g(string2, "getString(R.string.text_…st_dialog_body, kickedBy)");
            e.a e10 = g10.e(string2);
            String string3 = chatPageActivity.getString(nc.i.text_chat_btn_outcast);
            jo.p.g(string3, "getString(R.string.text_chat_btn_outcast)");
            ge.e a10 = e10.b(string3).c(true).a();
            a10.M3(new Runnable() { // from class: tc.z
                @Override // java.lang.Runnable
                public final void run() {
                    ChatPageActivity.x.e(ChatPageActivity.this);
                }
            });
            a10.z3(chatPageActivity.a3(), "ChatConfirmationDialog");
        }

        public static final void e(ChatPageActivity chatPageActivity) {
            jo.p.h(chatPageActivity, "this$0");
            chatPageActivity.D5();
        }

        public final void c() {
            final ChatPageActivity chatPageActivity = ChatPageActivity.this;
            final String str = this.f24607x;
            chatPageActivity.runOnUiThread(new Runnable() { // from class: tc.a0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatPageActivity.x.d(ChatPageActivity.this, str);
                }
            });
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            c();
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.ChatPageActivity$polling$1", f = "ChatPageActivity.kt", l = {815}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class y extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24608w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Runnable f24610y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Runnable runnable, ao.d<? super y> dVar) {
            super(2, dVar);
            this.f24610y = runnable;
        }

        public static final int g(Chat.Message message, Chat.Message message2) {
            return (int) (message.getCreatedAt() - message2.getCreatedAt());
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new y(this.f24610y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((y) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Runnable runnable;
            Object c10 = bo.c.c();
            int i10 = this.f24608w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest p52 = ChatPageActivity.this.p5();
                    String o52 = ChatPageActivity.this.o5();
                    ge.j jVar = ChatPageActivity.this.R;
                    String m10 = jVar != null ? jVar.m() : null;
                    ge.j jVar2 = ChatPageActivity.this.R;
                    String f10 = jVar2 != null ? jVar2.f() : null;
                    Long l10 = ChatPageActivity.this.f24509h0;
                    this.f24608w = 1;
                    obj = p52.getChatThread(o52, m10, f10, l10, null, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ChatThreadMessages chatThreadMessages = (ChatThreadMessages) obj;
                ChatPageActivity chatPageActivity = ChatPageActivity.this;
                j.a aVar = ge.j.G;
                Chat.Thread thread = chatThreadMessages.getThread();
                boolean z11 = chatThreadMessages.getChatEntirePushEnabled() == 1;
                ge.j jVar3 = ChatPageActivity.this.R;
                jo.p.e(jVar3);
                chatPageActivity.m6(aVar.a(thread, z11, jVar3.h()));
                if (chatThreadMessages.getMessages() == null || !(!chatThreadMessages.getMessages().isEmpty())) {
                    z10 = false;
                } else {
                    xn.w.x(chatThreadMessages.getMessages(), tc.b0.f53460w);
                    z10 = false;
                    for (Chat.Message message : chatThreadMessages.getMessages()) {
                        ChatPageActivity.this.X4(message);
                        if (ChatPageActivity.this.f24509h0 != null) {
                            long id2 = message.getId();
                            Long l11 = ChatPageActivity.this.f24509h0;
                            jo.p.e(l11);
                            if (id2 > l11.longValue()) {
                                ChatPageActivity.this.f24509h0 = co.b.e(message.getId());
                                z10 = true;
                            }
                        }
                    }
                }
                if (chatThreadMessages.getHasNew() != 1 || !z10) {
                    if (ChatPageActivity.this.f24512k0 != null && (runnable = this.f24610y) != null) {
                        runnable.run();
                    }
                } else {
                    ChatPageActivity.this.X5(this.f24610y);
                }
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.ForceUpdate ? true : jo.p.c(error, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(ChatPageActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ChatPageActivity chatPageActivity2 = ChatPageActivity.this;
                    String message2 = error.getMessage();
                    if (message2 == null) {
                        message2 = ChatPageActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message2, "getString(R.string.error_access)");
                    }
                    nVar.B(chatPageActivity2, message2, false);
                }
                Runnable runnable2 = this.f24610y;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class z implements k.f {
        public z() {
        }

        @Override // ge.k.f
        public void a(long j10) {
            ChatPageActivity.this.F5(j10);
        }
    }

    public ChatPageActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f24517p0 = wn.g.b(iVar, new c0(this, null, null));
        this.f24518q0 = wn.g.b(iVar, new d0(this, null, null));
        this.f24519r0 = wn.g.b(iVar, new e0(this, null, null));
        this.f24520s0 = wn.g.b(iVar, new f0(this, null, null));
        this.f24521t0 = wn.g.b(iVar, new g0(this, null, null));
        this.f24522u0 = wn.g.b(iVar, new h0(this, null, null));
        this.f24523v0 = wn.g.b(iVar, new i0(this, null, null));
        this.f24524w0 = new s0(jo.f0.b(tc.c0.class), new l0(this), new k0(new j0(this), null, null, gq.a.a(this)));
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.r
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ChatPageActivity.u5(ChatPageActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…nGroupUsersResult()\n    }");
        this.f24525x0 = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.s
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ChatPageActivity.t5(ChatPageActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V22, "registerForActivityResul…Result(result.data)\n    }");
        this.f24526y0 = V22;
        androidx.activity.result.c<Intent> V23 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.q
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ChatPageActivity.s5(ChatPageActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V23, "registerForActivityResul…Result(result.data)\n    }");
        this.f24527z0 = V23;
    }

    public static final void A5(ChatPageActivity chatPageActivity, View view) {
        jo.p.h(chatPageActivity, "this$0");
        chatPageActivity.onBackPressed();
    }

    public static final void L5(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        chatPageActivity.n6(0);
    }

    public static final void O5(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        chatPageActivity.D5();
    }

    public static final void R5(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        chatPageActivity.n6(1);
    }

    public static final void Y4(ChatPageActivity chatPageActivity, Chat.Message message) {
        jo.p.h(chatPageActivity, "this$0");
        jo.p.h(message, "$message");
        ae.e eVar = chatPageActivity.P;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.Y.setVisibility(8);
        ge.k kVar = chatPageActivity.V;
        if (kVar == null) {
            jo.p.v("timelineAdapter");
            kVar = null;
        }
        int h10 = kVar.h(message);
        if (chatPageActivity.n5().i(message.getUserId())) {
            chatPageActivity.Z5();
        } else {
            chatPageActivity.E5(h10);
        }
        if (message.getInvited() != null || message.getKicked() != null) {
            chatPageActivity.X5(null);
        }
        if (message.getKicked() == null || message.getKicked().getKickedUserIds() == null || !message.getKicked().getKickedUserIds().contains(chatPageActivity.n5().x())) {
            return;
        }
        chatPageActivity.U5(message.getKicked().getUserName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r1 < r3.longValue()) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b5(java.util.List r5, com.dena.mirrativ.user.mypage.chat.ChatPageActivity r6) {
        /*
            java.lang.String r0 = "$messages"
            jo.p.h(r5, r0)
            java.lang.String r0 = "this$0"
            jo.p.h(r6, r0)
            tc.p r0 = tc.p.f53559w
            xn.a0.v0(r5, r0)
            androidx.recyclerview.widget.LinearLayoutManager r0 = r6.U
            r1 = 0
            if (r0 != 0) goto L1a
            java.lang.String r0 = "timelineLayoutManager"
            jo.p.v(r0)
            r0 = r1
        L1a:
            int r0 = r0.l2()
            java.util.Iterator r2 = r5.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()
            com.dena.mirrorman.net.api.response.Chat$Message r3 = (com.dena.mirrorman.net.api.response.Chat.Message) r3
            ge.k r4 = r6.V
            if (r4 != 0) goto L38
            java.lang.String r4 = "timelineAdapter"
            jo.p.v(r4)
            r4 = r1
        L38:
            r4.i(r3)
            ae.e r3 = r6.P
            if (r3 != 0) goto L45
            java.lang.String r3 = "binding"
            jo.p.v(r3)
            r3 = r1
        L45:
            androidx.recyclerview.widget.RecyclerView r3 = r3.U
            r3.p1(r0)
            goto L22
        L4b:
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r5.next()
            com.dena.mirrorman.net.api.response.Chat$Message r0 = (com.dena.mirrorman.net.api.response.Chat.Message) r0
            java.lang.Long r1 = r6.f24510i0
            if (r1 == 0) goto L70
            long r1 = r0.getId()
            java.lang.Long r3 = r6.f24510i0
            jo.p.e(r3)
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L7a
        L70:
            long r1 = r0.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.f24510i0 = r1
        L7a:
            java.lang.Long r1 = r6.f24509h0
            if (r1 == 0) goto L8f
            long r1 = r0.getId()
            java.lang.Long r3 = r6.f24509h0
            jo.p.e(r3)
            long r3 = r3.longValue()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L4f
        L8f:
            long r0 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.f24509h0 = r0
            goto L4f
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.chat.ChatPageActivity.b5(java.util.List, com.dena.mirrativ.user.mypage.chat.ChatPageActivity):void");
    }

    public static final void b6(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        ae.e eVar = chatPageActivity.P;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.U.x1(0);
    }

    public static final int c5(Chat.Message message, Chat.Message message2) {
        return (int) (message2.getCreatedAt() - message.getCreatedAt());
    }

    public static final void c6(int i10, final ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        new Handler().postDelayed(new Runnable() { // from class: tc.j
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.d6(ChatPageActivity.this);
            }
        }, i10);
    }

    public static final void d6(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        ae.e eVar = chatPageActivity.P;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.U.x1(0);
    }

    public static final void f6(View view, b0 b0Var) {
        jo.p.h(b0Var, "$listener");
        view.getViewTreeObserver().removeOnGlobalLayoutListener(b0Var);
    }

    public static final void i6(final ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        chatPageActivity.X5(new Runnable() { // from class: tc.x
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.j6(ChatPageActivity.this);
            }
        });
    }

    public static final void j6(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        Handler handler = chatPageActivity.f24512k0;
        if (handler == null || chatPageActivity.f24513l0 == null) {
            return;
        }
        jo.p.e(handler);
        Runnable runnable = chatPageActivity.f24513l0;
        jo.p.e(runnable);
        handler.postDelayed(runnable, DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static final void q6(ChatPageActivity chatPageActivity, boolean z10) {
        jo.p.h(chatPageActivity, "this$0");
        ae.e eVar = chatPageActivity.P;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        eVar.H.setVisibility(z10 ? 0 : 8);
    }

    public static final void s5(ChatPageActivity chatPageActivity, androidx.activity.result.a aVar) {
        jo.p.h(chatPageActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        chatPageActivity.V5(aVar.a());
    }

    public static final void s6(ChatPageActivity chatPageActivity, ChatMessageRead chatMessageRead) {
        jo.p.h(chatPageActivity, "this$0");
        jo.p.h(chatMessageRead, "$lastReadMessage");
        ge.k kVar = chatPageActivity.V;
        if (kVar == null) {
            jo.p.v("timelineAdapter");
            kVar = null;
        }
        kVar.u(chatMessageRead.getUserId(), chatMessageRead.getInvitedMessageId(), chatMessageRead.getLastReadMessageId());
    }

    public static final void t5(ChatPageActivity chatPageActivity, androidx.activity.result.a aVar) {
        jo.p.h(chatPageActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        chatPageActivity.T5(aVar.a());
    }

    public static final void u5(ChatPageActivity chatPageActivity, androidx.activity.result.a aVar) {
        jo.p.h(chatPageActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        chatPageActivity.W5();
    }

    public static final void u6(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        ge.j jVar = chatPageActivity.R;
        jo.p.e(jVar);
        ae.e eVar = null;
        if (jVar.e()) {
            ge.j jVar2 = chatPageActivity.R;
            jo.p.e(jVar2);
            if (jVar2.k()) {
                ae.e eVar2 = chatPageActivity.P;
                if (eVar2 == null) {
                    jo.p.v("binding");
                    eVar2 = null;
                }
                eVar2.Q.setText(nc.i.text_chat_nortifi_on);
                ae.e eVar3 = chatPageActivity.P;
                if (eVar3 == null) {
                    jo.p.v("binding");
                    eVar3 = null;
                }
                eVar3.P.setImageResource(nc.h.ic_room_push_on);
            } else {
                ae.e eVar4 = chatPageActivity.P;
                if (eVar4 == null) {
                    jo.p.v("binding");
                    eVar4 = null;
                }
                eVar4.Q.setText(nc.i.text_chat_nortifi_off);
                ae.e eVar5 = chatPageActivity.P;
                if (eVar5 == null) {
                    jo.p.v("binding");
                    eVar5 = null;
                }
                eVar5.P.setImageResource(nc.h.ic_room_push_off);
            }
        } else {
            ae.e eVar6 = chatPageActivity.P;
            if (eVar6 == null) {
                jo.p.v("binding");
                eVar6 = null;
            }
            eVar6.Q.setText(nc.i.text_chat_nortifi_hide);
            ae.e eVar7 = chatPageActivity.P;
            if (eVar7 == null) {
                jo.p.v("binding");
                eVar7 = null;
            }
            eVar7.P.setImageResource(nc.h.ic_room_push_off);
        }
        ge.j jVar3 = chatPageActivity.R;
        jo.p.e(jVar3);
        if (jVar3.n()) {
            ae.e eVar8 = chatPageActivity.P;
            if (eVar8 == null) {
                jo.p.v("binding");
                eVar8 = null;
            }
            eVar8.S.setVisibility(0);
            ae.e eVar9 = chatPageActivity.P;
            if (eVar9 == null) {
                jo.p.v("binding");
                eVar9 = null;
            }
            eVar9.J.setVisibility(0);
            ae.e eVar10 = chatPageActivity.P;
            if (eVar10 == null) {
                jo.p.v("binding");
                eVar10 = null;
            }
            eVar10.N.setVisibility(0);
        } else {
            ae.e eVar11 = chatPageActivity.P;
            if (eVar11 == null) {
                jo.p.v("binding");
                eVar11 = null;
            }
            eVar11.S.setVisibility(8);
            ae.e eVar12 = chatPageActivity.P;
            if (eVar12 == null) {
                jo.p.v("binding");
                eVar12 = null;
            }
            eVar12.J.setVisibility(8);
            ae.e eVar13 = chatPageActivity.P;
            if (eVar13 == null) {
                jo.p.v("binding");
                eVar13 = null;
            }
            eVar13.N.setVisibility(8);
        }
        if (chatPageActivity.v5()) {
            ae.e eVar14 = chatPageActivity.P;
            if (eVar14 == null) {
                jo.p.v("binding");
                eVar14 = null;
            }
            eVar14.L.setAlpha(1.0f);
            ae.e eVar15 = chatPageActivity.P;
            if (eVar15 == null) {
                jo.p.v("binding");
                eVar15 = null;
            }
            eVar15.M.setText(nc.i.text_chat_member_add);
        } else {
            ae.e eVar16 = chatPageActivity.P;
            if (eVar16 == null) {
                jo.p.v("binding");
                eVar16 = null;
            }
            eVar16.L.setAlpha(0.5f);
            ae.e eVar17 = chatPageActivity.P;
            if (eVar17 == null) {
                jo.p.v("binding");
                eVar17 = null;
            }
            eVar17.M.setText(nc.i.text_chat_member_full);
        }
        ge.j jVar4 = chatPageActivity.R;
        jo.p.e(jVar4);
        if (jVar4.p() > 0) {
            ae.e eVar18 = chatPageActivity.P;
            if (eVar18 == null) {
                jo.p.v("binding");
                eVar18 = null;
            }
            eVar18.K.setVisibility(0);
            ae.e eVar19 = chatPageActivity.P;
            if (eVar19 == null) {
                jo.p.v("binding");
            } else {
                eVar = eVar19;
            }
            eVar.R.setVisibility(8);
            return;
        }
        ae.e eVar20 = chatPageActivity.P;
        if (eVar20 == null) {
            jo.p.v("binding");
            eVar20 = null;
        }
        eVar20.K.setVisibility(8);
        ae.e eVar21 = chatPageActivity.P;
        if (eVar21 == null) {
            jo.p.v("binding");
        } else {
            eVar = eVar21;
        }
        eVar.R.setVisibility(0);
    }

    public static final void w6(ChatPageActivity chatPageActivity) {
        jo.p.h(chatPageActivity, "this$0");
        ae.e eVar = chatPageActivity.P;
        ae.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        AppCompatTextView appCompatTextView = eVar.X;
        ge.j jVar = chatPageActivity.R;
        jo.p.e(jVar);
        appCompatTextView.setText(jVar.l());
        ge.j jVar2 = chatPageActivity.R;
        jo.p.e(jVar2);
        if (jVar2.n()) {
            ae.e eVar3 = chatPageActivity.P;
            if (eVar3 == null) {
                jo.p.v("binding");
                eVar3 = null;
            }
            eVar3.W.setVisibility(0);
            ae.e eVar4 = chatPageActivity.P;
            if (eVar4 == null) {
                jo.p.v("binding");
            } else {
                eVar2 = eVar4;
            }
            AppCompatTextView appCompatTextView2 = eVar2.W;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            ge.j jVar3 = chatPageActivity.R;
            jo.p.e(jVar3);
            sb2.append(jVar3.i());
            sb2.append(')');
            appCompatTextView2.setText(sb2.toString());
            return;
        }
        ae.e eVar5 = chatPageActivity.P;
        if (eVar5 == null) {
            jo.p.v("binding");
        } else {
            eVar2 = eVar5;
        }
        eVar2.W.setVisibility(8);
    }

    public static final void y5(ChatPageActivity chatPageActivity, View view) {
        jo.p.h(chatPageActivity, "this$0");
        chatPageActivity.finish();
    }

    public static final boolean z5(ChatPageActivity chatPageActivity, MenuItem menuItem) {
        jo.p.h(chatPageActivity, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_settings) {
            chatPageActivity.p6(!chatPageActivity.T);
            return true;
        }
        return false;
    }

    public final boolean B5() {
        LinearLayoutManager linearLayoutManager = this.U;
        if (linearLayoutManager == null) {
            jo.p.v("timelineLayoutManager");
            linearLayoutManager = null;
        }
        return linearLayoutManager.i2() <= 1;
    }

    @Override // ge.i
    public void C0(String str) {
        jo.p.h(str, "message");
        ClipData clipData = new ClipData(new ClipDescription("text_data", new String[]{"text/plain"}), new ClipData.Item(str));
        ae.e eVar = this.P;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        Object systemService = eVar.u().getContext().getSystemService("clipboard");
        jo.p.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(clipData);
    }

    public final void C5() {
        if (this.R == null) {
            return;
        }
        uo.l.d(this, null, null, new o(null), 3, null);
    }

    public final void D5() {
        if (this.R == null) {
            return;
        }
        k6();
        uo.l.d(this, null, null, new p(null), 3, null);
    }

    public final void E5(int i10) {
        if (i10 < 0) {
            return;
        }
        if (B5()) {
            Z5();
            return;
        }
        LinearLayoutManager linearLayoutManager = this.U;
        ae.e eVar = null;
        if (linearLayoutManager == null) {
            jo.p.v("timelineLayoutManager");
            linearLayoutManager = null;
        }
        if (i10 >= linearLayoutManager.i2()) {
            LinearLayoutManager linearLayoutManager2 = this.U;
            if (linearLayoutManager2 == null) {
                jo.p.v("timelineLayoutManager");
                linearLayoutManager2 = null;
            }
            if (i10 <= linearLayoutManager2.l2()) {
                return;
            }
        }
        ae.e eVar2 = this.P;
        if (eVar2 == null) {
            jo.p.v("binding");
        } else {
            eVar = eVar2;
        }
        eVar.E.setVisibility(0);
    }

    public final void F5(long j10) {
        if (this.R == null) {
            return;
        }
        uo.l.d(this, null, null, new q(j10, null), 3, null);
    }

    public final void G5() {
        Z5();
    }

    public final void H5() {
        if (this.R == null) {
            return;
        }
        ae.e eVar = this.P;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        String obj = eVar.T.getText().toString();
        if (so.n.r(obj)) {
            return;
        }
        ae.e eVar2 = this.P;
        if (eVar2 == null) {
            jo.p.v("binding");
            eVar2 = null;
        }
        eVar2.T.setText("");
        uo.l.d(this, null, null, new r(obj, null), 3, null);
    }

    public final void I5() {
        p6(false);
    }

    public final void J5() {
        ge.j jVar = this.R;
        if (jVar != null) {
            this.f24527z0.a(GroupEditActivity.Z.a(this, jVar));
        }
    }

    @Override // ge.i
    public void K1(String str) {
        jo.p.h(str, TtmlNode.ATTR_ID);
        i.a aVar = ie.i.U0;
        String string = getString(nc.i.text_chat_report_title);
        jo.p.g(string, "getString(R.string.text_chat_report_title)");
        String string2 = getString(nc.i.text_chat_report_description);
        int i10 = nc.b.C;
        String string3 = getString(nc.i.text_report);
        jo.p.g(string3, "getString(R.string.text_report)");
        aVar.a(string, string2, i10, string3, nc.b.f41798r, getString(nc.i.B)).z3(a3(), "DIALOG_TAG_MESSAGE_REPORT");
        this.f24514m0 = str;
    }

    public final void K5() {
        e.a aVar = new e.a();
        String string = getString(nc.i.text_chat_room_hide_dialog_ttl);
        jo.p.g(string, "getString(R.string.text_chat_room_hide_dialog_ttl)");
        e.a g10 = aVar.g(string);
        String string2 = getString(nc.i.text_chat_room_hide_dialog_caution);
        jo.p.g(string2, "getString(R.string.text_…room_hide_dialog_caution)");
        e.a d10 = g10.e(string2).d(true);
        String string3 = getString(nc.i.f41874c6);
        jo.p.g(string3, "getString(R.string.text_yes)");
        ge.e a10 = d10.f(string3).a();
        a10.N3(new Runnable() { // from class: tc.w
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.L5(ChatPageActivity.this);
            }
        });
        a10.z3(a3(), "ChatConfirmationDialog");
    }

    @Override // ie.j
    public void L1(String str) {
        String str2;
        jo.p.h(str, "tag");
        if (!jo.p.c(str, "DIALOG_TAG_MESSAGE_REPORT") || (str2 = this.f24514m0) == null) {
            return;
        }
        k5().g(str2);
    }

    public final void M5() {
        if (v5()) {
            this.f24526y0.a(GroupInvitationsActivity.f24624b0.a(this, this.R));
        }
    }

    public final void N5() {
        e.a aVar = new e.a();
        String string = getString(nc.i.text_chat_room_leave_dialog_ttl);
        jo.p.g(string, "getString(R.string.text_…at_room_leave_dialog_ttl)");
        e.a g10 = aVar.g(string);
        String string2 = getString(nc.i.text_chat_room_leave_dialog_caution);
        jo.p.g(string2, "getString(R.string.text_…oom_leave_dialog_caution)");
        e.a d10 = g10.e(string2).d(true);
        String string3 = getString(nc.i.text_chat_btn_room_leave);
        jo.p.g(string3, "getString(R.string.text_chat_btn_room_leave)");
        ge.e a10 = d10.f(string3).a();
        a10.N3(new Runnable() { // from class: tc.f
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.O5(ChatPageActivity.this);
            }
        });
        a10.z3(a3(), "ChatConfirmationDialog");
    }

    public final void P5() {
        o6();
    }

    public final void Q5() {
        e.a aVar = new e.a();
        String string = getString(nc.i.text_chat_room_show_dialog_ttl);
        jo.p.g(string, "getString(R.string.text_chat_room_show_dialog_ttl)");
        e.a g10 = aVar.g(string);
        String string2 = getString(nc.i.text_chat_room_show_dialog_caution);
        jo.p.g(string2, "getString(R.string.text_…room_show_dialog_caution)");
        e.a d10 = g10.e(string2).d(true);
        String string3 = getString(nc.i.f41874c6);
        jo.p.g(string3, "getString(R.string.text_yes)");
        ge.e a10 = d10.f(string3).a();
        a10.N3(new Runnable() { // from class: tc.h
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.R5(ChatPageActivity.this);
            }
        });
        a10.z3(a3(), "ChatConfirmationDialog");
    }

    public final void S5() {
        this.f24525x0.a(GroupUsersActivity.Y.a(this, this.R));
    }

    public final void T5(Intent intent) {
        ge.j jVar;
        if (isFinishing()) {
            return;
        }
        p6(false);
        if (intent != null && (jVar = (ge.j) intent.getParcelableExtra("KEY_RESULT_THREAD")) != null) {
            m6(jVar);
        }
        X5(null);
    }

    public final void U5(String str) {
        if (this.f24502a0) {
            return;
        }
        this.f24502a0 = true;
        d5();
        l6();
        this.f24516o0.c(new x(str));
    }

    public final void V5(Intent intent) {
        ge.j jVar;
        if (isFinishing()) {
            return;
        }
        p6(false);
        if (intent != null && (jVar = (ge.j) intent.getParcelableExtra("KEY_RESULT_THREAD")) != null) {
            m6(jVar);
        }
        X5(null);
    }

    public final void W5() {
        if (isFinishing()) {
            return;
        }
        p6(false);
        X5(null);
    }

    public final void X4(final Chat.Message message) {
        runOnUiThread(new Runnable() { // from class: tc.k
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.Y4(ChatPageActivity.this, message);
            }
        });
    }

    public final void X5(Runnable runnable) {
        if (this.R == null && runnable != null) {
            runnable.run();
        } else if (this.f24509h0 != null || this.f24512k0 == null) {
            uo.l.d(this, null, null, new y(runnable, null), 3, null);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void Y5() {
        Context applicationContext = getApplicationContext();
        jo.p.g(applicationContext, "applicationContext");
        ge.j jVar = this.R;
        boolean z10 = false;
        this.V = new ge.k(applicationContext, jVar != null ? jVar.n() : false, new z(), new a0());
        ae.e eVar = this.P;
        ae.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        RecyclerView recyclerView = eVar.U;
        ge.k kVar = this.V;
        if (kVar == null) {
            jo.p.v("timelineAdapter");
            kVar = null;
        }
        recyclerView.setAdapter(kVar);
        p6(false);
        t6();
        ae.e eVar3 = this.P;
        if (eVar3 == null) {
            jo.p.v("binding");
        } else {
            eVar2 = eVar3;
        }
        eVar2.E.setVisibility(8);
        String str = this.Q;
        if ((str == null || str.length() == 0) ? true : true) {
            C5();
        }
        w5();
    }

    public final void Z4(Long l10, Long l11) {
        this.Z = true;
        ge.j jVar = this.R;
        if (jVar != null) {
            k5().d(this.S, jVar, l10, l11);
        } else {
            k5().c(this.S, this.Q);
        }
        this.Z = false;
    }

    public final void Z5() {
        runOnUiThread(new Runnable() { // from class: tc.g
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.b6(ChatPageActivity.this);
            }
        });
    }

    public final void a5(final List<Chat.Message> list) {
        if (list.isEmpty()) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: tc.o
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.b5(list, this);
            }
        });
    }

    public final void a6(final int i10) {
        runOnUiThread(new Runnable() { // from class: tc.u
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.c6(i10, this);
            }
        });
    }

    public final void d5() {
        BcsvrChannel e10 = hf.e.e(j5(), "ChatActivity", false, 2, null);
        BcsvrChannel.OnMessageReceivedListener onMessageReceivedListener = this.f24506e0;
        if (onMessageReceivedListener != null) {
            e10.removeOnMessageListener(onMessageReceivedListener);
        }
        e10.closeQuietly();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        jo.p.h(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            Rect rect = new Rect();
            ae.e eVar = this.P;
            ae.e eVar2 = null;
            if (eVar == null) {
                jo.p.v("binding");
                eVar = null;
            }
            eVar.F.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                of.j jVar = of.j.f45405a;
                ae.e eVar3 = this.P;
                if (eVar3 == null) {
                    jo.p.v("binding");
                } else {
                    eVar2 = eVar3;
                }
                jVar.c(this, eVar2.T);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e5() {
        if (this.f24502a0 || this.f24504c0 == null || jo.p.c(l5().m().f(), Boolean.TRUE)) {
            return;
        }
        if (this.f24506e0 == null) {
            this.f24506e0 = f5();
        }
        BcsvrChannel e10 = hf.e.e(j5(), "ChatActivity", false, 2, null);
        BcsvrChannel.OnMessageReceivedListener onMessageReceivedListener = this.f24506e0;
        jo.p.e(onMessageReceivedListener);
        e10.addOnMessageListener(onMessageReceivedListener);
        if (e10.isConnected()) {
            e10.disconnectNoThrow();
        }
        e10.connectNoThrow(this.f24504c0);
        X5(null);
    }

    public final Runnable e6() {
        View findViewById = findViewById(16908290);
        jo.p.f(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
        final View childAt = ((ViewGroup) findViewById).getChildAt(0);
        final b0 b0Var = new b0(childAt, this);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(b0Var);
        return new Runnable() { // from class: tc.v
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.f6(childAt, b0Var);
            }
        };
    }

    public final BcsvrChannel.OnMessageReceivedListener f5() {
        return new b(new xm.f().f().b());
    }

    public final String g5(String str) {
        if ((str.length() == 0) || this.f24505d0 == null || this.f24503b0 == null) {
            return null;
        }
        String substring = str.substring(0, 32);
        jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] c10 = vh.k.c(substring);
        jo.p.g(c10, "stringToBytes(message.substring(0, 32))");
        String substring2 = str.substring(32);
        jo.p.g(substring2, "this as java.lang.String).substring(startIndex)");
        byte[] c11 = vh.k.c(substring2);
        jo.p.g(c11, "stringToBytes(message.substring(32))");
        try {
            Cipher cipher = this.f24503b0;
            jo.p.e(cipher);
            cipher.init(2, this.f24505d0, new IvParameterSpec(c10));
            Cipher cipher2 = this.f24503b0;
            jo.p.e(cipher2);
            byte[] doFinal = cipher2.doFinal(c11);
            jo.p.g(doFinal, "cipher!!.doFinal(text)");
            return new String(doFinal, so.c.f52772b);
        } catch (Throwable th2) {
            th2.printStackTrace();
            g9.a.c(th2);
            return null;
        }
    }

    public final void g6(String str) {
        ae.e eVar = this.P;
        ae.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        Editable text = eVar.T.getText();
        jo.p.g(text, "binding.textField.text");
        if (text.length() == 0) {
            ae.e eVar3 = this.P;
            if (eVar3 == null) {
                jo.p.v("binding");
            } else {
                eVar2 = eVar3;
            }
            eVar2.T.setText(str);
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h5() {
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList<sd.b> arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        for (sd.b bVar : arrayList) {
            bVar.n3();
        }
    }

    public final void h6() {
        if (this.f24502a0) {
            return;
        }
        if (this.f24511j0 == null) {
            HandlerThread handlerThread = new HandlerThread("ChatPageActivity.polling");
            this.f24511j0 = handlerThread;
            jo.p.e(handlerThread);
            handlerThread.start();
        }
        if (this.f24512k0 == null) {
            HandlerThread handlerThread2 = this.f24511j0;
            jo.p.e(handlerThread2);
            this.f24512k0 = new Handler(handlerThread2.getLooper());
        }
        if (this.f24513l0 == null) {
            this.f24513l0 = new Runnable() { // from class: tc.i
                @Override // java.lang.Runnable
                public final void run() {
                    ChatPageActivity.i6(ChatPageActivity.this);
                }
            };
        } else {
            Handler handler = this.f24512k0;
            jo.p.e(handler);
            Runnable runnable = this.f24513l0;
            jo.p.e(runnable);
            handler.removeCallbacks(runnable);
        }
        Handler handler2 = this.f24512k0;
        jo.p.e(handler2);
        Runnable runnable2 = this.f24513l0;
        jo.p.e(runnable2);
        handler2.post(runnable2);
    }

    public final void i5() {
        if (this.R == null) {
            return;
        }
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    public final hf.e j5() {
        return (hf.e) this.f24522u0.getValue();
    }

    @Override // ie.j
    public void k(String str) {
        j.a.a(this, str);
    }

    public final tc.a k5() {
        return (tc.a) this.f24523v0.getValue();
    }

    public final void k6() {
        List<Fragment> p02 = a3().p0();
        jo.p.g(p02, "supportFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object obj : p02) {
            if (obj instanceof sd.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            sd.b.O0.a(false).z3(a3(), "ProgressDialogFragment");
        }
    }

    public final tc.c0 l5() {
        return (tc.c0) this.f24524w0.getValue();
    }

    public final void l6() {
        HandlerThread handlerThread = this.f24511j0;
        if (handlerThread == null) {
            return;
        }
        jo.p.e(handlerThread);
        handlerThread.quit();
        this.f24511j0 = null;
        this.f24512k0 = null;
    }

    public final hf.r m5() {
        return (hf.r) this.f24521t0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
        if (r5 != r6.size()) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6(ge.j r8) {
        /*
            r7 = this;
            ge.j r0 = r7.R
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            int r0 = r8.i()
            ge.j r3 = r7.R
            jo.p.e(r3)
            int r3 = r3.i()
            if (r0 == r3) goto L16
            goto L18
        L16:
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            ge.j r3 = r7.R
            if (r3 == 0) goto L33
            jo.p.e(r3)
            java.lang.String r3 = r3.l()
            java.lang.String r4 = r8.l()
            boolean r3 = jo.p.c(r3, r4)
            if (r3 == 0) goto L33
            if (r0 == 0) goto L31
            goto L33
        L31:
            r3 = r1
            goto L34
        L33:
            r3 = r2
        L34:
            ge.j r4 = r7.R
            if (r4 == 0) goto L68
            jo.p.e(r4)
            boolean r4 = r4.k()
            boolean r5 = r8.k()
            if (r4 != r5) goto L68
            ge.j r4 = r7.R
            jo.p.e(r4)
            boolean r4 = r4.e()
            boolean r5 = r8.e()
            if (r4 != r5) goto L68
            if (r0 != 0) goto L68
            ge.j r0 = r7.R
            jo.p.e(r0)
            int r0 = r0.p()
            int r4 = r8.p()
            if (r0 == r4) goto L66
            goto L68
        L66:
            r0 = r1
            goto L69
        L68:
            r0 = r2
        L69:
            ge.j r4 = r7.R
            if (r4 == 0) goto L78
            jo.p.e(r4)
            boolean r4 = r4.o(r8)
            if (r4 != 0) goto L78
            r4 = r2
            goto L79
        L78:
            r4 = r1
        L79:
            boolean r5 = r8.n()
            if (r5 == 0) goto L97
            java.util.List r5 = r8.h()
            if (r5 == 0) goto L96
            int r5 = r8.i()
            java.util.List r6 = r8.h()
            jo.p.e(r6)
            int r6 = r6.size()
            if (r5 == r6) goto L97
        L96:
            r1 = r2
        L97:
            r7.R = r8
            if (r3 == 0) goto L9e
            r7.v6()
        L9e:
            if (r0 == 0) goto La3
            r7.t6()
        La3:
            if (r4 == 0) goto La8
            r7.Y5()
        La8:
            if (r1 == 0) goto Lad
            r7.i5()
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.chat.ChatPageActivity.m6(ge.j):void");
    }

    public final v0 n5() {
        return (v0) this.f24519r0.getValue();
    }

    public final void n6(int i10) {
        if (this.R == null) {
            return;
        }
        k6();
        uo.l.d(this, null, null, new m0(i10, null), 3, null);
    }

    public final String o5() {
        return this.S;
    }

    public final void o6() {
        ge.j jVar = this.R;
        if (jVar != null) {
            jo.p.e(jVar);
            if (jVar.e()) {
                ge.j jVar2 = this.R;
                jo.p.e(jVar2);
                boolean k10 = jVar2.k();
                ge.j jVar3 = this.R;
                jo.p.e(jVar3);
                ge.j jVar4 = this.R;
                jo.p.e(jVar4);
                this.R = jVar3.r(!jVar4.k());
                t6();
                uo.l.d(this, null, null, new n0(k10, null), 3, null);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("KEY_RESULT_THREAD", this.R);
        intent.putExtra("KEY_RESULT_READ", this.Y);
        intent.putExtra("KEY_RESULT_JOIN_THREAD", this.f24508g0);
        intent.putExtra("KEY_RESULT_POST_THREAD", this.f24507f0);
        setResult(-1, intent);
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.f41856b);
        jo.p.g(g10, "setContentView(this, R.layout.activity_chat_page)");
        this.P = (ae.e) g10;
        this.Q = getIntent().getStringExtra("EXTRA_DEEPLINK_HASH");
        this.R = (ge.j) getIntent().getParcelableExtra("EXTRA_THREAD");
        try {
            this.f24503b0 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } catch (Throwable th2) {
            th2.printStackTrace();
            g9.a.c(th2);
        }
        x5();
        uo.l.d(this, null, null, new s(null), 3, null);
        uo.l.d(this, null, null, new t(null), 3, null);
        uo.l.d(this, null, null, new u(null), 3, null);
        uo.l.d(this, null, null, new v(null), 3, null);
        uo.l.d(this, null, null, new w(null), 3, null);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @dq.l
    public final void onEvent(nd.c0 c0Var) {
        jo.p.h(c0Var, "event");
        startActivity(UserProfileActivity.f24944g0.a(this, c0Var.a(), Referer.OPEN_PROFILE));
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        dq.c.c().r(this);
        d5();
        l6();
        Runnable runnable = this.f24515n0;
        if (runnable == null) {
            jo.p.v("keyboardListenerRemover");
            runnable = null;
        }
        runnable.run();
        q5().b().c();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        dq.c.c().p(this);
        if (!jo.p.c(l5().m().f(), Boolean.TRUE)) {
            e5();
            h6();
        }
        this.f24515n0 = e6();
        if (this.R != null) {
            ge.a b10 = q5().b();
            ge.j jVar = this.R;
            jo.p.e(jVar);
            String m10 = jVar.m();
            ge.j jVar2 = this.R;
            jo.p.e(jVar2);
            b10.b(m10, jVar2.f());
        }
    }

    public final MRRequest p5() {
        return (MRRequest) this.f24517p0.getValue();
    }

    public final void p6(final boolean z10) {
        runOnUiThread(new Runnable() { // from class: tc.m
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.q6(ChatPageActivity.this, z10);
            }
        });
        this.T = z10;
    }

    public final i1 q5() {
        return (i1) this.f24518q0.getValue();
    }

    public final kf.x r5() {
        return (kf.x) this.f24520s0.getValue();
    }

    public final void r6(final ChatMessageRead chatMessageRead) {
        runOnUiThread(new Runnable() { // from class: tc.l
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.s6(ChatPageActivity.this, chatMessageRead);
            }
        });
    }

    public final void t6() {
        if (this.R == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: tc.e
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.u6(ChatPageActivity.this);
            }
        });
    }

    public final boolean v5() {
        ge.j jVar = this.R;
        if (jVar != null) {
            jo.p.e(jVar);
            if (jVar.n()) {
                ge.j jVar2 = this.R;
                jo.p.e(jVar2);
                if (jVar2.i() >= m5().f()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void v6() {
        if (this.R == null) {
            return;
        }
        runOnUiThread(new Runnable() { // from class: tc.d
            @Override // java.lang.Runnable
            public final void run() {
                ChatPageActivity.w6(ChatPageActivity.this);
            }
        });
    }

    public final void w5() {
        this.Z = true;
        ge.j jVar = this.R;
        if (jVar != null) {
            k5().f(this.S, jVar, null, null);
        } else {
            k5().e(this.S, this.Q);
        }
        this.Z = false;
    }

    public final void x5() {
        ae.e eVar = this.P;
        ae.e eVar2 = null;
        if (eVar == null) {
            jo.p.v("binding");
            eVar = null;
        }
        Toolbar toolbar = eVar.V;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatPageActivity.y5(ChatPageActivity.this, view);
            }
        });
        toolbar.setBackgroundResource(nc.h.f41869c);
        toolbar.setNavigationIcon(nc.d.f41815v);
        toolbar.inflateMenu(nc.g.setting_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: tc.t
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean z52;
                z52 = ChatPageActivity.z5(ChatPageActivity.this, menuItem);
                return z52;
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatPageActivity.A5(ChatPageActivity.this, view);
            }
        });
        v6();
        ae.e eVar3 = this.P;
        if (eVar3 == null) {
            jo.p.v("binding");
            eVar3 = null;
        }
        eVar3.U.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.L2(true);
        linearLayoutManager.M2(true);
        this.U = linearLayoutManager;
        ae.e eVar4 = this.P;
        if (eVar4 == null) {
            jo.p.v("binding");
            eVar4 = null;
        }
        RecyclerView recyclerView = eVar4.U;
        LinearLayoutManager linearLayoutManager2 = this.U;
        if (linearLayoutManager2 == null) {
            jo.p.v("timelineLayoutManager");
            linearLayoutManager2 = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager2);
        ae.e eVar5 = this.P;
        if (eVar5 == null) {
            jo.p.v("binding");
            eVar5 = null;
        }
        eVar5.U.k(new h());
        this.Y = false;
        Y5();
        ae.e eVar6 = this.P;
        if (eVar6 == null) {
            jo.p.v("binding");
            eVar6 = null;
        }
        FrameLayout frameLayout = eVar6.I;
        jo.p.g(frameLayout, "binding.settingsBg");
        g1.a(frameLayout, new i());
        ae.e eVar7 = this.P;
        if (eVar7 == null) {
            jo.p.v("binding");
            eVar7 = null;
        }
        LinearLayout linearLayout = eVar7.O;
        jo.p.g(linearLayout, "binding.settingsPush");
        g1.a(linearLayout, new j());
        ae.e eVar8 = this.P;
        if (eVar8 == null) {
            jo.p.v("binding");
            eVar8 = null;
        }
        LinearLayout linearLayout2 = eVar8.S;
        jo.p.g(linearLayout2, "binding.settingsUsers");
        g1.a(linearLayout2, new k());
        ae.e eVar9 = this.P;
        if (eVar9 == null) {
            jo.p.v("binding");
            eVar9 = null;
        }
        LinearLayout linearLayout3 = eVar9.L;
        jo.p.g(linearLayout3, "binding.settingsInviteUsers");
        g1.a(linearLayout3, new l());
        ae.e eVar10 = this.P;
        if (eVar10 == null) {
            jo.p.v("binding");
            eVar10 = null;
        }
        LinearLayout linearLayout4 = eVar10.J;
        jo.p.g(linearLayout4, "binding.settingsEditGroup");
        g1.a(linearLayout4, new m());
        ae.e eVar11 = this.P;
        if (eVar11 == null) {
            jo.p.v("binding");
            eVar11 = null;
        }
        LinearLayout linearLayout5 = eVar11.K;
        jo.p.g(linearLayout5, "binding.settingsHideRoom");
        g1.a(linearLayout5, new n());
        ae.e eVar12 = this.P;
        if (eVar12 == null) {
            jo.p.v("binding");
            eVar12 = null;
        }
        LinearLayout linearLayout6 = eVar12.R;
        jo.p.g(linearLayout6, "binding.settingsShowRoom");
        g1.a(linearLayout6, new d());
        ae.e eVar13 = this.P;
        if (eVar13 == null) {
            jo.p.v("binding");
            eVar13 = null;
        }
        LinearLayout linearLayout7 = eVar13.N;
        jo.p.g(linearLayout7, "binding.settingsLeaveGroup");
        g1.a(linearLayout7, new e());
        ae.e eVar14 = this.P;
        if (eVar14 == null) {
            jo.p.v("binding");
            eVar14 = null;
        }
        AppCompatButton appCompatButton = eVar14.G;
        jo.p.g(appCompatButton, "binding.send");
        g1.a(appCompatButton, new f());
        ae.e eVar15 = this.P;
        if (eVar15 == null) {
            jo.p.v("binding");
        } else {
            eVar2 = eVar15;
        }
        AppCompatTextView appCompatTextView = eVar2.E;
        jo.p.g(appCompatTextView, "binding.hasNewMessage");
        g1.a(appCompatTextView, new g());
    }
}
