package com.redhat.ceylon.compiler.java.runtime.metamodel;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

import ceylon.language.metamodel.Annotated;
import ceylon.language.metamodel.Annotated$impl;
import ceylon.language.metamodel.untyped.Parameter;
import ceylon.language.metamodel.untyped.Parameter$impl;
import ceylon.language.metamodel.untyped.Type;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;

@Ceylon(major = 5)
@com.redhat.ceylon.compiler.java.metadata.Class
public class FreeParameter implements Parameter, ReifiedType, Annotated, AnnotationBearing {

    @Ignore
    public static final TypeDescriptor $TypeDescriptor = TypeDescriptor.klass(FreeParameter.class);
    private com.redhat.ceylon.compiler.typechecker.model.Parameter declaration;
    private Type type;
    private Annotation[] annotations;
    
    FreeParameter(com.redhat.ceylon.compiler.typechecker.model.Parameter declaration,
            java.lang.annotation.Annotation[] annotations){
        this.declaration = declaration;
        this.type = Metamodel.getMetamodel(declaration.getType());
        this.annotations = annotations;
    }
    
    @Override
    @Ignore
    public Parameter$impl $ceylon$language$metamodel$untyped$Parameter$impl() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    @Ignore
    public Annotated$impl $ceylon$language$metamodel$Annotated$impl() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    @Ignore
    public java.lang.annotation.Annotation[] $getJavaAnnotations() {
        return annotations;
    }

    @Override
    @TypeInfo("ceylon.language::String")
    public String getName() {
        return declaration.getName();
    }

    @Override
    @TypeInfo("ceylon.language.metamodel.untyped::Type")
    public Type getType() {
        return type;
    }

    @Override
    public TypeDescriptor $getType() {
        return $TypeDescriptor;
    }

}