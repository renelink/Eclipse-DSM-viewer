package com.dsmviewer.ui.action;

import com.dsmviewer.dsm.DependencyMatrixOrdering;
import com.dsmviewer.ui.dsmtable.DsmTableController;

/**
 * 
 * @author <a href="mailto:Daniil.Yaroslavtsev@gmail.com"> Daniil Yaroslavtsev</a>
 */
public class SortDependencyMatrixByInstabilityAction extends AbstractSortDependencyMatrixAction {

    public SortDependencyMatrixByInstabilityAction(DsmTableController dsmTableController) {
        super(dsmTableController);
    }

    @Override
    public DependencyMatrixOrdering getDependencyMatrixOrdering() {
        return DependencyMatrixOrdering.BY_INSTABILITY;
    }

    @Override
    public String getToolTipText() {
        return "Sort by instability index";
    }

}
