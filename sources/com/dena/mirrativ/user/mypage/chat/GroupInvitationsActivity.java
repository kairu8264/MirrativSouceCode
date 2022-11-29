package com.dena.mirrativ.user.mypage.chat;

import ae.o;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.user.mypage.MyPageActivity;
import com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity;
import com.dena.mirrativ.user.userprofile.UserProfileActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserBasicParams;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import hf.j0;
import hf.r;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jo.f0;
import jo.p;
import jo.q;
import of.n;
import tc.g1;
import tc.v0;
import tc.w0;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xn.t;

/* loaded from: classes2.dex */
public class GroupInvitationsActivity extends e.b implements AbsListView.OnScrollListener, q0 {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f24624b0 = new a(null);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f24625c0 = 8;
    public o P;
    public ge.j Q;
    public View T;
    public g1<UserBasicWithGraphParams> U;
    public String V;
    public v0 W;
    public final wn.f X;
    public final wn.f Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f24626a0;
    public final /* synthetic */ q0 O = r0.b();
    public String R = Referer.Chat.INVITATIONS;
    public Set<String> S = new LinkedHashSet();

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, ge.j jVar) {
            p.h(context, "context");
            Intent intent = new Intent(context, GroupInvitationsActivity.class);
            intent.putExtra("EXTRA_THREAD", jVar);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity$fetchGroupUsers$1", f = "GroupInvitationsActivity.kt", l = {353}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24627w;

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

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24627w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest X3 = GroupInvitationsActivity.this.X3();
                    String str = GroupInvitationsActivity.this.R;
                    ge.j jVar = GroupInvitationsActivity.this.Q;
                    p.e(jVar);
                    String f10 = jVar.f();
                    this.f24627w = 1;
                    obj = X3.getGroupUsers(str, f10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                List<UserBasicWithGraphParams> users = ((UsersResponse) obj).getUsers();
                GroupInvitationsActivity groupInvitationsActivity = GroupInvitationsActivity.this;
                ArrayList arrayList = new ArrayList(t.u(users, 10));
                for (UserBasicWithGraphParams userBasicWithGraphParams : users) {
                    g1 g1Var = groupInvitationsActivity.U;
                    if (g1Var == null) {
                        p.v("candidatesAdapter");
                        g1Var = null;
                    }
                    g1Var.remove(userBasicWithGraphParams);
                    arrayList.add(userBasicWithGraphParams.getUserId());
                }
                GroupInvitationsActivity groupInvitationsActivity2 = GroupInvitationsActivity.this;
                ge.j jVar2 = groupInvitationsActivity2.Q;
                p.e(jVar2);
                groupInvitationsActivity2.Q = jVar2.q(arrayList);
                GroupInvitationsActivity.this.m4();
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    n.f45411a.l(GroupInvitationsActivity.this, error);
                } else {
                    n nVar = n.f45411a;
                    GroupInvitationsActivity groupInvitationsActivity3 = GroupInvitationsActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = GroupInvitationsActivity.this.getString(nc.i.f41875e);
                        p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(groupInvitationsActivity3, message, false);
                }
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity$onClickSubmit$1", f = "GroupInvitationsActivity.kt", l = {217}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24629w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<String> f24631y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<String> list, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f24631y = list;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f24631y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[Catch: all -> 0x0014, Exception -> 0x0017, TryCatch #1 {Exception -> 0x0017, blocks: (B:5:0x000e, B:27:0x0057, B:29:0x0068, B:31:0x0077, B:33:0x0098, B:35:0x00a0, B:37:0x00b0, B:41:0x00da, B:32:0x008b, B:14:0x0025, B:17:0x003b, B:20:0x0042, B:24:0x004e), top: B:57:0x000a, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements g1.c<UserBasicWithGraphParams> {
        public d() {
        }

        @Override // tc.g1.c
        /* renamed from: b */
        public void a(UserBasicWithGraphParams userBasicWithGraphParams) {
            if (userBasicWithGraphParams == null) {
                return;
            }
            if (p.c(GroupInvitationsActivity.this.V3().x(), userBasicWithGraphParams.getUserId())) {
                GroupInvitationsActivity groupInvitationsActivity = GroupInvitationsActivity.this;
                groupInvitationsActivity.startActivity(MyPageActivity.P.a(groupInvitationsActivity));
                return;
            }
            GroupInvitationsActivity groupInvitationsActivity2 = GroupInvitationsActivity.this;
            groupInvitationsActivity2.startActivity(UserProfileActivity.f24944g0.a(groupInvitationsActivity2, userBasicWithGraphParams.getUserId(), GroupInvitationsActivity.this.R));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements g1.a<UserBasicWithGraphParams> {
        public e() {
        }

        @Override // tc.g1.a
        /* renamed from: c */
        public void a(UserBasicWithGraphParams userBasicWithGraphParams) {
            GroupInvitationsActivity.this.f4(userBasicWithGraphParams);
        }

        @Override // tc.g1.a
        /* renamed from: d */
        public void b(UserBasicWithGraphParams userBasicWithGraphParams) {
            GroupInvitationsActivity groupInvitationsActivity = GroupInvitationsActivity.this;
            p.e(userBasicWithGraphParams);
            groupInvitationsActivity.R3(userBasicWithGraphParams);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements w0 {
        public f() {
        }

        @Override // tc.w0
        public void a(UserBasicParams userBasicParams) {
            p.h(userBasicParams, "item");
            GroupInvitationsActivity.this.R3(userBasicParams);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity$search$1", f = "GroupInvitationsActivity.kt", l = {303}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24635w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24637y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24638z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, int i10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f24637y = str;
            this.f24638z = i10;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f24637y, this.f24638z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24635w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest X3 = GroupInvitationsActivity.this.X3();
                    String str = GroupInvitationsActivity.this.R;
                    String str2 = this.f24637y;
                    int i11 = this.f24638z;
                    Integer d10 = i11 > 1 ? co.b.d(i11) : null;
                    this.f24635w = 1;
                    obj = MRRequest.DefaultImpls.getSearchUsers$default(X3, str, str2, d10, null, null, this, 24, null);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                UsersResponse usersResponse = (UsersResponse) obj;
                GroupInvitationsActivity.this.W3().f(usersResponse.getCurrentPage(), usersResponse.getNextPage());
                if (GroupInvitationsActivity.this.W3().a()) {
                    GroupInvitationsActivity.this.h4();
                }
                GroupInvitationsActivity.this.P3(usersResponse.getUsers());
            } catch (Exception e10) {
                GroupInvitationsActivity.this.W3().e(this.f24638z, false);
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    n.f45411a.l(GroupInvitationsActivity.this, error);
                } else {
                    n nVar = n.f45411a;
                    GroupInvitationsActivity groupInvitationsActivity = GroupInvitationsActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = GroupInvitationsActivity.this.getString(nc.i.f41875e);
                        p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(groupInvitationsActivity, message, false);
                }
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24639w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24640x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24641y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24639w = componentCallbacks;
            this.f24640x = aVar;
            this.f24641y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f24639w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f24640x, this.f24641y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<hf.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24642w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24643x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24644y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24642w = componentCallbacks;
            this.f24643x = aVar;
            this.f24644y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final hf.v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24642w;
            return gq.a.a(componentCallbacks).c(f0.b(hf.v0.class), this.f24643x, this.f24644y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24645w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24646x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24647y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24645w = componentCallbacks;
            this.f24646x = aVar;
            this.f24647y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.r, java.lang.Object] */
        @Override // io.a
        public final r invoke() {
            ComponentCallbacks componentCallbacks = this.f24645w;
            return gq.a.a(componentCallbacks).c(f0.b(r.class), this.f24646x, this.f24647y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends q implements io.a<j0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24648w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24649x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24650y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24648w = componentCallbacks;
            this.f24649x = aVar;
            this.f24650y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.j0] */
        @Override // io.a
        public final j0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24648w;
            return gq.a.a(componentCallbacks).c(f0.b(j0.class), this.f24649x, this.f24650y);
        }
    }

    public GroupInvitationsActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.X = wn.g.b(iVar, new h(this, null, null));
        this.Y = wn.g.b(iVar, new i(this, null, null));
        this.Z = wn.g.b(iVar, new j(this, null, null));
        this.f24626a0 = wn.g.b(iVar, new k(this, null, null));
    }

    public static final void Z3(GroupInvitationsActivity groupInvitationsActivity, View view) {
        p.h(groupInvitationsActivity, "this$0");
        groupInvitationsActivity.finish();
    }

    public static final boolean a4(GroupInvitationsActivity groupInvitationsActivity, MenuItem menuItem) {
        p.h(groupInvitationsActivity, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_close) {
            groupInvitationsActivity.onBackPressed();
            return true;
        }
        return false;
    }

    public static final void b4(GroupInvitationsActivity groupInvitationsActivity, View view) {
        p.h(groupInvitationsActivity, "this$0");
        groupInvitationsActivity.finish();
    }

    public static final boolean c4(GroupInvitationsActivity groupInvitationsActivity, TextView textView, int i10, KeyEvent keyEvent) {
        p.h(groupInvitationsActivity, "this$0");
        if (i10 == 3) {
            o oVar = groupInvitationsActivity.P;
            if (oVar == null) {
                p.v("binding");
                oVar = null;
            }
            String obj = oVar.G.getText().toString();
            if (obj.length() > 0) {
                of.j.f45405a.b(groupInvitationsActivity);
            }
            groupInvitationsActivity.k4(obj, true);
        }
        return true;
    }

    public static final void d4(GroupInvitationsActivity groupInvitationsActivity, AdapterView adapterView, View view, int i10, long j10) {
        p.h(groupInvitationsActivity, "this$0");
        try {
            g1<UserBasicWithGraphParams> g1Var = groupInvitationsActivity.U;
            g1<UserBasicWithGraphParams> g1Var2 = null;
            if (g1Var == null) {
                p.v("candidatesAdapter");
                g1Var = null;
            }
            UserBasicWithGraphParams userBasicWithGraphParams = (UserBasicWithGraphParams) g1Var.getItem(i10);
            if (userBasicWithGraphParams == null) {
                return;
            }
            g1<UserBasicWithGraphParams> g1Var3 = groupInvitationsActivity.U;
            if (g1Var3 == null) {
                p.v("candidatesAdapter");
            } else {
                g1Var2 = g1Var3;
            }
            if (g1Var2.k(userBasicWithGraphParams.getUserId())) {
                groupInvitationsActivity.R3(userBasicWithGraphParams);
            } else {
                groupInvitationsActivity.f4(userBasicWithGraphParams);
            }
        } catch (IndexOutOfBoundsException e10) {
            g9.a.c(e10);
        }
    }

    public static final void e4(GroupInvitationsActivity groupInvitationsActivity, View view) {
        p.h(groupInvitationsActivity, "this$0");
        groupInvitationsActivity.g4();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b1, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f A[EDGE_INSN: B:51:0x007f->B:28:0x007f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P3(java.util.List<? extends com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams> r9) {
        /*
            r8 = this;
            ge.j r0 = r8.Q
            if (r0 == 0) goto L18
            jo.p.e(r0)
            java.util.List r0 = r0.h()
            if (r0 != 0) goto Le
            goto L18
        Le:
            ge.j r0 = r8.Q
            jo.p.e(r0)
            java.util.List r0 = r0.h()
            goto L24
        L18:
            hf.v0 r0 = r8.V3()
            java.lang.String r0 = r0.x()
            java.util.Set r0 = xn.s0.a(r0)
        L24:
            java.util.Iterator r9 = r9.iterator()
        L28:
            boolean r1 = r9.hasNext()
            java.lang.String r2 = "candidatesAdapter"
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r9.next()
            com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams r1 = (com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams) r1
            java.util.Set<java.lang.String> r6 = r8.S
            java.lang.String r7 = r1.getUserId()
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L28
            ge.j r6 = r8.Q
            if (r6 == 0) goto L5a
            jo.p.e(r6)
            java.lang.String r6 = r6.m()
            java.lang.String r7 = r1.getUserId()
            boolean r6 = jo.p.c(r6, r7)
            if (r6 != 0) goto L28
        L5a:
            if (r0 == 0) goto L67
            java.lang.String r6 = r1.getUserId()
            boolean r6 = r0.contains(r6)
            if (r6 != r4) goto L67
            r3 = r4
        L67:
            if (r3 != 0) goto L28
            java.util.Set<java.lang.String> r3 = r8.S
            java.lang.String r4 = r1.getUserId()
            r3.add(r4)
            tc.g1<com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams> r3 = r8.U
            if (r3 != 0) goto L7a
            jo.p.v(r2)
            goto L7b
        L7a:
            r5 = r3
        L7b:
            r5.add(r1)
            goto L28
        L7f:
            tc.g1<com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams> r9 = r8.U
            if (r9 != 0) goto L87
            jo.p.v(r2)
            r9 = r5
        L87:
            r9.notifyDataSetChanged()
            ae.o r9 = r8.P
            if (r9 != 0) goto L94
            java.lang.String r9 = "binding"
            jo.p.v(r9)
            r9 = r5
        L94:
            androidx.appcompat.widget.AppCompatTextView r9 = r9.C
            tc.g1<com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams> r0 = r8.U
            if (r0 != 0) goto L9e
            jo.p.v(r2)
            goto L9f
        L9e:
            r5 = r0
        L9f:
            int r0 = r5.getCount()
            if (r0 > r4) goto Lb4
            java.lang.String r0 = r8.V
            if (r0 == 0) goto Lb1
            int r0 = r0.length()
            if (r0 != 0) goto Lb0
            goto Lb1
        Lb0:
            r4 = r3
        Lb1:
            if (r4 == 0) goto Lb4
            goto Lb6
        Lb4:
            r3 = 8
        Lb6:
            r9.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.chat.GroupInvitationsActivity.P3(java.util.List):void");
    }

    public final void Q3() {
        o oVar = this.P;
        View view = null;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        if (oVar.B.getFooterViewsCount() < 1) {
            o oVar2 = this.P;
            if (oVar2 == null) {
                p.v("binding");
                oVar2 = null;
            }
            ListView listView = oVar2.B;
            View view2 = this.T;
            if (view2 == null) {
                p.v("footerView");
            } else {
                view = view2;
            }
            listView.addFooterView(view);
        }
    }

    public final void R3(UserBasicParams userBasicParams) {
        g1<UserBasicWithGraphParams> g1Var = this.U;
        o oVar = null;
        if (g1Var == null) {
            p.v("candidatesAdapter");
            g1Var = null;
        }
        g1Var.o(userBasicParams.getUserId());
        g1<UserBasicWithGraphParams> g1Var2 = this.U;
        if (g1Var2 == null) {
            p.v("candidatesAdapter");
            g1Var2 = null;
        }
        g1Var2.notifyDataSetChanged();
        v0 v0Var = this.W;
        if (v0Var == null) {
            p.v("invitedUsersAdapter");
            v0Var = null;
        }
        v0Var.f(userBasicParams);
        v0 v0Var2 = this.W;
        if (v0Var2 == null) {
            p.v("invitedUsersAdapter");
            v0Var2 = null;
        }
        v0Var2.notifyDataSetChanged();
        v0 v0Var3 = this.W;
        if (v0Var3 == null) {
            p.v("invitedUsersAdapter");
            v0Var3 = null;
        }
        if (v0Var3.getItemCount() == 0) {
            o oVar2 = this.P;
            if (oVar2 == null) {
                p.v("binding");
            } else {
                oVar = oVar2;
            }
            oVar.E.setVisibility(8);
        }
        m4();
    }

    public final void S3() {
        List<Fragment> p02 = a3().p0();
        p.g(p02, "supportFragmentManager.fragments");
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

    public final void T3() {
        ge.j jVar = this.Q;
        if (jVar != null) {
            p.e(jVar);
            if (jVar.n()) {
                uo.l.d(this, null, null, new b(null), 3, null);
            }
        }
    }

    public final r U3() {
        return (r) this.Z.getValue();
    }

    public final hf.v0 V3() {
        return (hf.v0) this.Y.getValue();
    }

    public final j0 W3() {
        return (j0) this.f24626a0.getValue();
    }

    public final MRRequest X3() {
        return (MRRequest) this.X.getValue();
    }

    public final void Y3() {
        o oVar = null;
        if (this.Q == null) {
            o oVar2 = this.P;
            if (oVar2 == null) {
                p.v("binding");
                oVar2 = null;
            }
            Toolbar toolbar = oVar2.I.B;
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupInvitationsActivity.Z3(GroupInvitationsActivity.this, view);
                }
            });
            TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
            if (textView == null) {
                return;
            }
            p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
            toolbar.setBackgroundResource(nc.h.f41869c);
            textView.setVisibility(0);
            textView.setText(toolbar.getResources().getString(nc.i.text_chat_makeroom));
            toolbar.inflateMenu(nc.g.group_invitations_menu);
            toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: tc.u0
                @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean a42;
                    a42 = GroupInvitationsActivity.a4(GroupInvitationsActivity.this, menuItem);
                    return a42;
                }
            });
        } else {
            o oVar3 = this.P;
            if (oVar3 == null) {
                p.v("binding");
                oVar3 = null;
            }
            Toolbar toolbar2 = oVar3.I.B;
            toolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupInvitationsActivity.b4(GroupInvitationsActivity.this, view);
                }
            });
            toolbar2.setNavigationIcon(nc.d.f41815v);
            TextView textView2 = (TextView) toolbar2.findViewById(nc.e.B6);
            if (textView2 == null) {
                return;
            }
            p.g(textView2, "findViewById<TextView>(R….toolbar_title) ?: return");
            toolbar2.setBackgroundResource(nc.h.f41869c);
            textView2.setVisibility(0);
            textView2.setText(toolbar2.getResources().getString(nc.i.text_chat_member_add));
        }
        m4();
        o oVar4 = this.P;
        if (oVar4 == null) {
            p.v("binding");
            oVar4 = null;
        }
        oVar4.G.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: tc.t0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) {
                boolean c42;
                c42 = GroupInvitationsActivity.c4(GroupInvitationsActivity.this, textView3, i10, keyEvent);
                return c42;
            }
        });
        o oVar5 = this.P;
        if (oVar5 == null) {
            p.v("binding");
            oVar5 = null;
        }
        ListView listView = oVar5.B;
        g1<UserBasicWithGraphParams> g1Var = this.U;
        if (g1Var == null) {
            p.v("candidatesAdapter");
            g1Var = null;
        }
        listView.setAdapter((ListAdapter) g1Var);
        o oVar6 = this.P;
        if (oVar6 == null) {
            p.v("binding");
            oVar6 = null;
        }
        RecyclerView recyclerView = oVar6.E;
        v0 v0Var = this.W;
        if (v0Var == null) {
            p.v("invitedUsersAdapter");
            v0Var = null;
        }
        recyclerView.setAdapter(v0Var);
        o oVar7 = this.P;
        if (oVar7 == null) {
            p.v("binding");
            oVar7 = null;
        }
        oVar7.E.setLayoutManager(new LinearLayoutManager(this, 0, false));
        o oVar8 = this.P;
        if (oVar8 == null) {
            p.v("binding");
            oVar8 = null;
        }
        oVar8.B.setOnScrollListener(this);
        o oVar9 = this.P;
        if (oVar9 == null) {
            p.v("binding");
            oVar9 = null;
        }
        oVar9.B.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: tc.s0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                GroupInvitationsActivity.d4(GroupInvitationsActivity.this, adapterView, view, i10, j10);
            }
        });
        T3();
        k4("", true);
        o oVar10 = this.P;
        if (oVar10 == null) {
            p.v("binding");
        } else {
            oVar = oVar10;
        }
        oVar.H.setOnClickListener(new View.OnClickListener() { // from class: tc.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupInvitationsActivity.e4(GroupInvitationsActivity.this, view);
            }
        });
    }

    public final void f4(UserBasicParams userBasicParams) {
        if (i4() >= U3().f() - 1) {
            return;
        }
        g1<UserBasicWithGraphParams> g1Var = this.U;
        o oVar = null;
        if (g1Var == null) {
            p.v("candidatesAdapter");
            g1Var = null;
        }
        p.e(userBasicParams);
        g1Var.h(userBasicParams.getUserId());
        g1<UserBasicWithGraphParams> g1Var2 = this.U;
        if (g1Var2 == null) {
            p.v("candidatesAdapter");
            g1Var2 = null;
        }
        g1Var2.notifyDataSetChanged();
        v0 v0Var = this.W;
        if (v0Var == null) {
            p.v("invitedUsersAdapter");
            v0Var = null;
        }
        v0Var.a(userBasicParams);
        v0 v0Var2 = this.W;
        if (v0Var2 == null) {
            p.v("invitedUsersAdapter");
            v0Var2 = null;
        }
        v0Var2.notifyDataSetChanged();
        o oVar2 = this.P;
        if (oVar2 == null) {
            p.v("binding");
        } else {
            oVar = oVar2;
        }
        oVar.E.setVisibility(0);
        m4();
    }

    public final void g4() {
        v0 v0Var = this.W;
        if (v0Var == null) {
            p.v("invitedUsersAdapter");
            v0Var = null;
        }
        List<UserBasicParams> b10 = v0Var.b();
        if (b10.size() == 0) {
            return;
        }
        if (this.Q == null && b10.size() == 1) {
            UserBasicParams userBasicParams = b10.get(0);
            getIntent().putExtra("KEY_RESULT_THREAD", ge.j.G.b(userBasicParams.getUserId(), userBasicParams.getName(), userBasicParams.getProfileImageUrl()));
            setResult(-1, getIntent());
            finish();
            return;
        }
        l4();
        ArrayList arrayList = new ArrayList();
        ge.j jVar = this.Q;
        if (jVar != null) {
            p.e(jVar);
            if (!jVar.n()) {
                ge.j jVar2 = this.Q;
                p.e(jVar2);
                if (jVar2.m() != null) {
                    ge.j jVar3 = this.Q;
                    p.e(jVar3);
                    String m10 = jVar3.m();
                    p.e(m10);
                    arrayList.add(m10);
                }
            }
        }
        for (UserBasicParams userBasicParams2 : b10) {
            arrayList.add(userBasicParams2.getUserId());
        }
        uo.l.d(this, null, null, new c(arrayList, null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final void h4() {
        o oVar = this.P;
        View view = null;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        if (oVar.B.getFooterViewsCount() > 0) {
            o oVar2 = this.P;
            if (oVar2 == null) {
                p.v("binding");
                oVar2 = null;
            }
            ListView listView = oVar2.B;
            View view2 = this.T;
            if (view2 == null) {
                p.v("footerView");
            } else {
                view = view2;
            }
            listView.removeFooterView(view);
        }
    }

    public final int i4() {
        v0 v0Var = this.W;
        if (v0Var == null) {
            p.v("invitedUsersAdapter");
            v0Var = null;
        }
        int itemCount = v0Var.getItemCount();
        ge.j jVar = this.Q;
        int i10 = 1;
        if (jVar != null && jVar.n()) {
            ge.j jVar2 = this.Q;
            p.e(jVar2);
            i10 = jVar2.i() - 1;
        }
        return Math.max(itemCount + i10, 0);
    }

    public final void j4(String str, int i10) {
        if (str == null || W3().d(i10)) {
            return;
        }
        W3().e(i10, true);
        uo.l.d(this, null, null, new g(str, i10, null), 3, null);
    }

    public final void k4(String str, boolean z10) {
        if (!p.c(str, this.V) || z10) {
            W3().c();
            this.V = str;
            this.S.clear();
            g1<UserBasicWithGraphParams> g1Var = this.U;
            g1<UserBasicWithGraphParams> g1Var2 = null;
            if (g1Var == null) {
                p.v("candidatesAdapter");
                g1Var = null;
            }
            g1Var.clear();
            g1<UserBasicWithGraphParams> g1Var3 = this.U;
            if (g1Var3 == null) {
                p.v("candidatesAdapter");
                g1Var3 = null;
            }
            g1Var3.g();
            g1<UserBasicWithGraphParams> g1Var4 = this.U;
            if (g1Var4 == null) {
                p.v("candidatesAdapter");
            } else {
                g1Var2 = g1Var4;
            }
            g1Var2.notifyDataSetChanged();
            Q3();
            j4(str, W3().b());
        }
    }

    public final void l4() {
        List<Fragment> p02 = a3().p0();
        p.g(p02, "supportFragmentManager.fragments");
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

    public final void m4() {
        int i10 = this.Q == null ? nc.i.text_chat_btn_makeroom_count : nc.i.text_chat_btn_member_add_count;
        int i42 = i4();
        int f10 = U3().f();
        o oVar = this.P;
        g1<UserBasicWithGraphParams> g1Var = null;
        if (oVar == null) {
            p.v("binding");
            oVar = null;
        }
        AppCompatTextView appCompatTextView = oVar.H;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i42);
        sb2.append('/');
        int i11 = f10 - 1;
        sb2.append(i11);
        appCompatTextView.setText(getString(i10, new Object[]{sb2.toString()}));
        o oVar2 = this.P;
        if (oVar2 == null) {
            p.v("binding");
            oVar2 = null;
        }
        AppCompatTextView appCompatTextView2 = oVar2.H;
        v0 v0Var = this.W;
        if (v0Var == null) {
            p.v("invitedUsersAdapter");
            v0Var = null;
        }
        appCompatTextView2.setEnabled(v0Var.getItemCount() > 0);
        g1<UserBasicWithGraphParams> g1Var2 = this.U;
        if (g1Var2 == null) {
            p.v("candidatesAdapter");
        } else {
            g1Var = g1Var2;
        }
        g1Var.m(i42 < i11);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.f41861h);
        p.g(g10, "setContentView(this, R.l…tivity_group_invitations)");
        this.P = (o) g10;
        this.Q = (ge.j) getIntent().getParcelableExtra("EXTRA_THREAD");
        g1<UserBasicWithGraphParams> g1Var = new g1<>(this, new d(), new e());
        this.U = g1Var;
        g1Var.g();
        this.W = new v0(new f());
        View inflate = getLayoutInflater().inflate(nc.f.f41858d0, (ViewGroup) null);
        p.g(inflate, "layoutInflater.inflate(R…ut.listview_footer, null)");
        this.T = inflate;
        Y3();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        p.h(absListView, "absListView");
        if (i12 != i10 + i11 || W3().a()) {
            return;
        }
        j4(this.V, W3().b());
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        p.h(absListView, "absListView");
    }
}
