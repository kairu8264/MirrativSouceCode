package bc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.api.response.Genre;
import com.dena.mirrorman.net.api.response.Karaoke;
import com.dena.mirrorman.net.api.response.Singer;
import java.util.List;

/* loaded from: classes2.dex */
public final class h0 extends RecyclerView.h<RecyclerView.e0> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f17322i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f17323j = 8;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17324a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Karaoke> f17325b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Genre> f17326c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Singer> f17327d;

    /* renamed from: e  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17328e;

    /* renamed from: f  reason: collision with root package name */
    public final io.l<Genre, wn.v> f17329f;

    /* renamed from: g  reason: collision with root package name */
    public final io.l<Singer, wn.v> f17330g;

    /* renamed from: h  reason: collision with root package name */
    public final io.l<Karaoke, wn.v> f17331h;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(Context context, List<Karaoke> list, List<Genre> list2, List<Singer> list3, io.l<? super Karaoke, wn.v> lVar, io.l<? super Genre, wn.v> lVar2, io.l<? super Singer, wn.v> lVar3, io.l<? super Karaoke, wn.v> lVar4) {
        jo.p.h(context, "context");
        jo.p.h(list, "songs");
        jo.p.h(list2, "genres");
        jo.p.h(list3, "recommendSingers");
        jo.p.h(lVar, "onClickSong");
        jo.p.h(lVar2, "onClickGenre");
        jo.p.h(lVar3, "onClickSinger");
        jo.p.h(lVar4, "onClickSetting");
        this.f17324a = context;
        this.f17325b = list;
        this.f17326c = list2;
        this.f17327d = list3;
        this.f17328e = lVar;
        this.f17329f = lVar2;
        this.f17330g = lVar3;
        this.f17331h = lVar4;
    }

    public static final void h(h0 h0Var, Singer singer, View view) {
        jo.p.h(h0Var, "this$0");
        jo.p.h(singer, "$singer");
        h0Var.f17330g.invoke(singer);
    }

    public static final void i(h0 h0Var, Karaoke karaoke, View view) {
        jo.p.h(h0Var, "this$0");
        jo.p.h(karaoke, "$song");
        h0Var.f17328e.invoke(karaoke);
    }

    public static final void j(h0 h0Var, Karaoke karaoke, View view) {
        jo.p.h(h0Var, "this$0");
        jo.p.h(karaoke, "$song");
        h0Var.f17331h.invoke(karaoke);
    }

    public final int d() {
        if (this.f17327d.isEmpty()) {
            return 3;
        }
        return this.f17327d.size() + 4;
    }

    public final boolean f(int i10) {
        return i10 == this.f17327d.size() + 3;
    }

    public final boolean g(int i10) {
        return i10 >= 3 && i10 < this.f17327d.size() + 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f17325b.size() + d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (!(!this.f17327d.isEmpty())) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? 5 : 4;
                }
                return 1;
            }
            return 0;
        } else if (i10 == 0) {
            return 0;
        } else {
            if (i10 == 1) {
                return 1;
            }
            if (i10 == 2) {
                return 2;
            }
            if (g(i10)) {
                return 3;
            }
            return f(i10) ? 4 : 5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.e0 e0Var, int i10) {
        jo.p.h(e0Var, "holder");
        int itemViewType = getItemViewType(i10);
        if (itemViewType == 0) {
            int i11 = xb.n.ic_recommended_genre;
            String string = this.f17324a.getString(xb.r.text_karaoke_section_genre);
            jo.p.g(string, "context.getString(R.stri…xt_karaoke_section_genre)");
            ((y2) e0Var).a(i11, string);
        } else if (itemViewType == 1) {
            ((w) e0Var).a(this.f17326c, this.f17329f);
        } else if (itemViewType == 2) {
            int i12 = xb.n.ic_recommended_artist;
            String string2 = this.f17324a.getString(xb.r.text_karaoke_recommended_singers);
            jo.p.g(string2, "context.getString(R.stri…aoke_recommended_singers)");
            ((y2) e0Var).a(i12, string2);
        } else if (itemViewType == 3) {
            t1 t1Var = (t1) e0Var;
            final Singer singer = this.f17327d.get(i10 - 3);
            t1Var.a(singer);
            t1Var.d().u().setOnClickListener(new View.OnClickListener() { // from class: bc.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h0.h(h0.this, singer, view);
                }
            });
        } else if (itemViewType == 4) {
            int i13 = xb.n.ic_recommended_song;
            String string3 = this.f17324a.getString(xb.r.text_karaoke_recommended_songs);
            jo.p.g(string3, "context.getString(R.stri…araoke_recommended_songs)");
            ((y2) e0Var).a(i13, string3);
        } else if (itemViewType != 5) {
        } else {
            c0 c0Var = (c0) e0Var;
            final Karaoke karaoke = this.f17325b.get(i10 - d());
            c0Var.a(karaoke);
            c0Var.b().u().setOnClickListener(new View.OnClickListener() { // from class: bc.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h0.i(h0.this, karaoke, view);
                }
            });
            c0Var.b().B.setOnClickListener(new View.OnClickListener() { // from class: bc.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h0.j(h0.this, karaoke, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        jo.p.h(viewGroup, "parent");
        if (i10 != 0) {
            if (i10 == 1) {
                return w.f17501b.a(viewGroup);
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return t1.f17486b.a(viewGroup);
                }
                if (i10 != 4) {
                    if (i10 == 5) {
                        return c0.f17278y.a(viewGroup);
                    }
                    throw new IllegalArgumentException();
                }
            }
        }
        return y2.f17519b.a(viewGroup);
    }
}
