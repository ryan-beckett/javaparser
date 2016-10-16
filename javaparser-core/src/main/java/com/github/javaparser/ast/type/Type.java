/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2016 The JavaParser Team.
 *
 * This file is part of JavaParser.
 * 
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License 
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */
 
package com.github.javaparser.ast.type;

import com.github.javaparser.Range;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.AnnotationExpr;

import static com.github.javaparser.utils.Utils.*;

/**
 * @author Julio Vilmar Gesser
 */
public abstract class Type<T extends Type> extends Node {

    private NodeList<AnnotationExpr> annotations = new NodeList<>();

    public Type(Range range, NodeList<AnnotationExpr> annotations) {
        super(range);
        setAnnotations(annotations);
    }

    public NodeList<AnnotationExpr> getAnnotations() {
        return annotations;
    }

    public T setAnnotations(NodeList<AnnotationExpr> annotations) {
        this.annotations = assertNotNull(annotations);
        setAsParentNodeOf(annotations);
        return (T) this;
    }
}
