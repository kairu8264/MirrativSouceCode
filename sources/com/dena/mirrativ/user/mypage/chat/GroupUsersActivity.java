package com.dena.mirrativ.user.mypage.chat;

import ae.q;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.user.mypage.MyPageActivity;
import com.dena.mirrativ.user.mypage.chat.GroupUsersActivity;
import com.dena.mirrativ.user.userprofile.UserProfileActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.user.UserBasicWithGraphParams;
import com.dena.mirrorman.net.api.response.user.UsersResponse;
import com.dena.mirrorman.net.retrofit.MRRequest;
import ge.e;
import ge.j;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.h;
import jo.p;
import kf.x;
import nc.i;
import of.n;
import tc.g1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;
import xn.a0;
import xn.t;

/* loaded from: classes2.dex */
public final class GroupUsersActivity extends e.b implements q0 {
    public static final a Y = new a(null);
    public static final int Z = 8;
    public q P;
    public j Q;
    public TextView R;
    public g1<UserBasicWithGraphParams> T;
    public boolean U;
    public final wn.f V;
    public final wn.f W;
    public final androidx.activity.result.c<Intent> X;
    public final /* synthetic */ q0 O = r0.b();
    public String S = Referer.Chat.GROUP_USERS;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, j jVar) {
            p.h(context, "context");
            Intent intent = new Intent(context, GroupUsersActivity.class);
            intent.putExtra("EXTRA_THREAD", jVar);
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.GroupUsersActivity$getData$1", f = "GroupUsersActivity.kt", l = {156}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24651w;

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
            int i10 = this.f24651w;
            try {
                if (i10 == 0) {
                    m.b(obj);
                    MRRequest O3 = GroupUsersActivity.this.O3();
                    String str = GroupUsersActivity.this.S;
                    j jVar = GroupUsersActivity.this.Q;
                    p.e(jVar);
                    String f10 = jVar.f();
                    this.f24651w = 1;
                    obj = O3.getGroupUsers(str, f10, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m.b(obj);
                }
                UsersResponse usersResponse = (UsersResponse) obj;
                g1 g1Var = GroupUsersActivity.this.T;
                g1 g1Var2 = null;
                if (g1Var == null) {
                    p.v("usersAdapter");
                    g1Var = null;
                }
                g1Var.addAll(usersResponse.getUsers());
                g1 g1Var3 = GroupUsersActivity.this.T;
                if (g1Var3 == null) {
                    p.v("usersAdapter");
                } else {
                    g1Var2 = g1Var3;
                }
                g1Var2.notifyDataSetChanged();
                GroupUsersActivity groupUsersActivity = GroupUsersActivity.this;
                j jVar2 = groupUsersActivity.Q;
                p.e(jVar2);
                List<UserBasicWithGraphParams> users = usersResponse.getUsers();
                ArrayList arrayList = new ArrayList(t.u(users, 10));
                for (UserBasicWithGraphParams userBasicWithGraphParams : users) {
                    arrayList.add(userBasicWithGraphParams.getUserId());
                }
                groupUsersActivity.Q = jVar2.q(arrayList);
                GroupUsersActivity.this.b4();
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    n.f45411a.l(GroupUsersActivity.this, error);
                } else {
                    n nVar = n.f45411a;
                    GroupUsersActivity groupUsersActivity2 = GroupUsersActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = GroupUsersActivity.this.getString(i.f41875e);
                        p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(groupUsersActivity2, message, false);
                }
            }
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements g1.c<UserBasicWithGraphParams> {
        public c() {
        }

        @Override // tc.g1.c
        /* renamed from: b */
        public void a(UserBasicWithGraphParams userBasicWithGraphParams) {
            if (userBasicWithGraphParams == null) {
                return;
            }
            if (p.c(GroupUsersActivity.this.P3().T4(), userBasicWithGraphParams.getUserId())) {
                GroupUsersActivity groupUsersActivity = GroupUsersActivity.this;
                groupUsersActivity.startActivity(MyPageActivity.P.a(groupUsersActivity));
                return;
            }
            GroupUsersActivity groupUsersActivity2 = GroupUsersActivity.this;
            groupUsersActivity2.startActivity(UserProfileActivity.f24944g0.a(groupUsersActivity2, userBasicWithGraphParams.getUserId(), GroupUsersActivity.this.S));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.GroupUsersActivity$kickUser$1", f = "GroupUsersActivity.kt", l = {210}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24654w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ UserBasicWithGraphParams f24656y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UserBasicWithGraphParams userBasicWithGraphParams, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f24656y = userBasicWithGraphParams;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f24656y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            List<String> D0;
            Object c10 = bo.c.c();
            int i10 = this.f24654w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        m.b(obj);
                        MRRequest O3 = GroupUsersActivity.this.O3();
                        String str = GroupUsersActivity.this.S;
                        j jVar = GroupUsersActivity.this.Q;
                        p.e(jVar);
                        String f10 = jVar.f();
                        String userId = this.f24656y.getUserId();
                        this.f24654w = 1;
                        obj = O3.postGroupKickUsers(str, f10, userId, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m.b(obj);
                    }
                    StatusResponse statusResponse = (StatusResponse) obj;
                    g1 g1Var = GroupUsersActivity.this.T;
                    g1 g1Var2 = null;
                    if (g1Var == null) {
                        p.v("usersAdapter");
                        g1Var = null;
                    }
                    g1Var.remove(this.f24656y);
                    g1 g1Var3 = GroupUsersActivity.this.T;
                    if (g1Var3 == null) {
                        p.v("usersAdapter");
                    } else {
                        g1Var2 = g1Var3;
                    }
                    g1Var2.notifyDataSetChanged();
                    j jVar2 = GroupUsersActivity.this.Q;
                    p.e(jVar2);
                    List<String> h10 = jVar2.h();
                    if (h10 != null && (D0 = a0.D0(h10)) != null) {
                        UserBasicWithGraphParams userBasicWithGraphParams = this.f24656y;
                        GroupUsersActivity groupUsersActivity = GroupUsersActivity.this;
                        D0.remove(userBasicWithGraphParams.getUserId());
                        j jVar3 = groupUsersActivity.Q;
                        p.e(jVar3);
                        groupUsersActivity.Q = jVar3.q(D0);
                        groupUsersActivity.b4();
                    }
                } catch (Exception e10) {
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (!(error instanceof MRError.ForceUpdate)) {
                        z10 = p.c(error, MRError.Maintenance.INSTANCE);
                    }
                    if (z10) {
                        n.f45411a.l(GroupUsersActivity.this, error);
                    } else {
                        n nVar = n.f45411a;
                        GroupUsersActivity groupUsersActivity2 = GroupUsersActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = GroupUsersActivity.this.getString(i.f41875e);
                            p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(groupUsersActivity2, message, false);
                    }
                }
                GroupUsersActivity.this.M3();
                return v.f59242a;
            } catch (Throwable th2) {
                GroupUsersActivity.this.M3();
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24657w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24658x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24659y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24657w = componentCallbacks;
            this.f24658x = aVar;
            this.f24659y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f24657w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f24658x, this.f24659y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24660w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24661x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24662y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24660w = componentCallbacks;
            this.f24661x = aVar;
            this.f24662y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f24660w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f24661x, this.f24662y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements g1.b<UserBasicWithGraphParams> {
        public g() {
        }

        public static final void d(GroupUsersActivity groupUsersActivity, UserBasicWithGraphParams userBasicWithGraphParams) {
            p.h(groupUsersActivity, "this$0");
            groupUsersActivity.W3(userBasicWithGraphParams);
        }

        @Override // tc.g1.b
        /* renamed from: c */
        public void a(final UserBasicWithGraphParams userBasicWithGraphParams) {
            e.a aVar = new e.a();
            GroupUsersActivity groupUsersActivity = GroupUsersActivity.this;
            int i10 = i.text_chat_exile_dialog_ttl;
            p.e(userBasicWithGraphParams);
            String string = groupUsersActivity.getString(i10, new Object[]{userBasicWithGraphParams.getName()});
            p.g(string, "getString(R.string.text_…_dialog_ttl, item!!.name)");
            e.a g10 = aVar.g(string);
            String string2 = GroupUsersActivity.this.getString(i.text_chat_exile_dialog_caution);
            p.g(string2, "getString(R.string.text_chat_exile_dialog_caution)");
            e.a d10 = g10.e(string2).d(true);
            String string3 = GroupUsersActivity.this.getString(i.text_chat_btn_exile);
            p.g(string3, "getString(R.string.text_chat_btn_exile)");
            ge.e a10 = d10.f(string3).a();
            final GroupUsersActivity groupUsersActivity2 = GroupUsersActivity.this;
            a10.N3(new Runnable() { // from class: tc.f1
                @Override // java.lang.Runnable
                public final void run() {
                    GroupUsersActivity.g.d(GroupUsersActivity.this, userBasicWithGraphParams);
                }
            });
            a10.z3(GroupUsersActivity.this.a3(), "ChatConfirmationDialog");
        }
    }

    public GroupUsersActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.V = wn.g.b(iVar, new e(this, null, null));
        this.W = wn.g.b(iVar, new f(this, null, null));
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.d1
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                GroupUsersActivity.Q3(GroupUsersActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul…tCode, result.data)\n    }");
        this.X = V2;
    }

    public static final void Q3(GroupUsersActivity groupUsersActivity, androidx.activity.result.a aVar) {
        p.h(groupUsersActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        groupUsersActivity.Y3(aVar.b(), aVar.a());
    }

    public static final void S3(GroupUsersActivity groupUsersActivity, c cVar, AdapterView adapterView, View view, int i10, long j10) {
        p.h(groupUsersActivity, "this$0");
        p.h(cVar, "$clickListener");
        g1<UserBasicWithGraphParams> g1Var = groupUsersActivity.T;
        if (g1Var == null) {
            p.v("usersAdapter");
            g1Var = null;
        }
        UserBasicWithGraphParams userBasicWithGraphParams = (UserBasicWithGraphParams) g1Var.getItem(i10);
        if (userBasicWithGraphParams != null) {
            cVar.a(userBasicWithGraphParams);
        }
    }

    public static final void T3(GroupUsersActivity groupUsersActivity, View view) {
        p.h(groupUsersActivity, "this$0");
        groupUsersActivity.X3();
    }

    public static final void U3(GroupUsersActivity groupUsersActivity, View view) {
        p.h(groupUsersActivity, "this$0");
        groupUsersActivity.onBackPressed();
    }

    public static final boolean V3(GroupUsersActivity groupUsersActivity, MenuItem menuItem) {
        p.h(groupUsersActivity, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_edit) {
            groupUsersActivity.a4(!groupUsersActivity.U);
            return true;
        }
        return false;
    }

    public static final void c4(GroupUsersActivity groupUsersActivity, View view) {
        p.h(groupUsersActivity, "this$0");
        groupUsersActivity.finish();
    }

    public final void M3() {
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

    public final void N3() {
        if (this.Q == null) {
            return;
        }
        uo.l.d(this, null, null, new b(null), 3, null);
    }

    public final MRRequest O3() {
        return (MRRequest) this.V.getValue();
    }

    public final x P3() {
        return (x) this.W.getValue();
    }

    public final void R3() {
        final c cVar = new c();
        q qVar = null;
        this.T = new g1<>(this, cVar, null);
        q qVar2 = this.P;
        if (qVar2 == null) {
            p.v("binding");
            qVar2 = null;
        }
        ListView listView = qVar2.D;
        g1<UserBasicWithGraphParams> g1Var = this.T;
        if (g1Var == null) {
            p.v("usersAdapter");
            g1Var = null;
        }
        listView.setAdapter((ListAdapter) g1Var);
        q qVar3 = this.P;
        if (qVar3 == null) {
            p.v("binding");
            qVar3 = null;
        }
        qVar3.D.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: tc.c1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                GroupUsersActivity.S3(GroupUsersActivity.this, cVar, adapterView, view, i10, j10);
            }
        });
        N3();
        q qVar4 = this.P;
        if (qVar4 == null) {
            p.v("binding");
            qVar4 = null;
        }
        qVar4.B.setOnClickListener(new View.OnClickListener() { // from class: tc.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupUsersActivity.T3(GroupUsersActivity.this, view);
            }
        });
        b4();
        q qVar5 = this.P;
        if (qVar5 == null) {
            p.v("binding");
        } else {
            qVar = qVar5;
        }
        Toolbar toolbar = qVar.C.B;
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupUsersActivity.U3(GroupUsersActivity.this, view);
            }
        });
        toolbar.inflateMenu(nc.g.edit_menu);
        View findViewById = toolbar.findViewById(nc.e.menu_item_edit);
        p.g(findViewById, "it.findViewById(R.id.menu_item_edit)");
        this.R = (TextView) findViewById;
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: tc.e1
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean V3;
                V3 = GroupUsersActivity.V3(GroupUsersActivity.this, menuItem);
                return V3;
            }
        });
    }

    public final void W3(UserBasicWithGraphParams userBasicWithGraphParams) {
        if (this.Q == null) {
            return;
        }
        Z3();
        uo.l.d(this, null, null, new d(userBasicWithGraphParams, null), 3, null);
    }

    public final void X3() {
        this.X.a(GroupInvitationsActivity.f24624b0.a(this, this.Q));
    }

    public final void Y3(int i10, Intent intent) {
        if (isFinishing() || i10 != -1) {
            return;
        }
        p.e(intent);
        Intent intent2 = new Intent();
        intent2.putExtra("key_result_thread", (j) intent.getParcelableExtra("KEY_RESULT_THREAD"));
        setResult(-1, intent2);
        finish();
    }

    public final void Z3() {
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

    public final void a4(boolean z10) {
        g1<UserBasicWithGraphParams> g1Var = null;
        TextView textView = null;
        if (z10) {
            g1<UserBasicWithGraphParams> g1Var2 = this.T;
            if (g1Var2 == null) {
                p.v("usersAdapter");
                g1Var2 = null;
            }
            g1Var2.n(new g());
            g1<UserBasicWithGraphParams> g1Var3 = this.T;
            if (g1Var3 == null) {
                p.v("usersAdapter");
                g1Var3 = null;
            }
            g1Var3.notifyDataSetChanged();
            TextView textView2 = this.R;
            if (textView2 == null) {
                p.v("toolbarActionView");
            } else {
                textView = textView2;
            }
            textView.setText(i.text_done);
        } else {
            TextView textView3 = this.R;
            if (textView3 == null) {
                p.v("toolbarActionView");
                textView3 = null;
            }
            textView3.setText(i.text_edit);
            g1<UserBasicWithGraphParams> g1Var4 = this.T;
            if (g1Var4 == null) {
                p.v("usersAdapter");
                g1Var4 = null;
            }
            g1Var4.n(null);
            g1<UserBasicWithGraphParams> g1Var5 = this.T;
            if (g1Var5 == null) {
                p.v("usersAdapter");
            } else {
                g1Var = g1Var5;
            }
            g1Var.notifyDataSetChanged();
        }
        this.U = z10;
    }

    public final void b4() {
        if (this.Q != null) {
            q qVar = this.P;
            if (qVar == null) {
                p.v("binding");
                qVar = null;
            }
            Toolbar toolbar = qVar.C.B;
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupUsersActivity.c4(GroupUsersActivity.this, view);
                }
            });
            toolbar.setNavigationIcon(nc.d.f41815v);
            TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
            if (textView == null) {
                return;
            }
            p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
            toolbar.setBackgroundResource(nc.h.f41869c);
            textView.setVisibility(0);
            int i10 = i.text_chat_member_list_count;
            j jVar = this.Q;
            p.e(jVar);
            textView.setText(getString(i10, new Object[]{String.valueOf(jVar.i())}));
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.f41862i);
        p.g(g10, "setContentView(this, R.l…out.activity_group_users)");
        this.P = (q) g10;
        this.Q = (j) getIntent().getParcelableExtra("EXTRA_THREAD");
        R3();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
