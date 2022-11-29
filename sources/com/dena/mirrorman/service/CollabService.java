package com.dena.mirrorman.service;

import android.app.Service;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import b3.j;
import ce.l;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.CollabType;
import com.dena.mirrorman.net.bcsvr.BcsvrAddress;
import com.dena.mirrorman.net.bcsvr.BcsvrChannel;
import com.dena.mirrorman.webrtc.RTCActionType;
import com.dena.mirrorman.webrtc.RTCManager;
import com.dena.mirrorman.webrtc.RTCSignalingConnectionState;
import jf.p0;
import jo.f0;
import jo.p;
import jo.q;
import kf.x;
import nd.d1;
import nd.f1;
import nd.i1;
import org.greenrobot.eventbus.ThreadMode;
import org.webrtc.PeerConnection;
import org.webrtc.voiceengine.WebRtcAudioTrack;
import org.webrtc.voiceengine.WebRtcAudioUtils;
import pd.t0;
import uo.b1;
import uo.q0;
import uo.r0;
import wn.v;
import xn.r;
import xn.s;

/* loaded from: classes2.dex */
public final class CollabService extends Service implements q0 {
    public static final a G = new a(null);
    public static final int H = 8;
    public final wn.f A;
    public final wn.f B;
    public final wn.f C;
    public final wn.f D;
    public final wn.f E;
    public int F;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ q0 f26189w = r0.b();

    /* renamed from: x  reason: collision with root package name */
    public RTCManager f26190x;

    /* renamed from: y  reason: collision with root package name */
    public final wn.f f26191y;

