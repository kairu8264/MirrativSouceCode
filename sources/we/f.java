package we;

import ae.s7;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.net.api.response.user.UrgeUser;
import com.dena.mirrorman.net.api.response.user.UrgeUserReason;
import com.dena.mirrorman.net.api.response.user.UserBadgeImageUrl;
import com.dena.mirrorman.net.glide.GlideApp;
import hf.v0;
import io.p;
import java.util.ArrayList;
import java.util.List;
import jo.f0;
import jo.h;
import jo.q;
import nd.b1;
import nd.d1;
import nd.f1;
import nd.w0;
import nd.y0;
import oq.a;
import wn.v;
import xn.a0;

/* loaded from: classes2.dex */
public final class f extends BaseAdapter implements oq.a {
    public final boolean A;
    public final wn.f B;
    public s7 C;
    public p<? super Integer, ? super Boolean, v> D;

    /* renamed from: w  reason: collision with root package name */
    public List<UrgeUser> f58671w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f58672x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f58673y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f58674z;

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ oq.a f58675w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f58676x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f58677y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oq.a aVar, vq.a aVar2, io.a aVar3) {
            super(0);
            this.f58675w = aVar;
            this.f58676x = aVar2;
            this.f58677y = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            xq.a b10;
            oq.a aVar = this.f58675w;
            vq.a aVar2 = this.f58676x;
            io.a<? extends uq.a> aVar3 = this.f58677y;
            if (aVar instanceof oq.b) {
                b10 = ((oq.b) aVar).e();
            } else {
                b10 = aVar.getKoin().e().b();
            }
            return b10.c(f0.b(v0.class), aVar2, aVar3);
        }
    }

    public /* synthetic */ f(List list, boolean z10, boolean z11, boolean z12, boolean z13, int i10, h hVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list, z10, z11, z12, z13);
    }

    public static final void i(int i10, UrgeUser urgeUser, View view) {
        jo.p.h(urgeUser, "$item");
        dq.c.c().l(new nd.g(i10, !urgeUser.isBlocking()));
    }

    public static final void j(f fVar, int i10, UrgeUser urgeUser, View view) {
        jo.p.h(fVar, "this$0");
        jo.p.h(urgeUser, "$item");
        p<? super Integer, ? super Boolean, v> pVar = fVar.D;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i10), Boolean.valueOf(!urgeUser.isFollowing()));
        }
    }

    public final void c(List<UrgeUser> list) {
        jo.p.h(list, "items");
        this.f58671w.addAll(list);
        notifyDataSetChanged();
    }

    public final void d() {
        this.f58671w.clear();
    }

    public final s7 f() {
        s7 s7Var = this.C;
        if (s7Var != null) {
            return s7Var;
        }
        jo.p.v("binding");
        return null;
    }

    @Override // android.widget.Adapter
    /* renamed from: g */
    public UrgeUser getItem(int i10) {
        return this.f58671w.get(i10);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f58671w.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    @Override // android.widget.Adapter
    public View getView(final int i10, View view, ViewGroup viewGroup) {
        jo.p.h(viewGroup, "parent");
        if (view != null) {
            Object tag = view.getTag();
            jo.p.f(tag, "null cannot be cast to non-null type com.dena.mirrorman.databinding.ItemUserBinding");
            o((s7) tag);
        } else {
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), b1.item_user, viewGroup, false);
            jo.p.g(e10, "inflate(LayoutInflater.f…item_user, parent, false)");
            o((s7) e10);
            f().u().setTag(f());
        }
        if (!l(i10)) {
            View u10 = f().u();
            jo.p.g(u10, "binding.root");
            return u10;
        }
        final UrgeUser urgeUser = this.f58671w.get(i10);
        f().N.setText(urgeUser.getName());
        f().H.setText(urgeUser.getDescription());
        UrgeUserReason reason = urgeUser.getReason();
        if (!TextUtils.isEmpty(reason != null ? reason.getText() : null)) {
            f().M.setVisibility(0);
            AppCompatTextView appCompatTextView = f().M;
            UrgeUserReason reason2 = urgeUser.getReason();
            appCompatTextView.setText(reason2 != null ? reason2.getText() : null);
            UrgeUserReason reason3 = urgeUser.getReason();
            if (reason3 != null) {
                int color = reason3.getColor();
                AppCompatTextView appCompatTextView2 = f().M;
                appCompatTextView2.setTextColor(Color.parseColor('#' + Integer.toHexString(color)));
            }
            f().M.setBackgroundColor(c3.a.d(viewGroup.getContext(), w0.X0));
        } else {
            f().M.setVisibility(8);
        }
        GlideApp.with(f().u()).load(urgeUser.getProfileImageUrl()).placeholder(y0.W1).apply((e8.a<?>) new e8.h().circleCrop()).into(f().L).a();
        UserBadgeImageUrl userBadgeImageUrl = (UserBadgeImageUrl) a0.Z(urgeUser.getBadges());
        String imageUrl = userBadgeImageUrl != null ? userBadgeImageUrl.getImageUrl() : null;
        if (imageUrl == null || imageUrl.length() == 0) {
            f().B.setVisibility(8);
        } else {
            of.f fVar = of.f.f45394a;
            Context context = viewGroup.getContext();
            jo.p.g(context, "parent.context");
            fVar.c(context, urgeUser.getBadges().get(0).getImageUrl(), f().B);
            f().B.setVisibility(0);
        }
        if (this.f58673y) {
            f().I.setVisibility(8);
            f().D.setVisibility(0);
            f().E.setVisibility(0);
            if (urgeUser.isBlocking()) {
                f().D.setImageResource(d1.btn_block_selected);
                f().E.setText(f1.text_blocklist_unblock_btn);
                f().E.setTextColor(c3.a.d(viewGroup.getContext(), w0.K0));
            } else {
                f().D.setImageResource(d1.btn_block_select);
                f().E.setText(f1.text_blocklist_block_btn);
                f().E.setTextColor(c3.a.d(viewGroup.getContext(), w0.L0));
            }
            f().D.setOnClickListener(new View.OnClickListener() { // from class: we.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.i(i10, urgeUser, view2);
                }
            });
        } else {
            f().D.setVisibility(8);
            f().E.setVisibility(8);
            if (this.f58672x && !h().i(urgeUser.getUserId())) {
                f().I.setVisibility(0);
                if (urgeUser.isFollowing()) {
                    f().I.setImageResource(d1.f41950d);
                } else {
                    f().I.setImageResource(d1.f41949c);
                }
            } else {
                f().I.setVisibility(8);
            }
            f().I.setOnClickListener(new View.OnClickListener() { // from class: we.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    f.j(f.this, i10, urgeUser, view2);
                }
            });
            f().J.setVisibility(8);
            if (this.f58674z && urgeUser.isFollower()) {
                f().J.setVisibility(0);
            }
        }
        if (this.A) {
            f().K.setVisibility(0);
            f().K.setEnabled(v0.f35614h.a(urgeUser));
        } else {
            f().K.setVisibility(8);
        }
        View u11 = f().u();
        jo.p.g(u11, "binding.root");
        return u11;
    }

    public final v0 h() {
        return (v0) this.B.getValue();
    }

    public final void k(UrgeUser urgeUser, int i10) {
        jo.p.h(urgeUser, "item");
        this.f58671w.add(i10, urgeUser);
    }

    public final boolean l(int i10) {
        boolean z10;
        synchronized (this.f58671w) {
            if (i10 >= 0) {
                z10 = i10 < this.f58671w.size() ? true : true;
            }
            z10 = false;
        }
        return z10;
    }

    public final boolean m() {
        return this.f58673y;
    }

    public final void n(UrgeUser urgeUser) {
        jo.p.h(urgeUser, "item");
        this.f58671w.remove(urgeUser);
    }

    public final void o(s7 s7Var) {
        jo.p.h(s7Var, "<set-?>");
        this.C = s7Var;
    }

    public final void p(p<? super Integer, ? super Boolean, v> pVar) {
        this.D = pVar;
    }

    public final void q(int i10, boolean z10) {
        if (l(i10)) {
            synchronized (this.f58671w) {
                UrgeUser urgeUser = this.f58671w.get(i10);
                urgeUser.setFollowing(z10);
                this.f58671w.set(i10, urgeUser);
                notifyDataSetChanged();
                v vVar = v.f59242a;
            }
        }
    }

    public f(List<UrgeUser> list, boolean z10, boolean z11, boolean z12, boolean z13) {
        jo.p.h(list, "items");
        this.f58671w = list;
        this.f58672x = z10;
        this.f58673y = z11;
        this.f58674z = z12;
        this.A = z13;
        this.B = wn.g.b(cr.a.f28611a.b(), new a(this, null, null));
    }
}
