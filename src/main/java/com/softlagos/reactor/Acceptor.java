/**
 * Copyright (C) 1999-2016 Rubens Gomes <rubens.s.gomes@gmail.com>.
 * All Rights Reserved.
 *
 * File: Acceptor.java
 *
 * Author: Rubens Gomes
 */
package com.softlagos.reactor;

/**
 * The Acceptor type used for initializing network services.
 * <p>
 * The purpose of the Acceptor class is to decouple the passive
 * initialization of a service from the tasks performed once a
 * service is initialized.  For instance, the acceptor object
 * handles a connection dispatched from the Reactor object.
 * While handling the connection event the Acceptor creates the
 * Service Handler using a creation strategy (on demand,
 * singleton, thread pool) and delegates to that Service Handler
 * to implement the client-server communication protocol.
 *
 * @author Rubens Gomes
 */
public abstract class Acceptor
  extends EventHandler
{

    /**
     * Initializes the acceptor by creating and binding to
     * to a server socket using the given port number,
     * and then registering itself with the given reactor.
     *
     * @param port_nr the port_nr the IO Handle will bind to.
     * @param reactor the reactor the Reactor that handles events
     * and dispatches to pre-registered Acceptor Event Handlers.
     * @param factory the factory that uses different strategies to
     * create and activate service handlers.
     */
    public abstract void open(int port_nr,
            final Reactor reactor,
            final AcceptorStrategyAbstractFactory factory);

}
