package com.dena.mirrativ.user.mypage.chat;

import ae.m;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import co.l;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.user.mypage.chat.GroupEditActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Group;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.dena.mirrorman.widget.RoundedMultipleImagesView;
import ep.c0;
import ge.j;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jo.f0;
import jo.h;
import jo.i0;
import jo.p;
import jo.q;
import nc.i;
import of.n;
import of.s;
import tb.c;
import uo.q0;
import uo.r0;
import wn.g;
import wn.v;

/* loaded from: classes2.dex */
public final class GroupEditActivity extends e.b implements q0 {
    public static final a Z = new a(null);

    /* renamed from: a0  reason: collision with root package name */
    public static final int f24612a0 = 8;
    public m P;
    public Uri R;
    public boolean S;
    public final wn.f T;
    public final wn.f U;
    public final androidx.activity.result.c<Intent> V;
    public final androidx.activity.result.c<Intent> W;
    public final androidx.activity.result.c<Intent> X;
    public final androidx.activity.result.c<Intent> Y;
    public final /* synthetic */ q0 O = r0.b();
    public final wn.f Q = g.a(new e());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final Intent a(Context context, j jVar) {
            p.h(context, "context");
            p.h(jVar, "thread");
            Intent intent = new Intent(context, GroupEditActivity.class);
            intent.putExtra("EXTRA_THREAD", jVar);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            p.h(editable, "editable");
            m mVar = GroupEditActivity.this.P;
            if (mVar == null) {
                p.v("binding");
                mVar = null;
            }
            AppCompatTextView appCompatTextView = mVar.G;
            i0 i0Var = i0.f38149a;
            String format = String.format("%d / %s", Arrays.copyOf(new Object[]{Integer.valueOf(editable.length()), GroupEditActivity.this.getString(i.limit_group_name)}, 2));
            p.g(format, "format(format, *args)");
            appCompatTextView.setText(format);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            p.h(charSequence, "s");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24614w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24615x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24616y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24614w = componentCallbacks;
            this.f24615x = aVar;
            this.f24616y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f24614w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f24615x, this.f24616y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24617w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24618x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24619y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24617w = componentCallbacks;
            this.f24618x = aVar;
            this.f24619y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24617w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f24618x, this.f24619y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<j> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final j invoke() {
            Parcelable parcelableExtra = GroupEditActivity.this.getIntent().getParcelableExtra("EXTRA_THREAD");
            p.e(parcelableExtra);
            return (j) parcelableExtra;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.GroupEditActivity$updateGroup$1", f = "GroupEditActivity.kt", l = {246}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24621w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c0 f24623y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c0 c0Var, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f24623y = c0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f24623y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object postGroupEdit;
            Object c10 = bo.c.c();
            int i10 = this.f24621w;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest P3 = GroupEditActivity.this.P3();
                        c0 c0Var = this.f24623y;
                        this.f24621w = 1;
                        postGroupEdit = P3.postGroupEdit(Referer.Chat.GROUP_EDIT, c0Var, this);
                        if (postGroupEdit == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                        postGroupEdit = obj;
                    }
                    Group.Edit edit = (Group.Edit) postGroupEdit;
                    Intent intent = new Intent();
                    intent.putExtra("key_result_thread", new j(null, edit.getGroup().getId(), edit.getGroup().getName(), edit.getGroup().getImageUrls(), edit.getGroup().getNameEdited() == 1, GroupEditActivity.this.Q3().h(), GroupEditActivity.this.Q3().i(), GroupEditActivity.this.Q3().k(), GroupEditActivity.this.Q3().e(), GroupEditActivity.this.Q3().p()));
                    GroupEditActivity.this.setResult(-1, intent);
                    GroupEditActivity.this.finish();
                } catch (Exception e10) {
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (error instanceof MRError.Maintenance ? true : p.c(error, MRError.ForceUpdate.INSTANCE)) {
                        n.f45411a.l(GroupEditActivity.this, error);
                    } else {
                        n nVar = n.f45411a;
                        GroupEditActivity groupEditActivity = GroupEditActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = GroupEditActivity.this.getString(i.f41875e);
                            p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(groupEditActivity, message, false);
                    }
                }
                GroupEditActivity.this.N3();
                return v.f59242a;
            } catch (Throwable th2) {
                GroupEditActivity.this.N3();
                throw th2;
            }
        }
    }

    public GroupEditActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.T = g.b(iVar, new c(this, null, null));
        this.U = g.b(iVar, new d(this, null, null));
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.m0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                GroupEditActivity.M3(GroupEditActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul…Quietly()\n        }\n    }");
        this.V = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.k0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                GroupEditActivity.L3(GroupEditActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V22, "registerForActivityResul…        }\n        }\n    }");
        this.W = V22;
        androidx.activity.result.c<Intent> V23 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.n0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                GroupEditActivity.S3(GroupEditActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V23, "registerForActivityResul…tCode, result.data)\n    }");
        this.X = V23;
        androidx.activity.result.c<Intent> V24 = V2(new c.c(), new androidx.activity.result.b() { // from class: tc.l0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                GroupEditActivity.R3(GroupEditActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V24, "registerForActivityResul…tCode, result.data)\n    }");
        this.Y = V24;
    }

    public static final void L3(GroupEditActivity groupEditActivity, androidx.activity.result.a aVar) {
        Intent a10;
        Uri data;
        p.h(groupEditActivity, "this$0");
        if (aVar.b() != -1 || (a10 = aVar.a()) == null || (data = a10.getData()) == null) {
            return;
        }
        Intent c10 = c.a.c(groupEditActivity.O3(), groupEditActivity, data, 1.0f, 1.0f, false, 16, null);
        if (c10.resolveActivity(groupEditActivity.getApplicationContext().getPackageManager()) != null) {
            groupEditActivity.V.a(c10);
        }
    }

    public static final void M3(GroupEditActivity groupEditActivity, androidx.activity.result.a aVar) {
        Intent a10;
        Uri uri;
        p.h(groupEditActivity, "this$0");
        if (aVar.b() != -1 || (a10 = aVar.a()) == null || (uri = (Uri) a10.getParcelableExtra("EXTRA_CROPPED_IMAGE_SOURCE")) == null) {
            return;
        }
        InputStream inputStream = null;
        m mVar = null;
        inputStream = null;
        try {
            try {
                InputStream openInputStream = groupEditActivity.getContentResolver().openInputStream(uri);
                try {
                    groupEditActivity.R = uri;
                    int dimensionPixelSize = groupEditActivity.getResources().getDimensionPixelSize(nc.c.profile_edit_image_size);
                    m mVar2 = groupEditActivity.P;
                    if (mVar2 == null) {
                        p.v("binding");
                    } else {
                        mVar = mVar2;
                    }
                    RoundedMultipleImagesView roundedMultipleImagesView = mVar.C;
                    of.f fVar = of.f.f45394a;
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                    p.g(decodeStream, "decodeStream(inputStream)");
                    roundedMultipleImagesView.c(fVar.b(decodeStream, dimensionPixelSize, dimensionPixelSize), dimensionPixelSize);
                    groupEditActivity.S = true;
                    if (openInputStream != null) {
                        fp.b.j(openInputStream);
                    }
                } catch (Exception e10) {
                    e = e10;
                    inputStream = openInputStream;
                    g9.a.c(e);
                    if (inputStream != null) {
                        fp.b.j(inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = openInputStream;
                    if (inputStream != null) {
                        fp.b.j(inputStream);
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void R3(GroupEditActivity groupEditActivity, androidx.activity.result.a aVar) {
        p.h(groupEditActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        groupEditActivity.c4(aVar.b(), aVar.a());
    }

    public static final void S3(GroupEditActivity groupEditActivity, androidx.activity.result.a aVar) {
        p.h(groupEditActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        groupEditActivity.d4(aVar.b(), aVar.a());
    }

    public static final void U3(GroupEditActivity groupEditActivity, View view) {
        p.h(groupEditActivity, "this$0");
        groupEditActivity.b4();
    }

    public static final void V3(GroupEditActivity groupEditActivity, View view) {
        p.h(groupEditActivity, "this$0");
        groupEditActivity.a4();
    }

    public static final void W3(GroupEditActivity groupEditActivity, View view) {
        p.h(groupEditActivity, "this$0");
        groupEditActivity.onBackPressed();
    }

    public static final boolean X3(GroupEditActivity groupEditActivity, MenuItem menuItem) {
        p.h(groupEditActivity, "this$0");
        if (menuItem.getItemId() == nc.e.menu_item_save) {
            groupEditActivity.g4();
            return true;
        }
        return false;
    }

    public static final void Y3(GroupEditActivity groupEditActivity, View view) {
        p.h(groupEditActivity, "this$0");
        groupEditActivity.e4();
    }

    public static final void Z3(GroupEditActivity groupEditActivity, DialogInterface dialogInterface, int i10) {
        p.h(groupEditActivity, "this$0");
        groupEditActivity.finish();
    }

    public final void N3() {
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

    public final tb.c O3() {
        return (tb.c) this.U.getValue();
    }

    public final MRRequest P3() {
        return (MRRequest) this.T.getValue();
    }

    public final j Q3() {
        return (j) this.Q.getValue();
    }

    public final void T3() {
        List<String> j10;
        m mVar = this.P;
        m mVar2 = null;
        if (mVar == null) {
            p.v("binding");
            mVar = null;
        }
        Toolbar toolbar = mVar.H.B;
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        boolean z10 = false;
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(i.text_chat_group_edit));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tc.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupEditActivity.W3(GroupEditActivity.this, view);
            }
        });
        toolbar.inflateMenu(nc.g.save_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: tc.o0
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean X3;
                X3 = GroupEditActivity.X3(GroupEditActivity.this, menuItem);
                return X3;
            }
        });
        this.S = false;
        if (Q3().j() != null) {
            if (Q3().j() != null && (!j10.isEmpty())) {
                z10 = true;
            }
            if (z10) {
                m mVar3 = this.P;
                if (mVar3 == null) {
                    p.v("binding");
                    mVar3 = null;
                }
                mVar3.C.d(Q3().j(), nc.c.size48dp);
            }
        }
        m mVar4 = this.P;
        if (mVar4 == null) {
            p.v("binding");
            mVar4 = null;
        }
        mVar4.F.addTextChangedListener(new b());
        m mVar5 = this.P;
        if (mVar5 == null) {
            p.v("binding");
            mVar5 = null;
        }
        mVar5.F.setText(Q3().g() ? Q3().l() : "");
        m mVar6 = this.P;
        if (mVar6 == null) {
            p.v("binding");
            mVar6 = null;
        }
        mVar6.F.setHint(Q3().l());
        m mVar7 = this.P;
        if (mVar7 == null) {
            p.v("binding");
            mVar7 = null;
        }
        mVar7.D.setOnClickListener(new View.OnClickListener() { // from class: tc.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupEditActivity.Y3(GroupEditActivity.this, view);
            }
        });
        m mVar8 = this.P;
        if (mVar8 == null) {
            p.v("binding");
            mVar8 = null;
        }
        mVar8.I.setOnClickListener(new View.OnClickListener() { // from class: tc.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupEditActivity.U3(GroupEditActivity.this, view);
            }
        });
        m mVar9 = this.P;
        if (mVar9 == null) {
            p.v("binding");
        } else {
            mVar2 = mVar9;
        }
        mVar2.E.setOnClickListener(new View.OnClickListener() { // from class: tc.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GroupEditActivity.V3(GroupEditActivity.this, view);
            }
        });
    }

    public final void a4() {
        this.Y.a(GroupInvitationsActivity.f24624b0.a(this, Q3()));
    }

    public final void b4() {
        this.X.a(GroupUsersActivity.Y.a(this, Q3()));
    }

    public final void c4(int i10, Intent intent) {
        if (isFinishing() || i10 != -1) {
            return;
        }
        j jVar = intent != null ? (j) intent.getParcelableExtra("KEY_RESULT_THREAD") : null;
        Intent intent2 = new Intent();
        intent2.putExtra("key_result_thread", jVar);
        setResult(-1, intent2);
        finish();
    }

    public final void d4(int i10, Intent intent) {
        if (isFinishing() || i10 != -1) {
            return;
        }
        j jVar = intent != null ? (j) intent.getParcelableExtra("key_result_thread") : null;
        Intent intent2 = new Intent();
        intent2.putExtra("key_result_thread", jVar);
        setResult(-1, intent2);
        finish();
    }

    public final void e4() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        if (intent.resolveActivity(getApplicationContext().getPackageManager()) != null) {
            this.W.a(intent);
        }
    }

    public final void f4() {
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

    public final void g4() {
        m mVar = this.P;
        if (mVar == null) {
            p.v("binding");
            mVar = null;
        }
        String obj = mVar.F.getText().toString();
        if (this.S || !s.f45426a.b(obj)) {
            f4();
            uo.l.d(this, null, null, new f(ApiUtil.INSTANCE.groupEditRequestBody(Q3().f(), obj, of.f.f45394a.a(this, this.R)), null), 3, null);
        }
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isFinishing()) {
            return;
        }
        if (!this.S) {
            String l10 = Q3().g() ? Q3().l() : "";
            m mVar = this.P;
            if (mVar == null) {
                p.v("binding");
                mVar = null;
            }
            if (!p.c(l10, mVar.F.getText().toString())) {
                super.onBackPressed();
                return;
            }
        }
        new a.C0045a(this).f(i.f41892v2).setPositiveButton(i.text_discard, new DialogInterface.OnClickListener() { // from class: tc.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                GroupEditActivity.Z3(GroupEditActivity.this, dialogInterface, i10);
            }
        }).setNegativeButton(i.B, null).k();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, nc.f.f41860g);
        p.g(g10, "setContentView(this, R.layout.activity_group_edit)");
        this.P = (m) g10;
        T3();
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }
}
