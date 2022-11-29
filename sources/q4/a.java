package q4;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import b3.i;
import b3.j;
import p4.f;
import p4.g;
import p4.h;

/* loaded from: classes.dex */
public class a extends j.f {

    /* renamed from: e  reason: collision with root package name */
    public int[] f48717e = null;

    /* renamed from: f  reason: collision with root package name */
    public MediaSessionCompat.Token f48718f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f48719g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f48720h;

    @Override // b3.j.f
    public void b(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            iVar.a().setStyle(m(new Notification.MediaStyle()));
        } else if (this.f48719g) {
            iVar.a().setOngoing(true);
        }
    }

    @Override // b3.j.f
    public RemoteViews i(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return n();
    }

    @Override // b3.j.f
    public RemoteViews j(i iVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return o();
    }

    public Notification.MediaStyle m(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f48717e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f48718f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.getToken());
        }
        return mediaStyle;
    }

    public RemoteViews n() {
        int min = Math.min(this.f16846a.f16821b.size(), 5);
        RemoteViews c10 = c(false, q(min), false);
        c10.removeAllViews(f.f45785d);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                c10.addView(f.f45785d, p(this.f16846a.f16821b.get(i10)));
            }
        }
        if (this.f48719g) {
            int i11 = f.f45783b;
            c10.setViewVisibility(i11, 0);
            c10.setInt(i11, "setAlpha", this.f16846a.f16820a.getResources().getInteger(g.f45787a));
            c10.setOnClickPendingIntent(i11, this.f48720h);
        } else {
            c10.setViewVisibility(f.f45783b, 8);
        }
        return c10;
    }

    public RemoteViews o() {
        RemoteViews c10 = c(false, r(), true);
        int size = this.f16846a.f16821b.size();
        int[] iArr = this.f48717e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        c10.removeAllViews(f.f45785d);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                if (i10 < size) {
                    c10.addView(f.f45785d, p(this.f16846a.f16821b.get(this.f48717e[i10])));
                } else {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i10), Integer.valueOf(size - 1)));
                }
            }
        }
        if (this.f48719g) {
            c10.setViewVisibility(f.f45784c, 8);
            int i11 = f.f45783b;
            c10.setViewVisibility(i11, 0);
            c10.setOnClickPendingIntent(i11, this.f48720h);
            c10.setInt(i11, "setAlpha", this.f16846a.f16820a.getResources().getInteger(g.f45787a));
        } else {
            c10.setViewVisibility(f.f45784c, 0);
            c10.setViewVisibility(f.f45783b, 8);
        }
        return c10;
    }

    public final RemoteViews p(j.a aVar) {
        boolean z10 = aVar.a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f16846a.f16820a.getPackageName(), h.f45788a);
        int i10 = f.f45782a;
        remoteViews.setImageViewResource(i10, aVar.e());
        if (!z10) {
            remoteViews.setOnClickPendingIntent(i10, aVar.a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i10, aVar.j());
        }
        return remoteViews;
    }

    public int q(int i10) {
        if (i10 <= 3) {
            return h.f45790c;
        }
        return h.f45789b;
    }

    public int r() {
        return h.f45791d;
    }

    public a s(PendingIntent pendingIntent) {
        this.f48720h = pendingIntent;
        return this;
    }

    public a t(MediaSessionCompat.Token token) {
        this.f48718f = token;
        return this;
    }

    public a u(int... iArr) {
        this.f48717e = iArr;
        return this;
    }

    public a v(boolean z10) {
        if (Build.VERSION.SDK_INT < 21) {
            this.f48719g = z10;
        }
        return this;
    }
}
