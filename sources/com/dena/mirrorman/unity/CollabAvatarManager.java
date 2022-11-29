package com.dena.mirrorman.unity;

import ao.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.h;
import jo.p;
import nf.c;
import nf.k;
import oq.a;
import uo.b0;
import uo.g1;
import uo.i2;
import uo.k0;
import uo.l;
import uo.q0;
import wn.f;
import wn.v;

/* loaded from: classes3.dex */
public final class CollabAvatarManager implements a, q0 {
    private static final int DEFAULT_SLOT = 1;
    private static final int MAX_AVATAR_NUM = 3;
    private static final int SECOND_SLOT = 2;
    private static final int THIRD_SLOT = 3;
    private final f castServiceStore$delegate;
    private List<CollabAvatar> collabAvatarList;
    private final g coroutineContext;
    private final f featureStore$delegate;
    private boolean isStopped;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public CollabAvatarManager() {
        b0 b10;
        k0 b11 = g1.b();
        b10 = i2.b(null, 1, null);
        this.coroutineContext = b11.plus(b10);
        this.collabAvatarList = new ArrayList();
        cr.a aVar = cr.a.f28611a;
        this.castServiceStore$delegate = wn.g.b(aVar.b(), new CollabAvatarManager$special$$inlined$inject$default$1(this, null, null));
        this.featureStore$delegate = wn.g.b(aVar.b(), new CollabAvatarManager$special$$inlined$inject$default$2(this, null, null));
    }

    private final int collabSlot() {
        boolean z10;
        boolean z11;
        boolean z12;
        List<CollabAvatar> list = this.collabAvatarList;
        boolean z13 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (CollabAvatar collabAvatar : list) {
                if (collabAvatar.getSlot() == 1) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (z11) {
            return 1;
        }
        List<CollabAvatar> list2 = this.collabAvatarList;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (CollabAvatar collabAvatar2 : list2) {
                if (collabAvatar2.getSlot() == 2) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    break;
                }
            }
        }
        z13 = true;
        return z13 ? 2 : 3;
    }

    private final c getCastServiceStore() {
        return (c) this.castServiceStore$delegate.getValue();
    }

    private final k getFeatureStore() {
        return (k) this.featureStore$delegate.getValue();
    }

    public final void add(CollabAvatar collabAvatar) {
        boolean z10;
        p.h(collabAvatar, "collabAvatar");
        if (getFeatureStore().g() && this.collabAvatarList.size() < 3) {
            List<CollabAvatar> list = this.collabAvatarList;
            boolean z11 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (CollabAvatar collabAvatar2 : list) {
                    if (collabAvatar2.getUserId() == collabAvatar.getUserId()) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                return;
            }
            synchronized (this.collabAvatarList) {
                collabAvatar.setSlot(collabSlot());
                this.collabAvatarList.add(collabAvatar);
            }
            if (UnityManager.Companion.getInstance().isGroupShot() || p.c(getCastServiceStore().I0().f(), Boolean.TRUE) || this.isStopped) {
                return;
            }
            l.d(this, null, null, new CollabAvatarManager$add$3(collabAvatar, null), 3, null);
        }
    }

    public final void clear() {
        for (CollabAvatar collabAvatar : this.collabAvatarList) {
            UnityManager.Companion.getInstance().unloadAvatarModel(collabAvatar.getSlot());
        }
        UnityManager.Companion.getInstance().setAvatarSlot(0);
        this.collabAvatarList.clear();
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }

    public final void remove(int i10) {
        Object obj;
        boolean z10;
        if (getFeatureStore().g()) {
            synchronized (this.collabAvatarList) {
                Iterator<T> it = this.collabAvatarList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((CollabAvatar) obj).getUserId() == i10) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
                CollabAvatar collabAvatar = (CollabAvatar) obj;
                if (collabAvatar != null) {
                    this.collabAvatarList.remove(collabAvatar);
                    if (!UnityManager.Companion.getInstance().isGroupShot()) {
                        l.d(this, null, null, new CollabAvatarManager$remove$1$2$1(collabAvatar, null), 3, null);
                    }
                    v vVar = v.f59242a;
                }
            }
        }
    }

    public final void restartCollabMode() {
        for (CollabAvatar collabAvatar : this.collabAvatarList) {
            UnityManager.Companion.getInstance().loadAvatarModel(collabAvatar.getClosetAvatarModel(), collabAvatar.getSlot());
        }
        UnityManager.Companion.getInstance().setAvatarSlot(0);
        this.isStopped = false;
    }

    public final void stopCollabMode() {
        for (CollabAvatar collabAvatar : this.collabAvatarList) {
            UnityManager.Companion.getInstance().unloadAvatarModel(collabAvatar.getSlot());
        }
        UnityManager.Companion.getInstance().setAvatarSlot(0);
        this.isStopped = true;
    }
}
