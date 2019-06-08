$(document).ready(function() {
    $('#elanTable').DataTable();
} );

$(document).ready(function() {
    $('#userTable').DataTable();
} );

function showUserDetail(id) {
    window.open('/admin/user/' + id);
}

function showProductDetail(id) {
    window.open('/admin/elan/' + id);
}

function approvedElan(id, status) {
    window.location.href = '/admin/elan/updateAnnStatus/' + id + '/' + status;
}

function pendingElan(id, status) {
    window.location.href = '/admin/elan/updateAnnStatus/' + id + '/' + status;
}

function ignoredElan(id, status) {
    window.location.href = '/admin/elan/updateAnnStatus/' + id + '/' + status;
}

function deletedElan(id, status) {
    window.location.href = '/admin/elan/updateAnnStatus/' + id + '/' + status;
}

function activatedStatus(id, status) {
    window.location.href = '/admin/elan/updateStatus/' + id + '/' + status;
}

function deactivatedStatus(id, status) {
    window.location.href = '/admin/elan/updateStatus/' + id + '/' + status;
}