package com.dsmviewer.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

import com.dsmviewer.Activator;

public class StepForwardAction extends Action {

    @Override
    public void run() {

    }

    @Override
    public ImageDescriptor getImageDescriptor() {
        return Activator.getImageDescriptorFromRegistry("step_forward.png");
    }

}
