package rp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import rp.y;

@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class s extends r {
    @Override // rp.r, rp.i
    public void c(y yVar, y yVar2) {
        jo.p.h(yVar, "source");
        jo.p.h(yVar2, "target");
        try {
            Files.move(yVar.s(), yVar2.s(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e10) {
            throw new FileNotFoundException(e10.getMessage());
        }
    }

    @Override // rp.r, rp.i
    public h m(y yVar) {
        jo.p.h(yVar, "path");
        Path s10 = yVar.s();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(s10, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(s10) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            y f10 = readSymbolicLink == null ? null : y.a.f(y.f51736x, readSymbolicLink, false, 1, null);
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long u10 = creationTime == null ? null : u(creationTime);
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long u11 = lastModifiedTime == null ? null : u(lastModifiedTime);
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new h(isRegularFile, isDirectory, f10, valueOf, u10, u11, lastAccessTime != null ? u(lastAccessTime) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // rp.r
    public String toString() {
        return "NioSystemFileSystem";
    }

    public final Long u(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }
}
