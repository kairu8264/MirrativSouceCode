package b3;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import b3.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16850a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f16851b;

    /* renamed from: c  reason: collision with root package name */
    public final j.e f16852c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f16853d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteViews f16854e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Bundle> f16855f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f16856g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public int f16857h;

    /* renamed from: i  reason: collision with root package name */
    public RemoteViews f16858i;

    public k(j.e eVar) {
        int i10;
        Icon icon;
        List<String> list;
        List<String> e10;
        this.f16852c = eVar;
        this.f16850a = eVar.f16820a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f16851b = new Notification.Builder(eVar.f16820a, eVar.L);
        } else {
            this.f16851b = new Notification.Builder(eVar.f16820a);
        }
        Notification notification = eVar.T;
        this.f16851b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f16828i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f16824e).setContentText(eVar.f16825f).setContentInfo(eVar.f16830k).setContentIntent(eVar.f16826g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f16827h, (notification.flags & 128) != 0).setLargeIcon(eVar.f16829j).setNumber(eVar.f16831l).setProgress(eVar.f16840u, eVar.f16841v, eVar.f16842w);
        if (i11 < 21) {
            this.f16851b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i11 >= 16) {
            this.f16851b.setSubText(eVar.f16837r).setUsesChronometer(eVar.f16834o).setPriority(eVar.f16832m);
            Iterator<j.a> it = eVar.f16821b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = eVar.E;
            if (bundle != null) {
                this.f16856g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.A) {
                    this.f16856g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f16843x;
                if (str != null) {
                    this.f16856g.putString("android.support.groupKey", str);
                    if (eVar.f16844y) {
                        this.f16856g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f16856g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f16845z;
                if (str2 != null) {
                    this.f16856g.putString("android.support.sortKey", str2);
                }
            }
            this.f16853d = eVar.I;
            this.f16854e = eVar.J;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 17) {
            this.f16851b.setShowWhen(eVar.f16833n);
        }
        if (i12 >= 19 && i12 < 21 && (e10 = e(g(eVar.f16822c), eVar.W)) != null && !e10.isEmpty()) {
            this.f16856g.putStringArray("android.people", (String[]) e10.toArray(new String[e10.size()]));
        }
        if (i12 >= 20) {
            this.f16851b.setLocalOnly(eVar.A).setGroup(eVar.f16843x).setGroupSummary(eVar.f16844y).setSortKey(eVar.f16845z);
            this.f16857h = eVar.P;
        }
        if (i12 >= 21) {
            this.f16851b.setCategory(eVar.D).setColor(eVar.F).setVisibility(eVar.G).setPublicVersion(eVar.H).setSound(notification.sound, notification.audioAttributes);
            if (i12 < 28) {
                list = e(g(eVar.f16822c), eVar.W);
            } else {
                list = eVar.W;
            }
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    this.f16851b.addPerson(str3);
                }
            }
            this.f16858i = eVar.K;
            if (eVar.f16823d.size() > 0) {
                Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i13 = 0; i13 < eVar.f16823d.size(); i13++) {
                    bundle4.putBundle(Integer.toString(i13), l.b(eVar.f16823d.get(i13)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
                this.f16856g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = eVar.V) != null) {
            this.f16851b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f16851b.setExtras(eVar.E).setRemoteInputHistory(eVar.f16839t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                this.f16851b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                this.f16851b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                this.f16851b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            this.f16851b.setBadgeIconType(eVar.M).setSettingsText(eVar.f16838s).setShortcutId(eVar.N).setTimeoutAfter(eVar.O).setGroupAlertBehavior(eVar.P);
            if (eVar.C) {
                this.f16851b.setColorized(eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.f16851b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator<n> it2 = eVar.f16822c.iterator();
            while (it2.hasNext()) {
                this.f16851b.addPerson(it2.next().h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            this.f16851b.setAllowSystemGeneratedContextualActions(eVar.R);
            this.f16851b.setBubbleMetadata(j.d.a(eVar.S));
        }
        if (k3.a.c() && (i10 = eVar.Q) != 0) {
            this.f16851b.setForegroundServiceBehavior(i10);
        }
        if (eVar.U) {
            if (this.f16852c.f16844y) {
                this.f16857h = 2;
            } else {
                this.f16857h = 1;
            }
            this.f16851b.setVibrate(null);
            this.f16851b.setSound(null);
            int i16 = notification.defaults & (-2);
            notification.defaults = i16;
            int i17 = i16 & (-3);
            notification.defaults = i17;
            this.f16851b.setDefaults(i17);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f16852c.f16843x)) {
                    this.f16851b.setGroup("silent");
                }
                this.f16851b.setGroupAlertBehavior(this.f16857h);
            }
        }
    }

    public static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        s.b bVar = new s.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> g(List<n> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (n nVar : list) {
            arrayList.add(nVar.g());
        }
        return arrayList;
    }

    @Override // b3.i
    public Notification.Builder a() {
        return this.f16851b;
    }

    public final void b(j.a aVar) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 20) {
            if (i10 >= 16) {
                this.f16855f.add(l.f(this.f16851b, aVar));
                return;
            }
            return;
        }
        IconCompat f10 = aVar.f();
        if (i10 >= 23) {
            builder = new Notification.Action.Builder(f10 != null ? f10.v() : null, aVar.j(), aVar.a());
        } else {
            builder = new Notification.Action.Builder(f10 != null ? f10.h() : 0, aVar.j(), aVar.a());
        }
        if (aVar.g() != null) {
            for (RemoteInput remoteInput : o.b(aVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (aVar.d() != null) {
            bundle = new Bundle(aVar.d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.h());
        if (i11 >= 28) {
            builder.setSemanticAction(aVar.h());
        }
        if (i11 >= 29) {
            builder.setContextual(aVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
        builder.addExtras(bundle);
        this.f16851b.addAction(builder.build());
    }

    public Notification c() {
        Bundle a10;
        RemoteViews k10;
        RemoteViews i10;
        j.f fVar = this.f16852c.f16836q;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews j10 = fVar != null ? fVar.j(this) : null;
        Notification d10 = d();
        if (j10 != null) {
            d10.contentView = j10;
        } else {
            RemoteViews remoteViews = this.f16852c.I;
            if (remoteViews != null) {
                d10.contentView = remoteViews;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 16 && fVar != null && (i10 = fVar.i(this)) != null) {
            d10.bigContentView = i10;
        }
        if (i11 >= 21 && fVar != null && (k10 = this.f16852c.f16836q.k(this)) != null) {
            d10.headsUpContentView = k10;
        }
        if (i11 >= 16 && fVar != null && (a10 = j.a(d10)) != null) {
            fVar.a(a10);
        }
        return d10;
    }

    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f16851b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f16851b.build();
            if (this.f16857h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f16857h == 2) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f16857h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i10 >= 21) {
            this.f16851b.setExtras(this.f16856g);
            Notification build2 = this.f16851b.build();
            RemoteViews remoteViews = this.f16853d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f16854e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f16858i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f16857h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f16857h == 2) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f16857h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i10 >= 20) {
            this.f16851b.setExtras(this.f16856g);
            Notification build3 = this.f16851b.build();
            RemoteViews remoteViews4 = this.f16853d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f16854e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f16857h != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f16857h == 2) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f16857h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i10 >= 19) {
            SparseArray<Bundle> a10 = l.a(this.f16855f);
            if (a10 != null) {
                this.f16856g.putSparseParcelableArray("android.support.actionExtras", a10);
            }
            this.f16851b.setExtras(this.f16856g);
            Notification build4 = this.f16851b.build();
            RemoteViews remoteViews6 = this.f16853d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f16854e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i10 >= 16) {
            Notification build5 = this.f16851b.build();
            Bundle a11 = j.a(build5);
            Bundle bundle = new Bundle(this.f16856g);
            for (String str : this.f16856g.keySet()) {
                if (a11.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a11.putAll(bundle);
            SparseArray<Bundle> a12 = l.a(this.f16855f);
            if (a12 != null) {
                j.a(build5).putSparseParcelableArray("android.support.actionExtras", a12);
            }
            RemoteViews remoteViews8 = this.f16853d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f16854e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        } else {
            return this.f16851b.getNotification();
        }
    }

    public Context f() {
        return this.f16850a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i10 = notification.defaults & (-2);
        notification.defaults = i10;
        notification.defaults = i10 & (-3);
    }
}