    /* renamed from: z  reason: collision with root package name */
    public final wn.f f26192z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str) {
            p.h(context, "context");
            p.h(str, ActionLogBase.ACTION);
            Intent intent = new Intent(context, CollabService.class);
            intent.setAction(str);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrorman.service.CollabService$observeStoreValues$1", f = "CollabService.kt", l = {415}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f26193w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26194x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26195y;

        /* renamed from: z  reason: collision with root package name */
        public int f26196z;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0068, B:22:0x0074, B:24:0x007a, B:26:0x008a, B:28:0x009c, B:30:0x00a2), top: B:42:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r11.f26196z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r11.f26195y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r11.f26194x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r11.f26193w
                com.dena.mirrorman.service.CollabService r4 = (com.dena.mirrorman.service.CollabService) r4
                wn.m.b(r12)     // Catch: java.lang.Throwable -> Lb9
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r11
                goto L53
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                wn.m.b(r12)
                com.dena.mirrorman.service.CollabService r12 = com.dena.mirrorman.service.CollabService.this
                nf.h r12 = com.dena.mirrorman.service.CollabService.d(r12)
                wo.x r3 = r12.w()
                com.dena.mirrorman.service.CollabService r12 = com.dena.mirrorman.service.CollabService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> Lb9
                r4 = r12
                r12 = r11
            L3d:
                r12.f26193w = r4     // Catch: java.lang.Throwable -> Lb9
                r12.f26194x = r3     // Catch: java.lang.Throwable -> Lb9
                r12.f26195y = r1     // Catch: java.lang.Throwable -> Lb9
                r12.f26196z = r2     // Catch: java.lang.Throwable -> Lb9
                java.lang.Object r5 = r1.a(r12)     // Catch: java.lang.Throwable -> Lb9
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r10 = r0
                r0 = r12
                r12 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r10
            L53:
                r6 = 0
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lb6
                boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lb6
                if (r12 == 0) goto Lb0
                java.lang.Object r12 = r3.next()     // Catch: java.lang.Throwable -> Lb6
                wn.v r12 = (wn.v) r12     // Catch: java.lang.Throwable -> Lb6
                com.dena.mirrorman.webrtc.RTCManager r12 = com.dena.mirrorman.service.CollabService.g(r5)     // Catch: java.lang.Throwable -> Lb6
                if (r12 == 0) goto Laa
                nf.h r6 = com.dena.mirrorman.service.CollabService.d(r5)     // Catch: java.lang.Throwable -> Lb6
                java.util.List r6 = r6.u()     // Catch: java.lang.Throwable -> Lb6
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lb6
            L74:
                boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lb6
                if (r7 == 0) goto Laa
                java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lb6
                com.dena.mirrorman.net.api.response.user.LiveViewingUser r7 = (com.dena.mirrorman.net.api.response.user.LiveViewingUser) r7     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r8 = r7.getUserId()     // Catch: java.lang.Throwable -> Lb6
                boolean r8 = r12.hasClient(r8)     // Catch: java.lang.Throwable -> Lb6
                if (r8 != 0) goto L74
                kf.x r8 = com.dena.mirrorman.service.CollabService.f(r5)     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r8 = r8.T4()     // Catch: java.lang.Throwable -> Lb6
                java.lang.String r9 = r7.getUserId()     // Catch: java.lang.Throwable -> Lb6
                boolean r8 = jo.p.c(r8, r9)     // Catch: java.lang.Throwable -> Lb6
                if (r8 != 0) goto L74
                com.dena.mirrorman.webrtc.RTCManager r8 = com.dena.mirrorman.service.CollabService.g(r5)     // Catch: java.lang.Throwable -> Lb6
                if (r8 == 0) goto L74
                java.lang.String r7 = r7.getUserId()     // Catch: java.lang.Throwable -> Lb6
                r8.createPeerReceiver(r7)     // Catch: java.lang.Throwable -> Lb6
                goto L74
            Laa:
                r12 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            Lb0:
                wo.n.a(r4, r6)
                wn.v r12 = wn.v.f59242a
                return r12
            Lb6:
                r12 = move-exception
                r3 = r4
                goto Lba
            Lb9:
                r12 = move-exception
            Lba:
                throw r12     // Catch: java.lang.Throwable -> Lbb
            Lbb:
                r0 = move-exception
                wo.n.a(r3, r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.service.CollabService.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.service.CollabService$observeStoreValues$2", f = "CollabService.kt", l = {415, 163}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f26197w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26198x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26199y;

        /* renamed from: z  reason: collision with root package name */
        public int f26200z;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[Catch: all -> 0x009f, TryCatch #1 {all -> 0x009f, blocks: (B:7:0x001a, B:26:0x0081, B:16:0x004e, B:20:0x0060, B:22:0x0069, B:28:0x008b, B:30:0x0091, B:12:0x0034, B:15:0x0049), top: B:41:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0080 -> B:26:0x0081). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r10.f26200z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3a
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r10.f26199y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f26198x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f26197w
                com.dena.mirrorman.service.CollabService r5 = (com.dena.mirrorman.service.CollabService) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L9f
                r11 = r5
                r5 = r10
                goto L81
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                java.lang.Object r1 = r10.f26199y
                wo.k r1 = (wo.k) r1
                java.lang.Object r4 = r10.f26198x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r10.f26197w
                com.dena.mirrorman.service.CollabService r5 = (com.dena.mirrorman.service.CollabService) r5
                wn.m.b(r11)     // Catch: java.lang.Throwable -> L9f
                r6 = r5
                r5 = r10
                goto L60
            L3a:
                wn.m.b(r11)
                com.dena.mirrorman.service.CollabService r11 = com.dena.mirrorman.service.CollabService.this
                nf.h r11 = com.dena.mirrorman.service.CollabService.d(r11)
                wo.x r4 = r11.B()
                com.dena.mirrorman.service.CollabService r11 = com.dena.mirrorman.service.CollabService.this
                wo.k r1 = r4.iterator()     // Catch: java.lang.Throwable -> L9f
                r5 = r10
            L4e:
                r5.f26197w = r11     // Catch: java.lang.Throwable -> L9f
                r5.f26198x = r4     // Catch: java.lang.Throwable -> L9f
                r5.f26199y = r1     // Catch: java.lang.Throwable -> L9f
                r5.f26200z = r3     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L9f
                if (r6 != r0) goto L5d
                return r0
            L5d:
                r9 = r6
                r6 = r11
                r11 = r9
            L60:
                r7 = 0
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L9f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L9f
                if (r11 == 0) goto L99
                java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L9f
                wn.v r11 = (wn.v) r11     // Catch: java.lang.Throwable -> L9f
                r7 = 1000(0x3e8, double:4.94E-321)
                r5.f26197w = r6     // Catch: java.lang.Throwable -> L9f
                r5.f26198x = r4     // Catch: java.lang.Throwable -> L9f
                r5.f26199y = r1     // Catch: java.lang.Throwable -> L9f
                r5.f26200z = r2     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r11 = uo.b1.a(r7, r5)     // Catch: java.lang.Throwable -> L9f
                if (r11 != r0) goto L80
                return r0
            L80:
                r11 = r6
            L81:
                nf.h r6 = com.dena.mirrorman.service.CollabService.d(r11)     // Catch: java.lang.Throwable -> L9f
                jf.h r6 = r6.q()     // Catch: java.lang.Throwable -> L9f
                if (r6 == 0) goto L4e
                com.dena.mirrorman.webrtc.RTCManager r7 = com.dena.mirrorman.service.CollabService.g(r11)     // Catch: java.lang.Throwable -> L9f
                if (r7 == 0) goto L4e
                java.lang.String r6 = r6.i()     // Catch: java.lang.Throwable -> L9f
                r7.createInitiator(r6)     // Catch: java.lang.Throwable -> L9f
                goto L4e
            L99:
                wo.n.a(r4, r7)
                wn.v r11 = wn.v.f59242a
                return r11
            L9f:
                r11 = move-exception
                throw r11     // Catch: java.lang.Throwable -> La1
            La1:
                r0 = move-exception
                wo.n.a(r4, r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.service.CollabService.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.service.CollabService$observeStoreValues$3", f = "CollabService.kt", l = {415}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f26201w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26202x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26203y;

        /* renamed from: z  reason: collision with root package name */
        public int f26204z;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:17:0x0054, B:19:0x005c), top: B:30:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.f26204z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r8.f26203y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r8.f26202x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r8.f26201w
                com.dena.mirrorman.service.CollabService r4 = (com.dena.mirrorman.service.CollabService) r4
                wn.m.b(r9)     // Catch: java.lang.Throwable -> L74
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L53
            L20:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L28:
                wn.m.b(r9)
                com.dena.mirrorman.service.CollabService r9 = com.dena.mirrorman.service.CollabService.this
                nf.h r9 = com.dena.mirrorman.service.CollabService.d(r9)
                wo.x r3 = r9.D()
                com.dena.mirrorman.service.CollabService r9 = com.dena.mirrorman.service.CollabService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L74
                r4 = r9
                r9 = r8
            L3d:
                r9.f26201w = r4     // Catch: java.lang.Throwable -> L74
                r9.f26202x = r3     // Catch: java.lang.Throwable -> L74
                r9.f26203y = r1     // Catch: java.lang.Throwable -> L74
                r9.f26204z = r2     // Catch: java.lang.Throwable -> L74
                java.lang.Object r5 = r1.a(r9)     // Catch: java.lang.Throwable -> L74
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r7 = r0
                r0 = r9
                r9 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L53:
                r6 = 0
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L71
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L71
                if (r9 == 0) goto L6b
                java.lang.Object r9 = r3.next()     // Catch: java.lang.Throwable -> L71
                jf.k r9 = (jf.k) r9     // Catch: java.lang.Throwable -> L71
                com.dena.mirrorman.service.CollabService.h(r5, r9)     // Catch: java.lang.Throwable -> L71
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L6b:
                wo.n.a(r4, r6)
                wn.v r9 = wn.v.f59242a
                return r9
            L71:
                r9 = move-exception
                r3 = r4
                goto L75
            L74:
                r9 = move-exception
            L75:
                throw r9     // Catch: java.lang.Throwable -> L76
            L76:
                r0 = move-exception
                wo.n.a(r3, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.service.CollabService.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.service.CollabService$observeStoreValues$4", f = "CollabService.kt", l = {415}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f26205w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26206x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26207y;

        /* renamed from: z  reason: collision with root package name */
        public int f26208z;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:16:0x0053, B:18:0x005c, B:21:0x006d, B:23:0x007f), top: B:38:0x0053 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:38:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r12.f26208z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r12.f26207y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r12.f26206x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r12.f26205w
                com.dena.mirrorman.service.CollabService r4 = (com.dena.mirrorman.service.CollabService) r4
                wn.m.b(r13)     // Catch: java.lang.Throwable -> L91
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r12
                goto L53
            L20:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L28:
                wn.m.b(r13)
                com.dena.mirrorman.service.CollabService r13 = com.dena.mirrorman.service.CollabService.this
                nf.h r13 = com.dena.mirrorman.service.CollabService.d(r13)
                wo.x r3 = r13.C()
                com.dena.mirrorman.service.CollabService r13 = com.dena.mirrorman.service.CollabService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L91
                r4 = r13
                r13 = r12
            L3d:
                r13.f26205w = r4     // Catch: java.lang.Throwable -> L91
                r13.f26206x = r3     // Catch: java.lang.Throwable -> L91
                r13.f26207y = r1     // Catch: java.lang.Throwable -> L91
                r13.f26208z = r2     // Catch: java.lang.Throwable -> L91
                java.lang.Object r5 = r1.a(r13)     // Catch: java.lang.Throwable -> L91
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r11 = r0
                r0 = r13
                r13 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r11
            L53:
                java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L8e
                boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L8e
                r6 = 0
                if (r13 == 0) goto L88
                java.lang.Object r13 = r3.next()     // Catch: java.lang.Throwable -> L8e
                wn.v r13 = (wn.v) r13     // Catch: java.lang.Throwable -> L8e
                nf.h r13 = com.dena.mirrorman.service.CollabService.d(r5)     // Catch: java.lang.Throwable -> L8e
                jf.h r13 = r13.q()     // Catch: java.lang.Throwable -> L8e
                if (r13 != 0) goto L6d
                goto L82
            L6d:
                hf.e r7 = com.dena.mirrorman.service.CollabService.e(r5)     // Catch: java.lang.Throwable -> L8e
                java.lang.String r8 = "COLLAB"
                r9 = 0
                r10 = 2
                com.dena.mirrorman.net.bcsvr.BcsvrChannel r6 = hf.e.e(r7, r8, r9, r10, r6)     // Catch: java.lang.Throwable -> L8e
                boolean r6 = r6.isConnected()     // Catch: java.lang.Throwable -> L8e
                if (r6 != 0) goto L82
                com.dena.mirrorman.service.CollabService.a(r5, r13)     // Catch: java.lang.Throwable -> L8e
            L82:
                r13 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L88:
                wo.n.a(r4, r6)
                wn.v r13 = wn.v.f59242a
                return r13
            L8e:
                r13 = move-exception
                r3 = r4
                goto L92
            L91:
                r13 = move-exception
            L92:
                throw r13     // Catch: java.lang.Throwable -> L93
            L93:
                r0 = move-exception
                wo.n.a(r3, r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.service.CollabService.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.service.CollabService$observeStoreValues$5", f = "CollabService.kt", l = {415}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f26209w;

        /* renamed from: x  reason: collision with root package name */
        public Object f26210x;

        /* renamed from: y  reason: collision with root package name */
        public Object f26211y;

        /* renamed from: z  reason: collision with root package name */
        public int f26212z;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:17:0x0054, B:19:0x005c, B:21:0x0078, B:23:0x007e, B:25:0x0086), top: B:36:0x0054 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:16:0x0053). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f26212z
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                java.lang.Object r1 = r9.f26211y
                wo.k r1 = (wo.k) r1
                java.lang.Object r3 = r9.f26210x
                wo.x r3 = (wo.x) r3
                java.lang.Object r4 = r9.f26209w
                com.dena.mirrorman.service.CollabService r4 = (com.dena.mirrorman.service.CollabService) r4
                wn.m.b(r10)     // Catch: java.lang.Throwable -> L98
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                goto L53
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                wn.m.b(r10)
                com.dena.mirrorman.service.CollabService r10 = com.dena.mirrorman.service.CollabService.this
                nf.c r10 = com.dena.mirrorman.service.CollabService.b(r10)
                wo.x r3 = r10.G0()
                com.dena.mirrorman.service.CollabService r10 = com.dena.mirrorman.service.CollabService.this
                wo.k r1 = r3.iterator()     // Catch: java.lang.Throwable -> L98
                r4 = r10
                r10 = r9
            L3d:
                r10.f26209w = r4     // Catch: java.lang.Throwable -> L98
                r10.f26210x = r3     // Catch: java.lang.Throwable -> L98
                r10.f26211y = r1     // Catch: java.lang.Throwable -> L98
                r10.f26212z = r2     // Catch: java.lang.Throwable -> L98
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L98
                if (r5 != r0) goto L4c
                return r0
            L4c:
                r8 = r0
                r0 = r10
                r10 = r5
                r5 = r4
                r4 = r3
                r3 = r1
                r1 = r8
            L53:
                r6 = 0
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L95
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L95
                if (r10 == 0) goto L8f
                java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L95
                wn.k r10 = (wn.k) r10     // Catch: java.lang.Throwable -> L95
                java.lang.Object r6 = r10.a()     // Catch: java.lang.Throwable -> L95
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L95
                java.lang.Object r10 = r10.b()     // Catch: java.lang.Throwable -> L95
                java.lang.Number r10 = (java.lang.Number) r10     // Catch: java.lang.Throwable -> L95
                int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCManager r7 = com.dena.mirrorman.service.CollabService.g(r5)     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.util.HashMap r7 = r7.getClients()     // Catch: java.lang.Throwable -> L95
                if (r7 == 0) goto L89
                java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L95
                com.dena.mirrorman.webrtc.RTCClient r6 = (com.dena.mirrorman.webrtc.RTCClient) r6     // Catch: java.lang.Throwable -> L95
                if (r6 == 0) goto L89
                r6.changeVolume(r10)     // Catch: java.lang.Throwable -> L95
            L89:
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r4 = r5
                goto L3d
            L8f:
                wo.n.a(r4, r6)
                wn.v r10 = wn.v.f59242a
                return r10
            L95:
                r10 = move-exception
                r3 = r4
                goto L99
            L98:
                r10 = move-exception
            L99:
                throw r10     // Catch: java.lang.Throwable -> L9a
            L9a:
                r0 = move-exception
                wo.n.a(r3, r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.service.CollabService.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "com.dena.mirrorman.service.CollabService$onEvent$1", f = "CollabService.kt", l = {261}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ String A;

        /* renamed from: w  reason: collision with root package name */
        public int f26213w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ t0.a f26214x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f26215y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ CollabService f26216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(t0.a aVar, String str, CollabService collabService, String str2, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f26214x = aVar;
            this.f26215y = str;
            this.f26216z = collabService;
            this.A = str2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f26214x, this.f26215y, this.f26216z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f26213w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f26213w = 1;
                if (b1.a(1000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            if (p.c(this.f26214x.b(), this.f26215y)) {
                g9.a.g("COLLAB CONNECTED OWNER " + this.f26214x.b());
                this.f26216z.k().j(this.A, true);
            } else {
                g9.a.g("COLLAB CONNECTED PEER  " + this.f26214x.b());
                this.f26216z.k().j(this.A, false);
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26217w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26218x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26219y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26217w = componentCallbacks;
            this.f26218x = aVar;
            this.f26219y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            ComponentCallbacks componentCallbacks = this.f26217w;
            return gq.a.a(componentCallbacks).c(f0.b(od.f.class), this.f26218x, this.f26219y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<nf.h> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26220w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26221x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26222y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26220w = componentCallbacks;
            this.f26221x = aVar;
            this.f26222y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.h, java.lang.Object] */
        @Override // io.a
        public final nf.h invoke() {
            ComponentCallbacks componentCallbacks = this.f26220w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.h.class), this.f26221x, this.f26222y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<hf.e> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26223w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26224x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26225y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26223w = componentCallbacks;
            this.f26224x = aVar;
            this.f26225y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.e, java.lang.Object] */
        @Override // io.a
        public final hf.e invoke() {
            ComponentCallbacks componentCallbacks = this.f26223w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.e.class), this.f26224x, this.f26225y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26226w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26227x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26228y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26226w = componentCallbacks;
            this.f26227x = aVar;
            this.f26228y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f26226w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f26227x, this.f26228y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26229w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26230x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26231y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26229w = componentCallbacks;
            this.f26230x = aVar;
            this.f26231y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f26229w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f26230x, this.f26231y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26232w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26233x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26234y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26232w = componentCallbacks;
            this.f26233x = aVar;
            this.f26234y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f26232w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.c.class), this.f26233x, this.f26234y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f26235w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f26236x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f26237y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f26235w = componentCallbacks;
            this.f26236x = aVar;
            this.f26237y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f26235w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f26236x, this.f26237y);
        }
    }

    public CollabService() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.f26191y = wn.g.b(iVar, new h(this, null, null));
        this.f26192z = wn.g.b(iVar, new i(this, null, null));
        this.A = wn.g.b(iVar, new j(this, null, null));
        this.B = wn.g.b(iVar, new k(this, null, null));
        this.C = wn.g.b(iVar, new l(this, null, null));
        this.D = wn.g.b(iVar, new m(this, null, null));
        this.E = wn.g.b(iVar, new n(this, null, null));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f26189w.getCoroutineContext();
    }

    public final boolean i(jf.h hVar) {
        BcsvrChannel d10 = n().d("COLLAB", true);
        if (d10.isConnected()) {
            d10.disconnectNoThrow();
        }
        return d10.connectNoThrow(new BcsvrAddress(hVar.d(), hVar.f(), hVar.e()));
    }

    public final nf.c j() {
        return (nf.c) this.D.getValue();
    }

    public final od.f k() {
        return (od.f) this.f26191y.getValue();
    }

    public final nf.h l() {
        return (nf.h) this.f26192z.getValue();
    }

    public final MRLogger m() {
        return (MRLogger) this.B.getValue();
    }

    public final hf.e n() {
        return (hf.e) this.A.getValue();
    }

    public final i1 o() {
        return (i1) this.E.getValue();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.c cVar) {
        jf.h q10;
        String i10;
        RTCManager rTCManager;
        p.h(cVar, "event");
        g9.a.g(" COLLAB BcsvrEvent.CollabAccepted key = " + cVar.b());
        if (!p.c(cVar.b(), "COLLAB") || (q10 = l().q()) == null || (i10 = q10.i()) == null) {
            return;
        }
        String a10 = cVar.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" COLLAB BcsvrEvent.CollabAccepted ownerUserId = ");
        sb2.append(i10);
        sb2.append("  acceptedUserId = ");
        sb2.append(a10);
        sb2.append(" isConnected = ");
        RTCManager rTCManager2 = this.f26190x;
        boolean z10 = true;
        sb2.append(rTCManager2 != null && rTCManager2.isConnected(i10));
        g9.a.g(sb2.toString());
        RTCManager rTCManager3 = this.f26190x;
        if (!(rTCManager3 != null && rTCManager3.isConnected(i10)) && p.c(p().T4(), a10)) {
            g9.a.g(" COLLAB LIVE BCSVR11_COLLAB_ACCEPT " + a10);
            k().q(jf.j.ACCEPTED);
            if ((!l().E() || o().a().d()) && (rTCManager = this.f26190x) != null) {
                rTCManager.createInitiator(i10);
                return;
            }
            return;
        }
        RTCManager rTCManager4 = this.f26190x;
        if (rTCManager4 == null || !rTCManager4.isConnected(i10)) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        g9.a.g("COLLAB PEER CONNECTION ownerUserId START " + a10);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        dq.c.c().p(this);
        j.e r10 = new j.e(this, getString(f1.f41987r)).D(d1.f41955r).v(BitmapFactory.decodeResource(getResources(), d1.f41954p)).r(getString(f1.f41963a));
        int i10 = f1.text_collab_notification_title;
        Object[] objArr = new Object[1];
        jf.h q10 = l().q();
        objArr[0] = (q10 == null || (r3 = q10.h()) == null) ? "" : "";
        j.e q11 = r10.q(getString(i10, objArr));
        p.g(q11, "Builder(this, getString(…abInfo?.ownerName ?: \"\"))");
        startForeground(207, q11.c());
        q();
    }

    @Override // android.app.Service
    public void onDestroy() {
        dq.c.c().r(this);
        if (l().s().h()) {
            s(jf.k.ON_SERVICE_DESTROY);
        }
        r0.d(this, null, 1, null);
        k().k();
        super.onDestroy();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(t0.a aVar) {
        jf.h q10;
        p.h(aVar, "event");
        if (p.c(aVar.a(), "COLLAB") && (q10 = l().q()) != null) {
            uo.l.d(this, null, null, new g(aVar, q10.i(), this, q10.g(), null), 3, null);
            k().q(jf.j.CONNECTED);
            this.F = 0;
            if (l().E()) {
                k().f(aVar.b());
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        jf.h q10;
        String i12;
        RTCManager rTCManager;
        jf.h q11;
        String i13;
        RTCManager rTCManager2;
        String i14;
        RTCManager rTCManager3;
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        if (action == null) {
            stopSelf(i11);
            return 2;
        }
        switch (action.hashCode()) {
            case -1717577763:
                if (action.equals("REQUEST_COLLAB")) {
                    r();
                    break;
                }
                break;
            case -307521935:
                if (action.equals("INVITED_COLLAB")) {
                    r();
                    jf.h q12 = l().q();
                    if ((q12 != null ? q12.c() : null) == CollabType.CALL && (q10 = l().q()) != null && (i12 = q10.i()) != null && (rTCManager = this.f26190x) != null) {
                        rTCManager.createInitiator(i12);
                        break;
                    }
                }
                break;
            case 945671856:
                if (action.equals("INTENT_ACTION_INVITED_COLLAB_IN_STREAMING")) {
                    r();
                    jf.h q13 = l().q();
                    if ((q13 != null ? q13.c() : null) == CollabType.LIVE && (q11 = l().q()) != null && (i13 = q11.i()) != null && (rTCManager2 = this.f26190x) != null) {
                        rTCManager2.createInitiator(i13);
                        break;
                    }
                }
                break;
            case 1182408585:
                if (action.equals("INTENT_ACTION_MATCHING_COLLAB")) {
                    r();
                    jf.h q14 = l().q();
                    if (q14 != null && (i14 = q14.i()) != null && (rTCManager3 = this.f26190x) != null) {
                        rTCManager3.createInitiator(i14);
                        break;
                    }
                }
                break;
        }
        return 2;
    }

    public final x p() {
        return (x) this.C.getValue();
    }

    public final void q() {
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
        uo.l.d(this, null, null, new f(null), 3, null);
    }

    public final void r() {
        jf.h q10 = l().q();
        if (q10 == null) {
            return;
        }
        RTCManager rTCManager = this.f26190x;
        if (rTCManager != null) {
            RTCManager.close$default(rTCManager, false, 1, null);
        }
        Context applicationContext = getApplicationContext();
        p.g(applicationContext, "applicationContext");
        this.f26190x = new RTCManager("COLLAB", applicationContext, Referer.LIVE_VIEW, q10.g(), q10.h(), q10.i(), q10.j(), q10.k());
        if (!l().E()) {
            WebRtcAudioUtils.setWebRtcBasedNoiseSuppressor(false);
            WebRtcAudioUtils.setWebRtcBasedAutomaticGainControl(false);
            WebRtcAudioUtils.setWebRtcBasedAcousticEchoCanceler(false);
            WebRtcAudioTrack.setAudioTrackUsageAttribute(2);
        }
        String rawValue = (i(q10) ? RTCSignalingConnectionState.CONNECTED : RTCSignalingConnectionState.FAILED).getRawValue();
        MRLogger m10 = m();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(RTCActionType.SIGNALING_CONNECTION_STATE.getRawValue());
        builder.setTargetType(MRLog.TARGET_TYPE_USER);
        builder.setTargetId(q10.i());
        builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, q10.g()), wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, rawValue)));
        m10.sendLog(builder.build());
        k().q(jf.j.INITIALIZED);
    }

    public final void s(jf.k kVar) {
        String g10;
        g9.a.g("stopCollab :" + kVar.name());
        boolean z10 = l().E() && kVar.c();
        jf.h q10 = l().q();
        if (z10 && q10 != null) {
            if (l().G()) {
                return;
            }
            k().m(new p0(q10.g(), q10.h(), false));
            return;
        }
        n().c("COLLAB");
        if (q10 != null && (g10 = q10.g()) != null) {
            RTCManager rTCManager = this.f26190x;
            if (rTCManager != null && rTCManager.hasClients()) {
                k().e(g10, kVar);
            } else {
                k().d(g10, kVar);
            }
        }
        RTCManager rTCManager2 = this.f26190x;
        if (rTCManager2 != null) {
            RTCManager.close$default(rTCManager2, false, 1, null);
        }
        this.f26190x = null;
        stopSelf();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void onEvent(t0.b bVar) {
        jf.h q10;
        jf.k kVar;
        p.h(bVar, "event");
        if (p.c(bVar.a(), "COLLAB") && (q10 = l().q()) != null) {
            if (p.c(bVar.c(), q10.i())) {
                g9.a.g("COLLAB " + bVar.b() + " Owner " + bVar.c());
                RTCManager rTCManager = this.f26190x;
                if (rTCManager != null) {
                    rTCManager.disconnect(bVar.c());
                }
                if (bVar.b() == PeerConnection.IceConnectionState.FAILED) {
                    kVar = jf.k.ICE_CONNECTION_FAILED;
                } else {
                    kVar = jf.k.ICE_CONNECTION_CLOSED;
                }
                s(kVar);
            } else {
                g9.a.g("COLLAB " + bVar.b() + " PEER " + bVar.c());
                if (bVar.b() == PeerConnection.IceConnectionState.FAILED && this.F < 3) {
                    RTCManager rTCManager2 = this.f26190x;
                    if (rTCManager2 != null) {
                        rTCManager2.createPeerReceiver(bVar.c());
                    }
                    MRLogger m10 = m();
                    MRLog.Companion companion = MRLog.Companion;
                    MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHILD_COLLAB_FAILED);
                    builder.setTargetId(q10.i());
                    builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, String.valueOf(this.F))));
                    m10.sendLog(builder.build());
                    this.F++;
                } else {
                    RTCManager rTCManager3 = this.f26190x;
                    if (rTCManager3 != null) {
                        rTCManager3.disconnect(bVar.c());
                    }
                }
            }
            if (l().E()) {
                k().g(l().u(), bVar.c());
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.d dVar) {
        p.h(dVar, "event");
        if (p.c(dVar.a(), "COLLAB")) {
            String canceledUserId = dVar.b().getCanceledUserId();
            if (p.c(p().T4(), canceledUserId)) {
                RTCManager rTCManager = this.f26190x;
                if (rTCManager != null) {
                    rTCManager.rejectUser(canceledUserId);
                }
                s(jf.k.HANDLE_COLLAB_CANCEL);
                return;
            }
            RTCManager rTCManager2 = this.f26190x;
            if (rTCManager2 != null) {
                rTCManager2.disconnect(canceledUserId);
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.n nVar) {
        RTCManager rTCManager;
        p.h(nVar, "event");
        if (!p.c(nVar.a(), "COLLAB") || p.c(p().T4(), nVar.c()) || (rTCManager = this.f26190x) == null) {
            return;
        }
        rTCManager.receiveMessage(nVar.c(), nVar.b());
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(l.f fVar) {
        p.h(fVar, "event");
        if (p.c(fVar.a(), "COLLAB") && !l().E()) {
            String userId = fVar.b().getUserId();
            if (l().E()) {
                k().g(l().u(), userId);
            }
            if (p.c(p().T4(), userId)) {
                s(jf.k.HANDLE_COLLAB_CLOSE);
                return;
            }
            RTCManager rTCManager = this.f26190x;
            if (rTCManager != null) {
                rTCManager.disconnect(userId);
            }
        }
    }
}
