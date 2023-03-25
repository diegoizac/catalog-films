package br.com.catalogo.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\tH\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lbr/com/catalogo/domain/Store;", "", "id", "", "managerStaffId", "Lbr/com/catalogo/domain/Staff;", "addressId", "Lbr/com/catalogo/domain/Address;", "lastUpdate", "Ljava/time/LocalDateTime;", "(ILbr/com/catalogo/domain/Staff;Lbr/com/catalogo/domain/Address;Ljava/time/LocalDateTime;)V", "getAddressId", "()Lbr/com/catalogo/domain/Address;", "getId", "()I", "getLastUpdate", "()Ljava/time/LocalDateTime;", "getManagerStaffId", "()Lbr/com/catalogo/domain/Staff;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app"})
public final class Store {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final br.com.catalogo.domain.Staff managerStaffId = null;
    @org.jetbrains.annotations.NotNull
    private final br.com.catalogo.domain.Address addressId = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime lastUpdate = null;
    
    @org.jetbrains.annotations.NotNull
    public final br.com.catalogo.domain.Store copy(int id, @org.jetbrains.annotations.NotNull
    br.com.catalogo.domain.Staff managerStaffId, @org.jetbrains.annotations.NotNull
    br.com.catalogo.domain.Address addressId, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime lastUpdate) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Store(int id, @org.jetbrains.annotations.NotNull
    br.com.catalogo.domain.Staff managerStaffId, @org.jetbrains.annotations.NotNull
    br.com.catalogo.domain.Address addressId, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime lastUpdate) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.catalogo.domain.Staff component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.catalogo.domain.Staff getManagerStaffId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.catalogo.domain.Address component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final br.com.catalogo.domain.Address getAddressId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getLastUpdate() {
        return null;
    }
}