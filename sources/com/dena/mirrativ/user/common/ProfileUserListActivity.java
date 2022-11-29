package com.dena.mirrativ.user.common;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrativ.mirrativapi.core.StatusResponse;
import com.dena.mirrativ.user.common.ProfileUserListActivity;
import com.dena.mirrativ.user.userprofile.UserProfileActivity;
import com.dena.mirrorman.feature.notice.FollowPushSettingsActivity;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.api.response.Graph;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import hf.j0;
import hf.v0;
import ie.f;
import java.util.ArrayList;
import java.util.List;
import jo.e0;
import jo.f0;
import kf.x;
import nd.y;
import nf.a0;
import od.g0;
import pd.s;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public class ProfileUserListActivity extends e.b implements AbsListView.OnScrollListener, f.b, q0 {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f24079g0 = new a(null);

    /* renamed from: h0  reason: collision with root package name */
    public static final int f24080h0 = 8;
    public final /* synthetic */ q0 O = r0.b();
    public final wn.f P = wn.g.a(new c());
    public final wn.f Q = wn.g.a(new w());
    public final wn.f R = wn.g.a(new k());
    public final wn.f S = wn.g.a(new l());
    public boolean T;
    public we.f U;
    public final wn.f V;
    public int W;
    public nd.g X;
    public final List<UrgeUser> Y;
    public final wn.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public final wn.f f24081a0;

    /* renamed from: b0  reason: collision with root package name */
    public final wn.f f24082b0;

    /* renamed from: c0  reason: collision with root package name */
    public final wn.f f24083c0;

    /* renamed from: d0  reason: collision with root package name */
    public final wn.f f24084d0;

    /* renamed from: e0  reason: collision with root package name */
    public final wn.f f24085e0;

    /* renamed from: f0  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f24086f0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, String str, int i10, String str2) {
            jo.p.h(context, "context");
            Intent intent = new Intent(context, ProfileUserListActivity.class);
            intent.putExtra("EXTRA_MODE", i10);
            if (str != null) {
                intent.putExtra("EXTRA_NOTICE_ID", str);
            }
            if (str2 != null) {
                intent.putExtra("EXTRA_LIVE_REQUEST_REFERER", str2);
            }
            return intent;
        }

        public final Intent b(Context context, String str, int i10) {
            jo.p.h(context, "context");
            jo.p.h(str, "userId");
            Intent intent = new Intent(context, ProfileUserListActivity.class);
            intent.putExtra("EXTRA_USER_ID", str);
            intent.putExtra("EXTRA_MODE", i10);
            return intent;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.p<Integer, Boolean, wn.v> {
        public b() {
            super(2);
        }

        public final void a(int i10, boolean z10) {
            we.f fVar = ProfileUserListActivity.this.U;
            if (fVar == null) {
                jo.p.v("userListAdapter");
                fVar = null;
            }
            UrgeUser item = fVar.getItem(i10);
            if (z10) {
                ProfileUserListActivity.this.V3(i10, item.getUserId());
            } else {
                ProfileUserListActivity.this.w4(i10, item.getUserId());
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(Integer num, Boolean bool) {
            a(num.intValue(), bool.booleanValue());
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<pc.u> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final pc.u invoke() {
            return (pc.u) androidx.databinding.f.g(ProfileUserListActivity.this, nc.f.activity_profile_user_list);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$block$1", f = "ProfileUserListActivity.kt", l = {648}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24089w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24091y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24092z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i10, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f24091y = str;
            this.f24092z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f24091y, this.f24092z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24089w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest k42 = ProfileUserListActivity.this.k4();
                    String j42 = ProfileUserListActivity.this.j4();
                    String str = this.f24091y;
                    this.f24089w = 1;
                    if (k42.postBlock(j42, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ProfileUserListActivity.this.s4(this.f24092z, this.f24091y, true);
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.ForceUpdate ? true : jo.p.c(error, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$follow$1", f = "ProfileUserListActivity.kt", l = {558}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24093w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24095y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24096z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i10, ao.d<? super e> dVar) {
            super(2, dVar);
            this.f24095y = str;
            this.f24096z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new e(this.f24095y, this.f24096z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24093w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest k42 = ProfileUserListActivity.this.k4();
                    String j42 = ProfileUserListActivity.this.j4();
                    String str = this.f24095y;
                    this.f24093w = 1;
                    if (k42.postFollow(j42, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                ProfileUserListActivity.this.Z3().a(new s.C0720s(ProfileUserListActivity.this.m4()));
                dq.c.c().l(new y(this.f24095y, true));
                ProfileUserListActivity.this.t4(this.f24096z, this.f24095y, true);
                hf.b.f35490a.h();
                FirebaseAnalytics.getInstance(ProfileUserListActivity.this.getApplicationContext()).a("jdwii7", null);
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$getBlockedUsers$1", f = "ProfileUserListActivity.kt", l = {470}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24097w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ e0<Integer> f24099y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24100z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e0<Integer> e0Var, int i10, ao.d<? super f> dVar) {
            super(2, dVar);
            this.f24099y = e0Var;
            this.f24100z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new f(this.f24099y, this.f24100z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24097w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f24097w = 1;
                    obj = ProfileUserListActivity.this.k4().getBlockedUsers(ProfileUserListActivity.this.j4(), this.f24099y.f38136w, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Graph.BlockedUserList blockedUserList = (Graph.BlockedUserList) obj;
                ProfileUserListActivity.this.S3(blockedUserList.getBlocked_users(), blockedUserList.getCurrent_page(), blockedUserList.getNext_page());
            } catch (Exception e10) {
                ProfileUserListActivity.this.g4().e(this.f24100z, false);
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$getFollowers$1", f = "ProfileUserListActivity.kt", l = {403}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f24101w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24103y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0<Integer> f24104z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, e0<Integer> e0Var, int i10, ao.d<? super g> dVar) {
            super(2, dVar);
            this.f24103y = str;
            this.f24104z = e0Var;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new g(this.f24103y, this.f24104z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((g) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24101w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f24101w = 1;
                    obj = ProfileUserListActivity.this.k4().getFollowers(ProfileUserListActivity.this.j4(), this.f24103y, this.f24104z.f38136w, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Graph.FollowerList followerList = (Graph.FollowerList) obj;
                ProfileUserListActivity.this.S3(followerList.getFollowers(), followerList.getCurrentPage(), followerList.getNextPage());
            } catch (Exception e10) {
                ProfileUserListActivity.this.g4().e(this.A, false);
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$getFollowings$1", f = "ProfileUserListActivity.kt", l = {375}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ int A;

        /* renamed from: w  reason: collision with root package name */
        public int f24105w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24107y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ e0<Integer> f24108z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, e0<Integer> e0Var, int i10, ao.d<? super h> dVar) {
            super(2, dVar);
            this.f24107y = str;
            this.f24108z = e0Var;
            this.A = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new h(this.f24107y, this.f24108z, this.A, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((h) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24105w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    this.f24105w = 1;
                    obj = ProfileUserListActivity.this.k4().getFollowingUsers(ProfileUserListActivity.this.j4(), this.f24107y, this.f24108z.f38136w, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                Graph.FollowingList followingList = (Graph.FollowingList) obj;
                ProfileUserListActivity.this.S3(followingList.getFollowings(), followingList.getCurrentPage(), followingList.getNextPage());
            } catch (Exception e10) {
                ProfileUserListActivity.this.g4().e(this.A, false);
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$getKickedUsers$1", f = "ProfileUserListActivity.kt", l = {499}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24109w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24111y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24112z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, int i10, ao.d<? super i> dVar) {
            super(2, dVar);
            this.f24111y = str;
            this.f24112z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new i(this.f24111y, this.f24112z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((i) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24109w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest k42 = ProfileUserListActivity.this.k4();
                        String j42 = ProfileUserListActivity.this.j4();
                        String str = this.f24111y;
                        this.f24109w = 1;
                        obj = k42.getKickedUsers(j42, str, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    ProfileUserListActivity.this.S3(((Graph.KickedUserList) obj).getKicked_users(), this.f24112z, -1);
                } catch (Exception e10) {
                    ProfileUserListActivity.this.g4().e(this.f24112z, false);
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (!(error instanceof MRError.Maintenance)) {
                        z10 = jo.p.c(error, MRError.ForceUpdate.INSTANCE);
                    }
                    if (z10) {
                        of.n.f45411a.l(ProfileUserListActivity.this, error);
                    } else {
                        of.n nVar = of.n.f45411a;
                        ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(profileUserListActivity, message, false);
                    }
                }
                return wn.v.f59242a;
            } finally {
                ProfileUserListActivity.this.U3();
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$getNewFollowers$1", f = "ProfileUserListActivity.kt", l = {427}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24113w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24115y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24116z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, int i10, ao.d<? super j> dVar) {
            super(2, dVar);
            this.f24115y = str;
            this.f24116z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new j(this.f24115y, this.f24116z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((j) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24113w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest k42 = ProfileUserListActivity.this.k4();
                        String j42 = ProfileUserListActivity.this.j4();
                        String str = this.f24115y;
                        this.f24113w = 1;
                        obj = k42.getNewFollowers(j42, str, this);
                        if (obj == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    ProfileUserListActivity.this.S3(((Graph.FollowerList) obj).getFollowers(), 0, -1);
                } catch (Exception e10) {
                    ProfileUserListActivity.this.g4().e(this.f24116z, false);
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (!(error instanceof MRError.Maintenance)) {
                        z10 = jo.p.c(error, MRError.ForceUpdate.INSTANCE);
                    }
                    if (z10) {
                        of.n.f45411a.l(ProfileUserListActivity.this, error);
                    } else {
                        of.n nVar = of.n.f45411a;
                        ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                        String message = error.getMessage();
                        if (message == null) {
                            message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(profileUserListActivity, message, false);
                    }
                }
                return wn.v.f59242a;
            } finally {
                ProfileUserListActivity.this.U3();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<Integer> {
        public k() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(ProfileUserListActivity.this.getIntent().getIntExtra("EXTRA_MODE", 0));
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends jo.q implements io.a<String> {
        public l() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = ProfileUserListActivity.this.getIntent().getStringExtra("EXTRA_NOTICE_ID");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$onCreate$2", f = "ProfileUserListActivity.kt", l = {751}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Object f24119w;

        /* renamed from: x  reason: collision with root package name */
        public Object f24120x;

        /* renamed from: y  reason: collision with root package name */
        public Object f24121y;

        /* renamed from: z  reason: collision with root package name */
        public int f24122z;

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.p<Integer, Boolean, wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ProfileUserListActivity f24123w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProfileUserListActivity profileUserListActivity) {
                super(2);
                this.f24123w = profileUserListActivity;
            }

            public final void a(int i10, boolean z10) {
                we.f fVar = this.f24123w.U;
                if (fVar == null) {
                    jo.p.v("userListAdapter");
                    fVar = null;
                }
                UrgeUser item = fVar.getItem(i10);
                if (z10) {
                    this.f24123w.V3(i10, item.getUserId());
                } else {
                    this.f24123w.w4(i10, item.getUserId());
                }
            }

            @Override // io.p
            public /* bridge */ /* synthetic */ wn.v invoke(Integer num, Boolean bool) {
                a(num.intValue(), bool.booleanValue());
                return wn.v.f59242a;
            }
        }

        public m(ao.d<? super m> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new m(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((m) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x009f, TRY_LEAVE, TryCatch #1 {all -> 0x009f, blocks: (B:6:0x0019, B:15:0x0050, B:17:0x0059, B:20:0x0078, B:21:0x007c, B:23:0x0085, B:25:0x008a, B:12:0x0041, B:11:0x0037), top: B:37:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:15:0x0050). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r1 = r17
                java.lang.Object r0 = bo.c.c()
                int r2 = r1.f24122z
                r3 = 1
                if (r2 == 0) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r2 = r1.f24121y
                wo.k r2 = (wo.k) r2
                java.lang.Object r4 = r1.f24120x
                wo.x r4 = (wo.x) r4
                java.lang.Object r5 = r1.f24119w
                com.dena.mirrativ.user.common.ProfileUserListActivity r5 = (com.dena.mirrativ.user.common.ProfileUserListActivity) r5
                wn.m.b(r18)     // Catch: java.lang.Throwable -> L9f
                r7 = r18
                r6 = r1
                goto L50
            L20:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L28:
                wn.m.b(r18)
                com.dena.mirrativ.user.common.ProfileUserListActivity r2 = com.dena.mirrativ.user.common.ProfileUserListActivity.this
                nf.a0 r2 = com.dena.mirrativ.user.common.ProfileUserListActivity.H3(r2)
                wo.x r4 = r2.j()
                com.dena.mirrativ.user.common.ProfileUserListActivity r2 = com.dena.mirrativ.user.common.ProfileUserListActivity.this
                wo.k r5 = r4.iterator()     // Catch: java.lang.Throwable -> L9f
                r6 = r1
                r16 = r5
                r5 = r2
                r2 = r16
            L41:
                r6.f24119w = r5     // Catch: java.lang.Throwable -> L9f
                r6.f24120x = r4     // Catch: java.lang.Throwable -> L9f
                r6.f24121y = r2     // Catch: java.lang.Throwable -> L9f
                r6.f24122z = r3     // Catch: java.lang.Throwable -> L9f
                java.lang.Object r7 = r2.a(r6)     // Catch: java.lang.Throwable -> L9f
                if (r7 != r0) goto L50
                return r0
            L50:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L9f
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L9f
                r8 = 0
                if (r7 == 0) goto L99
                java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L9f
                java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L9f
                we.f r15 = new we.f     // Catch: java.lang.Throwable -> L9f
                java.util.List r10 = xn.a0.D0(r7)     // Catch: java.lang.Throwable -> L9f
                r11 = 1
                r12 = 0
                r13 = 1
                r14 = 0
                r9 = r15
                r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrativ.user.common.ProfileUserListActivity.O3(r5, r15)     // Catch: java.lang.Throwable -> L9f
                we.f r7 = com.dena.mirrativ.user.common.ProfileUserListActivity.L3(r5)     // Catch: java.lang.Throwable -> L9f
                java.lang.String r9 = "userListAdapter"
                if (r7 != 0) goto L7c
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L9f
                r7 = r8
            L7c:
                r7.notifyDataSetChanged()     // Catch: java.lang.Throwable -> L9f
                we.f r7 = com.dena.mirrativ.user.common.ProfileUserListActivity.L3(r5)     // Catch: java.lang.Throwable -> L9f
                if (r7 != 0) goto L89
                jo.p.v(r9)     // Catch: java.lang.Throwable -> L9f
                goto L8a
            L89:
                r8 = r7
            L8a:
                com.dena.mirrativ.user.common.ProfileUserListActivity$m$a r7 = new com.dena.mirrativ.user.common.ProfileUserListActivity$m$a     // Catch: java.lang.Throwable -> L9f
                r7.<init>(r5)     // Catch: java.lang.Throwable -> L9f
                r8.p(r7)     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrativ.user.common.ProfileUserListActivity.R3(r5)     // Catch: java.lang.Throwable -> L9f
                com.dena.mirrativ.user.common.ProfileUserListActivity.Q3(r5)     // Catch: java.lang.Throwable -> L9f
                goto L41
            L99:
                wo.n.a(r4, r8)
                wn.v r0 = wn.v.f59242a
                return r0
            L9f:
                r0 = move-exception
                r2 = r0
                throw r2     // Catch: java.lang.Throwable -> La2
            La2:
                r0 = move-exception
                r3 = r0
                wo.n.a(r4, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.common.ProfileUserListActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends jo.q implements io.a<j0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24124w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24125x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24124w = componentCallbacks;
            this.f24125x = aVar;
            this.f24126y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hf.j0] */
        @Override // io.a
        public final j0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24124w;
            return gq.a.a(componentCallbacks).c(f0.b(j0.class), this.f24125x, this.f24126y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24127w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24128x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24127w = componentCallbacks;
            this.f24128x = aVar;
            this.f24129y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f24127w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f24128x, this.f24129y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends jo.q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24130w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24131x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24132y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24130w = componentCallbacks;
            this.f24131x = aVar;
            this.f24132y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f24130w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f24131x, this.f24132y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class q extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24133w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24134x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24135y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24133w = componentCallbacks;
            this.f24134x = aVar;
            this.f24135y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24133w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f24134x, this.f24135y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class r extends jo.q implements io.a<q8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24136w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24137x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24138y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24136w = componentCallbacks;
            this.f24137x = aVar;
            this.f24138y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q8.a] */
        @Override // io.a
        public final q8.a invoke() {
            ComponentCallbacks componentCallbacks = this.f24136w;
            return gq.a.a(componentCallbacks).c(f0.b(q8.a.class), this.f24137x, this.f24138y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class s extends jo.q implements io.a<g0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24139w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24140x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24141y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24139w = componentCallbacks;
            this.f24140x = aVar;
            this.f24141y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.g0, java.lang.Object] */
        @Override // io.a
        public final g0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24139w;
            return gq.a.a(componentCallbacks).c(f0.b(g0.class), this.f24140x, this.f24141y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class t extends jo.q implements io.a<a0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24142w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24143x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24144y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24142w = componentCallbacks;
            this.f24143x = aVar;
            this.f24144y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.a0, java.lang.Object] */
        @Override // io.a
        public final a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24142w;
            return gq.a.a(componentCallbacks).c(f0.b(a0.class), this.f24143x, this.f24144y);
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$unblock$1", f = "ProfileUserListActivity.kt", l = {669}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class u extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24145w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24147y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24148z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, int i10, ao.d<? super u> dVar) {
            super(2, dVar);
            this.f24147y = str;
            this.f24148z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new u(this.f24147y, this.f24148z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((u) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24145w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest k42 = ProfileUserListActivity.this.k4();
                    String j42 = ProfileUserListActivity.this.j4();
                    String str = this.f24147y;
                    this.f24145w = 1;
                    obj = k42.postUnblock(j42, str, this);
                    if (obj == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                StatusResponse statusResponse = (StatusResponse) obj;
                ProfileUserListActivity.this.s4(this.f24148z, this.f24147y, false);
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.ForceUpdate ? true : jo.p.c(error, MRError.Maintenance.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.common.ProfileUserListActivity$unfollow$1", f = "ProfileUserListActivity.kt", l = {583}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24149w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f24151y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f24152z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, int i10, ao.d<? super v> dVar) {
            super(2, dVar);
            this.f24151y = str;
            this.f24152z = i10;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new v(this.f24151y, this.f24152z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((v) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24149w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    MRRequest k42 = ProfileUserListActivity.this.k4();
                    String j42 = ProfileUserListActivity.this.j4();
                    String str = this.f24151y;
                    this.f24149w = 1;
                    if (k42.postUnfollow(j42, str, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                dq.c.c().l(new y(this.f24151y, false));
                ProfileUserListActivity.this.Z3().a(s.u.f47251a);
                ProfileUserListActivity.this.t4(this.f24152z, this.f24151y, false);
            } catch (Exception e10) {
                MRError error = MRErrorKt.convertMRException(e10).getError();
                if (error instanceof MRError.Maintenance ? true : jo.p.c(error, MRError.ForceUpdate.INSTANCE)) {
                    of.n.f45411a.l(ProfileUserListActivity.this, error);
                } else {
                    of.n nVar = of.n.f45411a;
                    ProfileUserListActivity profileUserListActivity = ProfileUserListActivity.this;
                    String message = error.getMessage();
                    if (message == null) {
                        message = ProfileUserListActivity.this.getString(nc.i.f41875e);
                        jo.p.g(message, "getString(R.string.error_access)");
                    }
                    nVar.B(profileUserListActivity, message, false);
                }
            }
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class w extends jo.q implements io.a<String> {
        public w() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String stringExtra = ProfileUserListActivity.this.getIntent().getStringExtra("EXTRA_USER_ID");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    public ProfileUserListActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.V = wn.g.b(iVar, new n(this, null, null));
        this.Y = new ArrayList();
        this.Z = wn.g.b(iVar, new o(this, null, null));
        this.f24081a0 = wn.g.b(iVar, new p(this, null, null));
        this.f24082b0 = wn.g.b(iVar, new q(this, null, null));
        this.f24083c0 = wn.g.b(iVar, new r(this, null, null));
        this.f24084d0 = wn.g.b(iVar, new s(this, null, null));
        this.f24085e0 = wn.g.b(iVar, new t(this, null, null));
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: oc.e
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ProfileUserListActivity.A4(ProfileUserListActivity.this, (androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul…}\n            }\n        }");
        this.f24086f0 = V2;
    }

    public static final void A4(ProfileUserListActivity profileUserListActivity, androidx.activity.result.a aVar) {
        Intent a10;
        Bundle extras;
        jo.p.h(profileUserListActivity, "this$0");
        if (aVar.b() != -1 || profileUserListActivity.U == null || (a10 = aVar.a()) == null || (extras = a10.getExtras()) == null) {
            return;
        }
        we.f fVar = profileUserListActivity.U;
        we.f fVar2 = null;
        if (fVar == null) {
            jo.p.v("userListAdapter");
            fVar = null;
        }
        UrgeUser item = fVar.getItem(profileUserListActivity.W);
        String string = extras.getString("RESULT_KEY_USER_ID", "");
        we.f fVar3 = profileUserListActivity.U;
        if (fVar3 == null) {
            jo.p.v("userListAdapter");
            fVar3 = null;
        }
        if (fVar3.m()) {
            boolean z10 = extras.getBoolean("RESULT_KEY_iS_BLOCKING", false);
            boolean isBlocking = item.isBlocking();
            if (!jo.p.c(string, item.getUserId()) || isBlocking == z10) {
                return;
            }
            we.f fVar4 = profileUserListActivity.U;
            if (fVar4 == null) {
                jo.p.v("userListAdapter");
                fVar4 = null;
            }
            fVar4.n(item);
            item.setBlocking(z10);
            we.f fVar5 = profileUserListActivity.U;
            if (fVar5 == null) {
                jo.p.v("userListAdapter");
                fVar5 = null;
            }
            fVar5.k(item, profileUserListActivity.W);
            we.f fVar6 = profileUserListActivity.U;
            if (fVar6 == null) {
                jo.p.v("userListAdapter");
            } else {
                fVar2 = fVar6;
            }
            fVar2.notifyDataSetChanged();
            return;
        }
        boolean z11 = extras.getBoolean("RESULT_KEY_IS_FOLLOWING", false);
        boolean isFollowing = item.isFollowing();
        if (!jo.p.c(string, item.getUserId()) || isFollowing == z11) {
            return;
        }
        we.f fVar7 = profileUserListActivity.U;
        if (fVar7 == null) {
            jo.p.v("userListAdapter");
            fVar7 = null;
        }
        fVar7.n(item);
        item.setFollowing(z11);
        we.f fVar8 = profileUserListActivity.U;
        if (fVar8 == null) {
            jo.p.v("userListAdapter");
            fVar8 = null;
        }
        fVar8.k(item, profileUserListActivity.W);
        we.f fVar9 = profileUserListActivity.U;
        if (fVar9 == null) {
            jo.p.v("userListAdapter");
        } else {
            fVar2 = fVar9;
        }
        fVar2.notifyDataSetChanged();
    }

    public static final void p4(ProfileUserListActivity profileUserListActivity, View view) {
        jo.p.h(profileUserListActivity, "this$0");
        profileUserListActivity.onBackPressed();
    }

    public static final void q4(ProfileUserListActivity profileUserListActivity, AdapterView adapterView, View view, int i10, long j10) {
        jo.p.h(profileUserListActivity, "this$0");
        we.f fVar = profileUserListActivity.U;
        if (fVar == null) {
            jo.p.v("userListAdapter");
            fVar = null;
        }
        UrgeUser item = fVar.getItem(i10);
        profileUserListActivity.W = i10;
        if (!profileUserListActivity.l4().i(item.getUserId())) {
            v0 l42 = profileUserListActivity.l4();
            FragmentManager a32 = profileUserListActivity.a3();
            jo.p.g(a32, "supportFragmentManager");
            if (!v0.c(l42, a32, profileUserListActivity.j4(), false, 4, null)) {
                return;
            }
        }
        String userId = item.getUserId();
        String j42 = profileUserListActivity.j4();
        String simpleName = profileUserListActivity.getClass().getSimpleName();
        jo.p.g(simpleName, "javaClass.simpleName");
        g9.a.j(userId, j42, simpleName, "forResult");
        if (jo.p.c(profileUserListActivity.l4().x(), item.getUserId())) {
            return;
        }
        profileUserListActivity.f24086f0.a(UserProfileActivity.f24944g0.a(profileUserListActivity, item.getUserId(), profileUserListActivity.j4()));
    }

    public static final void r4(ProfileUserListActivity profileUserListActivity, View view) {
        jo.p.h(profileUserListActivity, "this$0");
        if (profileUserListActivity.d4() == 0) {
            profileUserListActivity.startActivity(FollowPushSettingsActivity.S.a(profileUserListActivity, Integer.valueOf(nc.i.text_setting_push)));
        }
    }

    public static final void z4(ProfileUserListActivity profileUserListActivity) {
        jo.p.h(profileUserListActivity, "this$0");
        ListView listView = profileUserListActivity.W3().H;
        we.f fVar = profileUserListActivity.U;
        if (fVar == null) {
            jo.p.v("userListAdapter");
            fVar = null;
        }
        listView.setAdapter((ListAdapter) fVar);
    }

    public final void S3(List<UrgeUser> list, int i10, int i11) {
        g4().f(i10, i11);
        this.Y.addAll(list);
        if (this.U == null) {
            this.U = new we.f(this.Y, d4() != 3, d4() == 4, (!this.T || d4() == 1 || d4() == 2) ? false : true, d4() != 4);
            y4();
        }
        we.f fVar = this.U;
        we.f fVar2 = null;
        if (fVar == null) {
            jo.p.v("userListAdapter");
            fVar = null;
        }
        fVar.notifyDataSetChanged();
        we.f fVar3 = this.U;
        if (fVar3 == null) {
            jo.p.v("userListAdapter");
        } else {
            fVar2 = fVar3;
        }
        fVar2.p(new b());
        x4();
    }

    public final void T3(int i10, String str) {
        v0 l42 = l4();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(l42, a32, j4() + Referer.BLOCK, false, 4, null)) {
            uo.l.d(this, null, null, new d(str, i10, null), 3, null);
        }
    }

    public final void U3() {
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

    public final void V3(int i10, String str) {
        v0 l42 = l4();
        FragmentManager a32 = a3();
        jo.p.g(a32, "supportFragmentManager");
        if (v0.c(l42, a32, j4() + Referer.FOLLOW, false, 4, null)) {
            uo.l.d(this, null, null, new e(str, i10, null), 3, null);
        }
    }

    public final pc.u W3() {
        Object value = this.P.getValue();
        jo.p.g(value, "<get-binding>(...)");
        return (pc.u) value;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Integer] */
    public final void X3(int i10) {
        e0 e0Var = new e0();
        if (i10 > 1) {
            e0Var.f38136w = Integer.valueOf(i10);
        }
        uo.l.d(this, null, null, new f(e0Var, i10, null), 3, null);
    }

    public final void Y3(int i10) {
        if (g4().d(i10)) {
            return;
        }
        g4().e(i10, true);
        int d42 = d4();
        if (d42 == 0) {
            b4(m4(), i10);
        } else if (d42 == 1) {
            a4(m4(), i10);
        } else if (d42 == 2) {
            e4(f4());
        } else if (d42 == 3) {
            c4(f4());
        } else if (d42 != 4) {
        } else {
            X3(i10);
        }
    }

    public final q8.a Z3() {
        return (q8.a) this.f24083c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    public final void a4(String str, int i10) {
        e0 e0Var = new e0();
        if (i10 > 1) {
            e0Var.f38136w = Integer.valueOf(i10);
        }
        uo.l.d(this, null, null, new g(str, e0Var, i10, null), 3, null);
    }

    @Override // ie.f.b
    public void b(String str) {
        jo.p.h(str, "tag");
        if (jo.p.c(str, "block_confirm") ? true : jo.p.c(str, "unblock_confirm")) {
            dq.c.c().l(new nd.e());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Integer] */
    public final void b4(String str, int i10) {
        e0 e0Var = new e0();
        if (i10 > 1) {
            e0Var.f38136w = Integer.valueOf(i10);
        }
        uo.l.d(this, null, null, new h(str, e0Var, i10, null), 3, null);
    }

    @Override // ie.f.b
    public void c(String str) {
        jo.p.h(str, "tag");
    }

    public final void c4(String str) {
        u4();
        uo.l.d(this, null, null, new i(str, 0, null), 3, null);
    }

    public final int d4() {
        return ((Number) this.R.getValue()).intValue();
    }

    public final void e4(String str) {
        u4();
        uo.l.d(this, null, null, new j(str, 0, null), 3, null);
    }

    public final String f4() {
        return (String) this.S.getValue();
    }

    public final j0 g4() {
        return (j0) this.V.getValue();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    public final g0 h4() {
        return (g0) this.f24084d0.getValue();
    }

    public final a0 i4() {
        return (a0) this.f24085e0.getValue();
    }

    public final String j4() {
        int d42 = d4();
        return d42 != 0 ? d42 != 1 ? d42 != 2 ? d42 != 3 ? d42 != 4 ? d42 != 5 ? Referer.FOLLOWING : Referer.LIVE_REQUEST_USERS : Referer.BLOCKEDUSERS : Referer.KICKEDUSERS : Referer.NEWFOLLOWERS : Referer.FOLLOWER : Referer.FOLLOWING;
    }

    public final MRRequest k4() {
        return (MRRequest) this.Z.getValue();
    }

    public final v0 l4() {
        return (v0) this.f24082b0.getValue();
    }

    public final String m4() {
        return (String) this.Q.getValue();
    }

    public final x n4() {
        return (x) this.f24081a0.getValue();
    }

    public final void o4() {
        int i10;
        int i11;
        int d42 = d4();
        if (d42 == 0) {
            i10 = nc.i.text_following;
            i11 = this.T ? nc.i.text_no_follow_me : nc.i.text_no_follow;
        } else if (d42 != 1) {
            if (d42 == 2) {
                i10 = nc.i.text_nortifications_newfollower;
            } else if (d42 == 3) {
                i10 = nc.i.text_kick_list;
            } else if (d42 == 4) {
                i10 = nc.i.text_blocklist_title;
                i11 = nc.i.text_no_blocking;
            } else if (d42 != 5) {
                i10 = nc.i.text_following;
            } else {
                i10 = nc.i.text_live_request_user;
            }
            i11 = 0;
        } else {
            i10 = nc.i.S2;
            i11 = this.T ? nc.i.text_no_follower_me : nc.i.text_no_follower;
        }
        Toolbar toolbar = W3().K.B;
        toolbar.setNavigationIcon(nc.d.f41815v);
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(toolbar.getResources().getString(i10));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: oc.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileUserListActivity.p4(ProfileUserListActivity.this, view);
            }
        });
        g4().c();
        if (i11 != 0) {
            W3().I.C.setText(i11);
            W3().I.u().setEnabled(true);
        } else {
            W3().I.u().setEnabled(false);
        }
        W3().H.setOnScrollListener(this);
        W3().H.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: oc.d
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j10) {
                ProfileUserListActivity.q4(ProfileUserListActivity.this, adapterView, view, i12, j10);
            }
        });
        if (d4() == 5) {
            g0 h42 = h4();
            String stringExtra = getIntent().getStringExtra("EXTRA_LIVE_REQUEST_REFERER");
            if (stringExtra == null) {
                stringExtra = "";
            }
            h42.e(stringExtra, f4());
            return;
        }
        Y3(g4().b());
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 140) {
            new jn.f().f(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        W3().B.setOnClickListener(new View.OnClickListener() { // from class: oc.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileUserListActivity.r4(ProfileUserListActivity.this, view);
            }
        });
        o4();
        uo.l.d(this, null, null, new m(null), 3, null);
        this.T = jo.p.c(m4(), n4().T4());
    }

    @dq.l
    public final void onEvent(nd.g gVar) {
        jo.p.h(gVar, "event");
        this.X = gVar;
        if (gVar.b()) {
            f.a aVar = ie.f.V0;
            String string = getString(nc.i.f41871a);
            jo.p.g(string, "getString(R.string.block_confirmation_viewer)");
            f.a.b(aVar, string, getString(nc.i.f41891u), null, null, false, 24, null).z3(a3(), "block_confirm");
            return;
        }
        f.a aVar2 = ie.f.V0;
        String string2 = getString(nc.i.f41877f1);
        jo.p.g(string2, "getString(R.string.text_confirmation_unblock)");
        f.a.b(aVar2, string2, getString(nc.i.U5), null, null, false, 24, null).z3(a3(), "unblock_confirm");
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPause() {
        super.onPause();
        dq.c.c().r(this);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onResume() {
        super.onResume();
        dq.c.c().p(this);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        String f10;
        jo.p.h(absListView, "absListView");
        if (i12 == i10 + i11) {
            if (d4() == 5) {
                if (jo.p.c(i4().l().f(), Boolean.TRUE) || (f10 = i4().k().f()) == null) {
                    return;
                }
                if ((f10.length() == 0) || jo.p.c(f10, "0") || jo.p.c(f10, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                    return;
                }
                g0 h42 = h4();
                String stringExtra = getIntent().getStringExtra("EXTRA_LIVE_REQUEST_REFERER");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                h42.d(stringExtra, f10, f4());
            } else if (g4().a()) {
            } else {
                Y3(g4().b());
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i10) {
        jo.p.h(absListView, "absListView");
    }

    public final void s4(int i10, String str, boolean z10) {
        we.f fVar = this.U;
        we.f fVar2 = null;
        if (fVar == null) {
            jo.p.v("userListAdapter");
            fVar = null;
        }
        UrgeUser item = fVar.getItem(i10);
        if (jo.p.c(item.getUserId(), str)) {
            item.setBlocking(z10);
            we.f fVar3 = this.U;
            if (fVar3 == null) {
                jo.p.v("userListAdapter");
            } else {
                fVar2 = fVar3;
            }
            fVar2.notifyDataSetChanged();
            return;
        }
        g9.a.f32826a.b("block user_id is different", new Object[0]);
    }

    public final void t4(int i10, String str, boolean z10) {
        we.f fVar = this.U;
        we.f fVar2 = null;
        if (fVar == null) {
            jo.p.v("userListAdapter");
            fVar = null;
        }
        UrgeUser item = fVar.getItem(i10);
        if (jo.p.c(item.getUserId(), str)) {
            item.setFollowing(z10);
            we.f fVar3 = this.U;
            if (fVar3 == null) {
                jo.p.v("userListAdapter");
            } else {
                fVar2 = fVar3;
            }
            fVar2.notifyDataSetChanged();
            return;
        }
        g9.a.f32826a.b("follow user_id is different", new Object[0]);
    }

    public final void u4() {
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

    public final void v4(int i10, String str) {
        uo.l.d(this, null, null, new u(str, i10, null), 3, null);
    }

    public final void w4(int i10, String str) {
        uo.l.d(this, null, null, new v(str, i10, null), 3, null);
    }

    public final void x4() {
        if (W3().I.u().isEnabled()) {
            View u10 = W3().I.u();
            we.f fVar = this.U;
            if (fVar == null) {
                jo.p.v("userListAdapter");
                fVar = null;
            }
            u10.setVisibility(fVar.isEmpty() ? 0 : 8);
        }
    }

    public final void y4() {
        runOnUiThread(new Runnable() { // from class: oc.f
            @Override // java.lang.Runnable
            public final void run() {
                ProfileUserListActivity.z4(ProfileUserListActivity.this);
            }
        });
    }

    @dq.l
    public final void onEvent(nd.e eVar) {
        jo.p.h(eVar, "event");
        nd.g gVar = this.X;
        if (gVar != null) {
            jo.p.e(gVar);
            we.f fVar = this.U;
            if (fVar == null) {
                jo.p.v("userListAdapter");
                fVar = null;
            }
            UrgeUser item = fVar.getItem(gVar.a());
            if (gVar.b()) {
                T3(gVar.a(), item.getUserId());
            } else {
                v4(gVar.a(), item.getUserId());
            }
        }
    }
}
