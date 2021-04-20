<%-- 
    Document   : side navigation menu
    Created on : Mar 1, 2021, 1:42:44 PM
    Author     : Nhu Phan
--%>
<div class="row">
            <div class="col-lg-2">
                <ul class="nav navbar-light bg-light navbar-expand-lg" style="height: 100%;">
                    <div class="collapse navbar-collapse flex-column" id="sidemenu">
                        <li class="nav-item d-flex flex-row mt-lg-4">
                            <span class="material-icons md-dark p-2">
                                assignment
                            </span>
                            <a class="nav-link active" 
                               style="color: black;font-weight: bolder;"
                            >
                                Report
                            </a>
                        </li>
                        <li class="nav-item d-flex flex-row">
                            <span class="material-icons md-dark p-2">
                                local_shipping
                            </span>
                            <a class="nav-link text-dark" 
                               href="NavigationServices?goToDeliverySchedule=true&loginUserEmail=${sessionScope.email}"
                            >
                                Delivery Schedule
                            </a>
                        </li>
                        <li class="nav-item d-flex flex-row">
                            <span class="material-icons md-dark p-2">
                                people
                            </span>
                            <a class="nav-link text-dark" 
                               href="NavigationServices?goToManageClients=true&loginUserEmail=${sessionScope.email}"
                            >
                                Manage Clients
                            </a>
                        </li>
                        <li class="nav-item d-flex flex-row">
                            <span class="material-icons md-dark p-2">
                                breakfast_dining
                            </span>
                            <a class="nav-link text-dark" 
                               href="NavigationServices?goToManageProducts=true&loginUserEmail=${sessionScope.email}"
                            >
                                Manage Products
                            </a>
                        </li>
                        <li class="nav-item d-flex flex-row">
                            <span class="material-icons md-dark p-2">
                                perm_identity
                            </span>
                            <a class="nav-link text-dark" 
                               href="LoginServices?logout=true&loginUserEmail=${sessionScope.email}"
                            >
                                Log Out
                            </a>
                        </li>
                    </div>
                </ul>
            </div>
